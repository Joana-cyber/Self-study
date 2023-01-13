package org.example.DSA;

public class DoublyLinkedList<T> {
    Node<T> head;

    Node<T> tail;

    private class Node<T>{
        T data;
        Node<T> next;

        Node<T> previous;

        public Node(T data){
          this.data = data;
        }
    }

    public T get(int index){
        if(head == null){
            throw new IndexOutOfBoundsException();
        }

        int count = 0;
        Node<T> current = head;
        while(current != null && count != index){
            current = current.next;
            count ++;
        }

        return current.data;
    }

    public void insert(T item){
        if(head == null) {
            head = new Node(item);
            tail = head;
        }
        else{
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            Node<T> newData = new Node(item);
            current.next = newData;
            newData.previous = current;
            tail = newData;
        }
    }

    public void insert(int index, T item){
        if(index == 0) {
            head = new Node(item);
            tail = head;
        }
        else{
            int count = 0;
            Node<T> current = head;
            while(count != index && current.next != null){
                current = current.next;
                count ++;
            }
            Node<T> newData = new Node(item);

            if(current.next == null){
                current.next = newData;
                newData.previous = current;
                tail = newData;
            }
            else{
                Node<T> temp = current.previous;
                current.previous.next = newData;
                current.previous = newData;
                newData.previous = temp;
                newData.next = current;
            }

        }
    }

    public boolean remove(T item){
        if(head == null){
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;
        while(current.next != null && current != item){
            current = current.next;
        }
        if(current == null || current.next == null) return false;

        current.next = current.next.next;
        current.next.previous = current;
        return true;
    }

//    public boolean remove(int index){
//        if(head == null){
//            throw new IndexOutOfBoundsException();
//        }
//
//        Node<T> current = head;
//        int count = 0;
//        while(current.next != null && count != index){
//            current = current.next;
//            count ++;
//        }
//        if(current == null) return false;
//
//        current.next.previous = current.previous;
//        current.previous.next = current.next;
//
//        return true;
//    }

    public boolean set(T item, T newItem){
        if(head == null){
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;
        while(current.next != null && current != item){
            current = current.next;
        }

        current.data = newItem;
        return true;
    }

    public void printAll(){
        if(head == null){
            throw new IndexOutOfBoundsException();
        }
        else{
            Node<T> current = head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}

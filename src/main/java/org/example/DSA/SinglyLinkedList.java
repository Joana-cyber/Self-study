package org.example.DSA;

public class SinglyLinkedList<E> {
    private Node<E> head;

    private Node<E> tail;

    private int size = 0;

    private static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element){
           this(element, null);
        }

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public int size(){return size;}

    public boolean isEmpty(){return size == 0;}

    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E item){
       head = new Node<>(item, head);
       if(isEmpty()) tail = head;
       size ++;
    }

    public void addLast(E item){
        Node<E> node = new Node<>(item);
        if(isEmpty()){
            head = node;
        }
        else{
            tail.setNext(node);
        }
        tail = node;
        size ++;
    }

    public E removeFirst(){
        if(isEmpty()) return null;

        Node<E> item = head;
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return item.getElement();
    }

    public E removeLast(){
        if(isEmpty()) return null;
        if(size() == 1){
            size--;
            return head.getElement();}
        else{
            Node<E> current = head;
            Node<E> prevNode = null;
            while(current.next != null){
                prevNode = current;
                current = current.getNext();
            }
            size--;
            prevNode.next = null;
            tail = prevNode;
            return current.getElement();
        }
    }
}

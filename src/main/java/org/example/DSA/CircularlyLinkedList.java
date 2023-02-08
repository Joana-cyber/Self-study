package org.example.DSA;
public class CircularlyLinkedList<E>{
    private static class Node<E> {
        private E Element;
        private Node<E> next;

        public Node(E element) {
            this(element, null);
        }

        public Node(E element, Node<E> next) {
            Element = element;
            this.next = next;
        }

        public E getElement() {
            return Element;
        }

        public void setElement(E element) {
            Element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private int size;

    private Node<E> tail;

    public CircularlyLinkedList() {
        size = 0;
        tail = null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public E first(){
        if(isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public void rotate(){
        if(!isEmpty()){
            tail = tail.getNext();
        }
    }

    public void addFirst(E item){
        if(isEmpty()){
            tail = new Node<>(item);
            tail.setNext(tail);
        }
        else{
            Node<E> node = new Node<>(item, tail.getNext());
            tail.setNext(node);
        }
        size++;
    }

    public void addLast(E item){
        addFirst(item);
        tail = tail.getNext();
    }

    public E removeFirst(){
        if(tail == null) return null;
        Node<E> head = tail.getNext();
        if(head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    public E removeLast(){
        if(tail == null) return null;
        Node<E> current = tail.getNext();
        while(current.getNext() != tail){
            current = current.getNext();
        }
        current.setNext(tail.getNext());
        E item = tail.getElement();
        tail = current;
        return item;
    }

    public void printAll(){
        Node<E> current = tail.getNext();
        do{
            System.out.println(current.getElement());
            current = current.getNext();
        }while(current != tail.getNext());
    }
}

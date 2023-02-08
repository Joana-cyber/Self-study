package org.example.DSA;

public class DoublyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> header;
    private Node<E> trailer;

    private int size = 0;

    public DoublyLinkedList(){
       header = new Node<>(null, null, null);
       trailer = new Node<>(null, header, null);
       header.setNext(trailer);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    private E first(){
        if(size == 0) return null;
        return header.getNext().getElement();
    }

    private E last(){
        if(size == 0) return null;
        return trailer.getPrev().getElement();
    }

    public void addFirst(E item){
        Node<E> node = new Node<>(item, header, header.getNext());
        header.getNext().setPrev(node);
        header.setNext(node);
        size++;
    }

    public void addLast(E item){
        Node<E> node = new Node<>(item, trailer.getPrev(), trailer);
        trailer.getPrev().setNext(node);
        trailer.setPrev(node);
        size++;
    }

    public void addNth(int position, E item){
        if(position > size) System.out.println("Position exceeds length, size is " + size);
        else{
            Node<E> node = new Node<>(item, null, null);
            Node<E> current = header.getNext();
            for(int i = 1; i < position; i++){
                current = current.getNext();
            }
            node.setPrev(current.getPrev());
            node.setNext(current);
            current.getPrev().setNext(node);
            current.setPrev(node);
            size++;
        }
    }

    public void removeFirst(){
        Node<E> newHead = header.getNext().getNext();
        newHead.setPrev(header);
        header.setNext(newHead);
        size--;
    }

    public void removeLast(){
        Node<E> newTail = trailer.getPrev().getPrev();
        newTail.setNext(trailer);
        trailer.setPrev(newTail);
        size--;
    }

    public E removeNth(int position){
        if(position > size) return null;
        Node<E> current = header.getNext();
        for(int i = 1; i < position; i++){
            current = current.getNext();
        }
        current.getNext().setPrev(current.getPrev());
        current.getPrev().setNext(current.getNext());
        size--;
        return current.getElement();
    }

    public void printAll(){
        Node<E> current = header.getNext();
        while(current != trailer){
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }


}

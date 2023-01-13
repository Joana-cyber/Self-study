package org.example;

import org.example.DSA.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
//        Array<Integer> integers = new Array<>();
//        System.out.println(integers.isEmpty());
//        integers.add(1);
//        integers.add(3);
//        integers.add(4);
//        integers.add(5);
//        integers.add(1, 2);
//        integers.printAll();
//        Object a = 5;
//        System.out.println(integers.remove(a));
//        integers.printAll();
//        System.out.println("Size after removing 5: " + integers.getSize());
//        integers.remove(2);
////        integers.remove();
//        integers.printAll();
//        System.out.println("Size after removing 3: " + integers.getSize());
//        System.out.println(integers.getCapacity());
//        integers.add(6);
//        integers.add(8);
//        integers.add(6, 7);
//        integers.add(5);
//        integers.add(1, 2);

        DoublyLinkedList<Character> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.insert('a');
        doublyLinkedList.insert('c');
        doublyLinkedList.insert(1, 'b');
        doublyLinkedList.insert('d');
        doublyLinkedList.insert(4,'e');
        doublyLinkedList.insert(6,'g');
        doublyLinkedList.printAll();
//        doublyLinkedList.remove('a');
//        doublyLinkedList.printAll();
//        System.out.println(doublyLinkedList.get(1));
    }
}
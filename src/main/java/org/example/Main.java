package org.example;

import org.example.DSA.Array;
import org.example.DSA.CircularlyLinkedList;
import org.example.DSA.DoublyLinkedList;
import org.example.DSA.SinglyLinkedList;

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

//        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
//        System.out.println(singlyLinkedList.isEmpty());
//        singlyLinkedList.addFirst(1);
//        singlyLinkedList.addLast(7);
//        singlyLinkedList.addNth(2, 2);
//        singlyLinkedList.addNth(3, 3);
//        singlyLinkedList.addNth(4, 4);
//        singlyLinkedList.addNth(5, 5);
//        singlyLinkedList.addNth(6, 6);
//        singlyLinkedList.printAll();
//
//        singlyLinkedList.removeLast();
//        System.out.println();
//        singlyLinkedList.printAll();
//
//        singlyLinkedList.removeFirst();
//        System.out.println();
//        singlyLinkedList.printAll();
//
//        singlyLinkedList.removeNth(3);
//        System.out.println();
//        singlyLinkedList.printAll();
//        System.out.println();
//
//        System.out.println(singlyLinkedList.size());
//        System.out.println(singlyLinkedList.isEmpty());
//        System.out.println(singlyLinkedList.first());
//        System.out.println(singlyLinkedList.last());


//        CircularlyLinkedList<Integer> cl = new CircularlyLinkedList<>();
//        System.out.println(cl.isEmpty());
//        cl.addFirst(1);
//        System.out.println( cl.first());
//        System.out.println(cl.last());
//        System.out.println();
//
//        cl.addLast(2);
//        cl.addLast(3);
//        cl.addLast(4);
//        cl.addLast(5);
//        System.out.println("size = "+ cl.size());
//        System.out.println();
//        cl.printAll();
//
//        System.out.println();
//        cl.addFirst(0);
//        cl.addLast(6);
//        cl.printAll();
//
//        System.out.println();
//        cl.removeFirst();
//        cl.printAll();
//
//        System.out.println();
//        cl.removeLast();
//        cl.printAll();
//
//        System.out.println();
//        cl.rotate();
//        cl.printAll();

        DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();
        System.out.println(dl.isEmpty());
        dl.addFirst(1);
        dl.addLast(5);
        dl.addNth(2, 2);
        dl.addNth(3,3);
        dl.addNth(4, 4);
        dl.addLast(6);
        dl.addFirst(0);
        System.out.println(dl.size());
        dl.printAll();

        System.out.println();
        dl.removeFirst();
        dl.removeLast();
        System.out.println("Removed integer: " + dl.removeNth(3));
        System.out.println();
        dl.printAll();
    }
}
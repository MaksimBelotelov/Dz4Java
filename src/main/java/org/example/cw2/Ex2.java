package org.example.cw2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++){
            integerLinkedList.add(i);
        }
        System.out.println("peek = "+ integerLinkedList.peek());
        System.out.println(integerLinkedList);
        System.out.println("pop = "+ integerLinkedList.pop());
        System.out.println(integerLinkedList);
        integerLinkedList.addFirst(3);
        System.out.println("add First "+ integerLinkedList);
        integerLinkedList.addLast(7);
        System.out.println("add Last "+ integerLinkedList);
        integerLinkedList.remove(3);
        System.out.println("remove "+ integerLinkedList);
    }
}

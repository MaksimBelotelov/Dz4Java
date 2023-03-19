package org.example.hw1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

// Вывести список на экран в перевернутом виде (без массивов и ArrayList)

public class Ex01 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        for(int i = 1; i < 5; i++)
            myList.add(i);
        System.out.println("Исходный список: " +myList);
        System.out.print("Перевернутый список: ");
        System.out.println(reverseList(myList));
    }

    /**
     * Метод принимает список и возвращает новый список с элементами входного в обратном порядке
     * @param inpList входной список LinkedList
     * @return развернутый список LinkedList
     */
    public static LinkedList<Integer> reverseList(LinkedList<Integer> inpList) {
        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> outList = new LinkedList<>();

        stack.addAll(inpList);
        while(!stack.isEmpty())
            outList.add(stack.pop());
        return outList;
    }
}

package org.example.hw2;

// Определить валидность строки скобок

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpStr = scanner.nextLine();

        System.out.println(isValid(inpStr));
    }

    /**
     * Метод принимает строку из скобок и проверяет валидна ли она.
     * @param inpString входная строка.
     * @return true, если строка валидна, false, если нет.
     */
    public static boolean isValid(String inpString) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < inpString.length(); i++){
            if((inpString.charAt(i) == '[') ||
                (inpString.charAt(i) == '(') || (inpString.charAt(i)== '{')) {
                    stack.add(inpString.charAt(i));
            }
            else if(inpString.charAt(i) == ']') {
                if ((stack.isEmpty()) || (stack.pop() != '['))
                    return false;
            }
            else if(inpString.charAt(i) == '}') {
                if ((stack.isEmpty()) || (stack.pop() != '{'))
                    return false;
            }
            else if(inpString.charAt(i) == ')') {
                if ((stack.isEmpty()) || (stack.pop() != '('))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

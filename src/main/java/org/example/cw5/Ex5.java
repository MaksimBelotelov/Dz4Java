package org.example.cw5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Удалить отрицательные элементы списка.

public class Ex5 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1, -1, -3, 4, -5, 6, 7));
        System.out.println(removeNegatives(someList));
    }

    public static List<Integer> removeNegatives(List<Integer> inputList) {
        for(int i = 0; i < inputList.size(); i++){
            if(inputList.get(i) < 0){
                inputList.remove(i--);
            }
        }
        return inputList;
    }
}


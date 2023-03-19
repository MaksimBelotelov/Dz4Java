package org.example.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Заменить не кратные трем элементы суммой нечетных элементов
public class Ex4 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int notEvSum = 0;
        for(Integer el : someList){
            if(el % 2 != 0)
                notEvSum += el;
        }
        for(int i = 0; i < someList.size(); i++){
            if(someList.get(i) % 3 != 0)
                someList.set(i, notEvSum);
        }
        System.out.println(someList);
    }
}

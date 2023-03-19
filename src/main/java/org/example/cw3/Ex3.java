package org.example.cw3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
// найти сумму четных элементов
public class Ex3 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int sum = 0;
        for(Integer el : someList){
            if(el % 2 == 0)
                sum += el;
        }
        System.out.println(sum);
    }
}

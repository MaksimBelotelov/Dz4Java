package org.example.cw6;

import java.util.Deque;
import java.util.LinkedList;

public class Ex6 {
    public static void main(String[] args) {
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/home//foo/";

        System.out.println("1 = "+ simplifyPath(path1));
        System.out.println("2 = "+ simplifyPath(path2));
        System.out.println("3 = "+ simplifyPath(path3));
    }

    public static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("") || arr[i].equals(".")) continue;
            else if(arr[i].equals("..")){
                if(!list.isEmpty()) list.removeLast();
            } else list.add(arr[i]);
        }
        return "/" + String.join("/", list);
    }
}

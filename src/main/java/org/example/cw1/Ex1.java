package org.example.cw1;

import org.example.cw1.model.ListNode;

public class Ex1 {
    public static void main(String[] args) {
    }
    public ListNode reverseList(ListNode head){
        ListNode pred = null;
        ListNode current = head;
        while(current != null){
            ListNode nextElem = current.next;
            current.next = pred;
            pred = current;
            current = nextElem;
        }
        return pred;
    }
}

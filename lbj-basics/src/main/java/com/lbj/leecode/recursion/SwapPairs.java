package com.lbj.leecode.recursion;

/**
 * @Classname SwapPairs
 * @Description TODO
 * @Date 2020/7/27 18:22
 * @Created by libaojie
 */

class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int x) {
        val = x;
    }
}

public class SwapPairs {

    public static void main(String[] args) {
        SwapPairs solution = new SwapPairs();
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        ListNode head = solution.swapPairs(head1);
        System.out.println(head);
    }

    public ListNode swapPairs(ListNode head) {

        if (head == null){
            return null;
        }

        if (head.next == null ){
            return head;
        }

        ListNode t = head.next;

        head.next = swapPairs(t.next);

        t.next = head;

        return t;
    }



}






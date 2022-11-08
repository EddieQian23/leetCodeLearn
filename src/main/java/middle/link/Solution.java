package middle.link;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode first = new ListNode();
        int tmp = 0;

        if ((l1.val + l2.val) >= 10) {
            first.val = l1.val + l2.val - 10;
            tmp = 1;
        } else {
            first.val = l1.val + l2.val;
        }

        ListNode l1next = l1.next;
        ListNode l2next = l2.next;
        ListNode cur = first;
        while (l1next != null || l2next != null) {
            ListNode node = new ListNode();
            if (l1next != null && l2next != null) {
                if ((l1next.val + l2next.val + tmp) >= 10) {
                    node.val = l1next.val + l2next.val + tmp - 10;
                    tmp = 1;
                } else {
                    node.val = l1next.val + l2next.val + tmp;
                    tmp = 0;
                }
                l1next = l1next.next;
                l2next = l2next.next;
            }else if (l1next != null && l2next == null) {
                if ((l1next.val + tmp) >= 10) {
                    node.val = l1next.val + tmp - 10;
                    tmp = 1;
                } else {
                    node.val = l1next.val + tmp;
                    tmp = 0;
                }
                l1next = l1next.next;
            }else if (l1next == null && l2next != null) {
                if ((l2next.val + tmp) >= 10) {
                    node.val = l2next.val + tmp - 10;
                    tmp = 1;
                } else {
                    node.val = l2next.val + tmp;
                    tmp = 0;
                }
                l2next = l2next.next;
            }

            cur.next = node;
            cur = node;
        }

        if(tmp == 1){
            ListNode node = new ListNode();
            node.val = 1;
            cur.next = node;
        }

        return first;
    }

    public static void main(String[] args) {

        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        node11.next = node12;
        ListNode node13 = new ListNode(9);
        node12.next = node13;
        ListNode node14 = new ListNode(9);
        node13.next = node14;
        ListNode node15 = new ListNode(9);
        node14.next = node15;
        ListNode node16 = new ListNode(9);
        node15.next = node16;
        ListNode node17 = new ListNode(9);
        node16.next = node17;

        ListNode node21 = new ListNode(9);
        ListNode node22 = new ListNode(9);
        node21.next = node22;
        ListNode node23 = new ListNode(9);
        node22.next = node23;
        ListNode node24 = new ListNode(9);
        node23.next = node24;


        ListNode result = new Solution().addTwoNumbers(node11, node21);
        System.out.println(result);
    }
}
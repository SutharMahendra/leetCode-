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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (temp != null && temp2 != null) {
            if (temp.val < temp2.val) {
                head.next = temp;
                head = temp;
                temp = temp.next;
            } else {
                head.next = temp2;
                head = temp2;
                temp2 = temp2.next;
            }
        }
        if (temp != null) {
            head.next = temp;
        } else {
            head.next = temp2;
        }
        head = dummy.next;
        return head;
    }
}
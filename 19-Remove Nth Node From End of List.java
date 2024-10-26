/**
 *
 */
class Solution {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int length = 0;

        if (head == null || head.next == null && n == 1) {
            return null;
        }

        while (current != null) {
            length++;
            current = current.next;
        }
        int target = length - n + 1;

        if (target == 1) {
            return head.next;
        }
        current = head;
        for (int i = 1; i < target - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}
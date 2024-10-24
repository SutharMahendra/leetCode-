/**
 * we simply create dummy node instead of creating new list and than just
 * connect the node in sort
 * two list are there
 * list1 = [1,2,4], list2 = [1,3,4]
 * dummy node with value -1
 * track list1 by temp and list2 by track2 and one more listnode are there which
 * is use to track the dummy node's connection
 * we make comparision between temp and temp2, bigger value will be connect with
 * the head and then move it forword
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
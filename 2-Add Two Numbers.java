/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * Example-1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * let's take iterations
 * basic idea was we create one dummy node and then we store the value of sum in
 * sum and caray also stored
 * 
 * here is two listnode t1 and t2 that represent current node in l1 and l2
 * respectively
 * 
 * at the starting both t1 and t2 are the head position of the l1 and l2
 * and we take iteration untill both t1 and t2 are not equal to null
 * 
 * i-1:
 * sum = carry (0)
 * sum = sum + t1.val(0+2 = 2)
 * sum = sum + t2.val(2+5 = 7)
 * 
 * create newnode with value sum%10 (7%10 = 7)
 * 
 * carry = sum /10 (7/10 = 0)
 * 
 * connect that node with the dummy node with the help of current node which is
 * use to track the new list
 * and take forward to current , t1 and t2
 * 
 * i-2:
 * sum = carry (0)
 * sum = sum + t1.val(0+4 = 4)
 * sum = sum + t2.val(4+6 = 10)
 * 
 * create newnode with value sum%10 (10%10 = 0)
 * 
 * carry = sum /10 (10/10 = 1)
 * 
 * connect that node with the dummy node with the help of current node which is
 * use to track the new list
 * and take forward to current , t1 and t2
 * 
 * i-3:
 * sum = carry (1)
 * sum = sum + t1.val(1+3 = 4)
 * sum = sum + t2.val(4+4 = 8)
 * 
 * create newnode with value sum%10 (8%10 = 8)
 * 
 * carry = sum /10 (8/10 = 0)
 * 
 * connect that node with the dummy node with the help of current node which is
 * use to track the new list
 * and take forward to current , t1 and t2
 * 
 * final result = 7 -> 0 -> 8
 * 
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        int sum = 0;

        while (t1 != null || t2 != null) {
            sum = carry;
            if (t1 != null) {
                sum = sum + t1.val;
            }
            if (t2 != null) {
                sum = sum + t2.val;
            }
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;

            current.next = newNode;
            current = current.next;
            if (t1 != null) {
                t1 = t1.next;
            }
            if (t2 != null) {
                t2 = t2.next;
            }

        }
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }

        return dummy.next;

    }
}

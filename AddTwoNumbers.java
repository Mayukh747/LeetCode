/**
 * This problem is not yet solved. 
 * Start: 15 Jan
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */

public class AddTwoNumbers {

    class ListNode {
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

    // class List {
    //     ListNode head;

    //     void append(int newData) {
    //         ListNode n = new ListNode(newData);
    //         if (head == null) {
    //             n = head;
    //         }
    //         ListNode currentNode = head;
    //         while (currentNode.next != null) {
    //             currentNode = currentNode.next;
    //         }
    //         n = currentNode.next;
    //     }

    //     void printList() {
    //         ListNode currentNode = head;
    //         while (currentNode.next != null) {
    //             currentNode = currentNode.next;
    //         }
    //         n = currentNode.next;
    //     }
    // }

    class Solution {
        // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // int magnitude = 0;
        // int result = 0;
        // while(l1!=null||l2!=null){
        // result += Math.pow(10,magnitude) * (l1.val + l2.val);
        // magnitude++;
        // }
        // }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null)
                return null;
            if (l1 == null && l2 != null)
                return l2;
            if (l1 != null && l2 == null)
                return l1;
            int digit = l1.val + l2.val;

            if (digit >= 10) {
                digit = digit % 10;
                l1.next.val++;
            }

            return new ListNode(digit, addTwoNumbers(l1.next, l2.next));
        }
    }

    // public static void main(String[] args) {
    //     List Alice = new List();
    //     List Bob = new List();

    // }

}

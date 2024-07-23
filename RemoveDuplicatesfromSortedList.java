package CrackYourPlacementDay3;

public class RemoveDuplicatesfromSortedList {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;

            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    // Skip the next node because it is a duplicate
                    current.next = current.next.next;
                } else {
                    // Move to the next node
                    current = current.next;
                }
            }

            return head;
        }
    }

    public static void main(String[] args) {
        // Sample test case
        // Creating a sorted linked list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(head);

        // Print the result
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}


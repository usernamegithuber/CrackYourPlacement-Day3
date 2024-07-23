package CrackYourPlacementDay3;

public class RemoveLinkedListElements {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            // Create a dummy node to handle edge cases
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode current = dummy;

            // Traverse the list
            while (current.next != null) {
                if (current.next.val == val) {
                    // Skip the node with the given value
                    current.next = current.next.next;
                } else {
                    // Move to the next node
                    current = current.next;
                }
            }

            // Return the new head, which is dummy.next
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        // Sample test case
        // Creating a linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        Solution solution = new Solution();
        ListNode result = solution.removeElements(head, 6);

        // Print the result
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        // Output should be: 1 2 3 4 5
    }
}

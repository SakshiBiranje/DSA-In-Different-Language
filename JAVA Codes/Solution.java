import java.util.HashMap;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    
    // Method to detect cycle in linked list using Floyd's Tortoise and Hare
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head; // Slow pointer moves one step at a time
        ListNode fast = head; // Fast pointer moves two steps at a time

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer by 1
            fast = fast.next.next;  // Move fast pointer by 2

            if (slow == fast) {     // Cycle detected
                return true;
            }
        }

        return false;   // No cycle
    }

    // Helper method to create a linked list with an optional cycle
    public ListNode createLinkedListWithCycle(int[] values, int pos) {
        ListNode head = null;
        ListNode tail = null;
        ListNode cycleNode = null;

        for (int i = 0; i < values.length; i++) {
            ListNode newNode = new ListNode(values[i]);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;

            // Remember the node at the specified cycle position
            if (i == pos) {
                cycleNode = newNode;
            }
        }

        // If pos is not -1, link the last node to the cycleNode to create a cycle
        if (pos != -1) {
            tail.next = cycleNode;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        int[] values = new int[n];
        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println("Enter the position (0-indexed) where the cycle should start (-1 for no cycle):");
        int pos = sc.nextInt();

        ListNode head = solution.createLinkedListWithCycle(values, pos);

        boolean hasCycle = solution.hasCycle(head);
        if (hasCycle) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }

        sc.close();
    }
}

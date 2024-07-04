import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Leetcode2181 {
    public ListNode mergeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0); // Sentinel node
        ListNode modify = dummy;
        ListNode current = head;

        while (current != null) {
            int sum = 0;
            while (current != null && current.val != 0) {
                sum += current.val;
                current = current.next;
            }
            
            modify.next = new ListNode(sum);
            modify = modify.next;
            
            // Skip over zeros at the end of the current block
            while (current != null && current.val == 0) {
                current = current.next;
            }
        }
        
        return dummy.next; // Return the actual result, skipping the dummy node
    }
}



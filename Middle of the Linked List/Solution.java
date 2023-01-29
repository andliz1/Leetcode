/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head)     {

        int count = 0; 
        ListNode current = head;

        while (current != null)
        {
            current = current.next;
            count ++;
        }

        int middleNode = count / 2;
        current = head;

        while (middleNode != 0)
        {
            current = current.next;
            middleNode--;
        }

        return current;
        
    }
}

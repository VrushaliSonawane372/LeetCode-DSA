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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        int sum = 0;
        while (temp1 != null || temp2 != null || carry != 0)
{
    // 1. Start with carry
    sum = carry;

    // 2. Add values if nodes exist
    if (temp1 != null)
    {
        sum += temp1.val;
        temp1 = temp1.next;
    }

    if (temp2 != null)
    {
        sum += temp2.val;
        temp2 = temp2.next;
    }

    // 3. Compute digit and carry
    carry = sum / 10;

    // 4. Create node
    current.next = new ListNode(sum % 10);
    current = current.next;
}
        
        return dummyNode.next;  
    }
}

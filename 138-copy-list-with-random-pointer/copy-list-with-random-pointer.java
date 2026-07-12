/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution
{
    public Node copyRandomList(Node head)
    {
        if(head == null)
            return null;

        // Step 1: Insert copied nodes in between
        Node temp = head;

        while(temp != null)
        {
            Node copy = new Node(temp.val);

            copy.next = temp.next;
            temp.next = copy;

            temp = copy.next;
        }

        // Step 2: Connect random pointers
        temp = head;

        while(temp != null)
        {
            if(temp.random != null)
            {
                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;
        }

        // Step 3: Separate the two lists
        Node dummy = new Node(-1);
        Node copyTail = dummy;

        temp = head;

        while(temp != null)
        {
            Node copy = temp.next;

            // Add copy node to copied list
            copyTail.next = copy;
            copyTail = copy;

            // Restore original list
            temp.next = copy.next;

            temp = temp.next;
        }

        return dummy.next;
    }
}
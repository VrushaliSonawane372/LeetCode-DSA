/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* removeElements(struct ListNode* head, int val) 
{
    struct ListNode* curr = head;
    struct ListNode* prev = NULL;

    // Remove matching nodes from the beginning
    while (curr != NULL && curr->val == val)
    {
        struct ListNode* del = curr;
        curr = curr->next;
        free(del);
    }

    head = curr;   // update head

    // Remove matching nodes from middle / end
    while (curr != NULL)
    {
        if (curr->val == val)
        {
            prev->next = curr->next;
            free(curr);
            curr = prev->next;
        }
        else
        {
            prev = curr;
            curr = curr->next;
        }
    }

    return head;
}

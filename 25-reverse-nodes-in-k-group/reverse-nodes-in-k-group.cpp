/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

typedef ListNode NODE;
typedef ListNode* PNODE;
typedef ListNode** PPNODE;

class Solution {
public:
    PNODE getKthNode(PNODE temp, int k)
    {
        k -= 1;
        while(temp != NULL && k > 0)
        {
             k--;
             temp = temp->next;
        }
        return temp;
    }

    PNODE ReverseKthNode(PNODE temp)
    {
        PNODE prev = NULL;
        PNODE front = NULL;
        while(temp != NULL)
        {
            front = temp->next;
            temp->next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    PNODE reverseKGroup(ListNode* head, int k) 
    {
        PNODE temp = NULL;
        PNODE nextNode = NULL;
        PNODE PrevNode = NULL;
        temp = head;

        while(temp != NULL)
        {
            PNODE KthNode = getKthNode(temp,k);
            if(KthNode == NULL)
            {
                if(PrevNode) PrevNode->next = temp;       
                    break;
            }
            nextNode = KthNode->next;

            // Break the list
            KthNode->next = NULL;

            // Reverse current group
            PNODE NewHead = ReverseKthNode(temp);

            // First group
            if(temp == head)
            {
                head = NewHead;
            }
            else
            {
                PrevNode->next = NewHead;
            }

            // temp becomes tail after reverse
            PrevNode = temp;

            // Move to next group
            temp = nextNode;
        }

        return head;
    }
};
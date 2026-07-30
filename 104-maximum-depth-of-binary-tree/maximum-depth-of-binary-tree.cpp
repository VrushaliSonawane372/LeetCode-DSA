/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode* root) 
    {
        if(root == nullptr) return 0;
        queue<TreeNode*> elementQueue;
        int NoOfLevels = 0;
        elementQueue.push(root);
        while(!elementQueue.empty())
        {
            int NodeAtEachLevel = elementQueue.size();
            if(NodeAtEachLevel == 0)
           {
              return  NoOfLevels;
           }
          while(NodeAtEachLevel--)
           {
              TreeNode* element = elementQueue.front();
              elementQueue.pop();
              if(element->left != NULL)
              {
                 elementQueue.push(element->left);
              }
              if(element->right != NULL)
              {
                 elementQueue.push(element->right);
              }
              
           }
          NoOfLevels++;
            
        }
        return NoOfLevels++;
    }
};
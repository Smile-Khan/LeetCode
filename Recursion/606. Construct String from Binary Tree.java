package Recursion;

import javax.swing.tree.TreeNode;

QUESTION :- 606. Construct String from Binary Tree {
    

    https://leetcode.com/problems/construct-string-from-binary-tree/description/?envType=daily-question&envId=2023-12-08


}

SOLUTION :-

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String tree2str(TreeNode root) {
        if(root == null)
        {
            return "";
        }

        String result = Integer.toString(root.val);

        String left = tree2str(root.left);
        String right = tree2str(root.right);

        if(root.left == null && root.right == null)
        {
            return result;
        }
        

        if(root.left == null)
        {
            return result += "()" + "(" + right + ")"; 
        }
        if(root.right == null)
        {
            return result += "(" + left + ")";
        }

        return result + "(" + left + ")" + "(" + right + ")";
    }
}

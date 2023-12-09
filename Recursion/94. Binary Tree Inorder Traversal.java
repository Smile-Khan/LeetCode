package Recursion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

QUESTION :- 94. Binary Tree Inorder Traversal {
    

    https://leetcode.com/problems/binary-tree-inorder-traversal/description/?envType=daily-question&envId=2023-12-09


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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        recursion(root,ans);
        return ans;
    }
    public void recursion(TreeNode root, List<Integer> ans)
    {
        if(root != null)
        {
            recursion(root.left,ans);
            ans.add(root.val);
            recursion(root.right,ans);
        }
    }
}

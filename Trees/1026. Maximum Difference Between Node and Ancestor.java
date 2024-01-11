package Trees;

import javax.swing.tree.TreeNode;

public class 1026. Maximum Difference Between Node and Ancestor {
    
    https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/description/?envType=daily-question&envId=2024-01-11

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
    int maxDiff=0;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
        return maxDiff;
    }
    void dfs(TreeNode root, int min, int max)
    {
        if(root==null)
        return;

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        int diff1 = Math.abs(min - root.val);
        int diff2 = Math.abs(max - root.val);
        int diff = Math.max(diff1, diff2);

        maxDiff = Math.max(maxDiff, diff);

        dfs(root.left, min, max);
        dfs(root.right, min, max);
    }
}
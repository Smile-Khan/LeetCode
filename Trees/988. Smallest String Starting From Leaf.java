package Trees;

import javax.swing.tree.TreeNode;

public class 988. Smallest String Starting From Leaf {

    
    https://leetcode.com/problems/smallest-string-starting-from-leaf/?envType=daily-question&envId=2024-04-17

    
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
    String smallestString = "";

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return smallestString;
    }

    // Helper function to find the lexicographically smallest string
    void dfs(TreeNode root, String currentString) {

        // If the current node is NULL, return
        if (root == null) {
            return;
        }

        // Construct the current string by appending 
        // the character corresponding to the node's value
        currentString = (char) (root.val + 'a') + currentString;

        // If the current node is a leaf node
        if (root.left == null && root.right == null) {

            // If the current string is smaller than the result 
            // or if the result is empty
            if (smallestString.isEmpty() || smallestString.compareTo(currentString) > 0) {
                smallestString = currentString;
            }
        }

        // Recursively traverse the left subtree
        if (root.left != null) {
            dfs(root.left, currentString);
        } 

        // Recursively traverse the right subtree
        if (root.right != null) {
            dfs(root.right, currentString);
        }

    }
}
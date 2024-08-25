package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Binary Tree Postorder Traversal {
    
    https://leetcode.com/problems/binary-tree-postorder-traversal/description/?envType=daily-question&envId=2024-08-25

}

-------------------------JAVA---------------
// RECURSIVE APPROACH
class Solution {
    private void Helper(TreeNode node, List<Integer> Result)
    {
        if(node == null)
        {
            return;
        }
        Helper(node.left, Result);
        Helper(node.right, Result);
        Result.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> Result = new ArrayList<>();

        Helper(root,Result);
        return Result;
    }
}

// ITERATIVE APPROACH

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.addFirst(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return result;
    }
}



-------------------PYTHON-----------------


class Solution:
    def postorderTraversal(self, root: TreeNode) -> List[int]:
        result = []
        self.postorderHelper(root, result)
        return result

    def postorderHelper(self, node: TreeNode, result: List[int]) -> None:
        if node is None:
            return
        self.postorderHelper(node.left, result)
        self.postorderHelper(node.right, result)
        result.append(node.val)


        
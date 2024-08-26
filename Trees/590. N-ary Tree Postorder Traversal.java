package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.w3c.dom.Node;

public class 590. N-ary Tree Postorder Traversal {
    
    QUESTION LINK:
    https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/?envType=daily-question&envId=2024-08-26

}

SOLTUION:

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        // RECURSIVE APPROACH
        // List<Integer> result = new ArrayList<>();

        // if(root == null)
        // return result;

        // for(Node child : root.children)
        // {
        //     result.addAll(postorder(child));
        // }
        // result.add(root.val);
        // return result;

        // ITERATIVE APPROACH

        List<Integer> result = new ArrayList<>();

        if(root == null)
        return result;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            Node node = stack.pop();
            result.addFirst(node.val);
            for(Node child : node.children)
            {
                stack.push(child);
            }
        }
        return result;
    }
}

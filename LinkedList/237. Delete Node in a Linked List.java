package LinkedList;

public class 237. Delete Node in a Linked List {
    
    https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/1250088235/?envType=daily-question&envId=2024-05-05

}

SOLUTION :-'


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Overwrite data of next node on current node.
        node.val = node.next.val;
        // Make current node point to next of next node.
        node.next = node.next.next;
    }
}'

public class 141. Linked List Cycle {
    

    https://leetcode.com/problems/linked-list-cycle/submissions/1195957564/?envType=daily-question&envId=2024-03-06


}

SOLUTION :-

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        boolean falg = true;

        if(head == null || head.next == null)
        return false;

        while(true)
        {
            if(fast.next == null || fast.next.next == null)
            break;

            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}

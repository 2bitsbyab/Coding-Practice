/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//find a better solution with o(n) time and o(1) space complexity
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode tempA = headA; 
        while(tempA != null){
            set.add(tempA);
            tempA = tempA.next;
        }
        ListNode res = null;
        ListNode tempB = headB;
        while(tempB != null){
            if(set.contains(tempB)){
                res = tempB;
                break;
            }
            tempB = tempB.next;
        } 
        return res;
    }
}

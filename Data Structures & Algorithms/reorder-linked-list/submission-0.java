/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head){
        ListNode next = null;
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
       ListNode fast = head;
       ListNode slow = head;
       while(fast != null && fast.next != null  ){
        fast = fast.next.next;
        slow = slow.next;
       }
        ListNode sec = slow.next;
        slow.next = null;

        ListNode rev = reverseList(sec);
        ListNode curr = head;
        while(rev != null){
            ListNode temp1 = curr.next;
            ListNode temp2 = rev.next;

            curr.next = rev;
            rev.next = temp1;

            curr = temp1;
            rev = temp2;
        }
    }
}

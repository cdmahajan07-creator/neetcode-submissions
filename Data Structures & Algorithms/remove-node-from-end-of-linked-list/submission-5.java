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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head==null || head.next==null)return null;

    int len = 1 ;
    ListNode curr = head;
    while(curr.next!=null){
          len++;
          curr = curr.next;
    }

    if(len==n){
        return head.next;
    }

    ListNode l  = head;
    if(len<=n)return null;
    for(int i=0;i<len-n-1;i++){
        l = l.next;
    }

    l.next = l.next.next;
    return head;
    }
}

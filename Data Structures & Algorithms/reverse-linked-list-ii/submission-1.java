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
    public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode before = dummy;
    for(int i=1;i<left;i++){
        before = before.next;
    }
    ListNode lef = head;
    int pos = 1;
    while(pos<left){
        lef = lef.next;
        pos++;
    }
    ListNode righ = lef;
    int los = left;
    while(los<right){
        righ = righ.next;
        los++;
    }
    ListNode prev = null;
    ListNode curr = lef;
    ListNode next = null;
    ListNode after = righ.next;
    while(curr != after){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    before.next = prev;
    lef.next = after;
    return dummy.next;
    }
}
/* 61. Rotate List
Given the head of a linked list, rotate the list to the right by k places.
Example :
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3] */

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null|| k == 0)
            return head;
        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            ++length;
            temp = temp.next;
        }
        temp.next = head;
        k = k % length;
        int end = length - k;
        while(end-- != 0){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
}

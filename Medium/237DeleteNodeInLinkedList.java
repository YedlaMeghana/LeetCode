/* 237. Delete Node in a Linked List
There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list. */

class Solution {
    public void deleteNode(ListNode node) {
        if(node==null)
        return;
        node.val = node.next.val;
        node.next = node.next.next;
        return;
    }
}

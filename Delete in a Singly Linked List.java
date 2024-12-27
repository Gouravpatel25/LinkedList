/*
Given a singly linked list and an integer, x. Delete the xth node (1-based indexing) from the singly linked list.
Examples:

Input: Linked list: 1 -> 3 -> 4, x = 3
Output: 1 -> 3
Explanation: After deleting the node at the 3rd position (1-base indexing), the linked list is as 1 -> 3. 

Input: Linked list: 1 -> 5 -> 2 -> 9, x = 2 
Output: 1 -> 2 -> 9
Explanation: After deleting the node at 2nd position (1-based indexing), the linked list is as 1 -> 2 -> 9.
*/

/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        
        if(x==1){
            return head.next;
        }
        
        Node curr=head;
        Node prev=null;
        int count=1;
        
        while(curr != null){
            
            if(count==x){
                prev.next=curr.next;
                break;
            }
            
            prev=curr;
            curr=curr.next;
            count++;
        }
        
        return head;
    }
    
}

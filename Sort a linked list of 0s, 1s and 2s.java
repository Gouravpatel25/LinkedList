/*
Given a linked list where nodes can contain values 0s, 1s, and 2s only. 
The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to the head side, 2s at the end of the linked list, and 1s in the middle of 0s and 2s.
Input: LinkedList: 1->2->2->1->2->0->2->2
Output: 0->1->1->2->2->2->2->2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between.
*/

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/

class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        
        HashMap<Integer,Integer> map=new HashMap();
        map.put(0, 0); // Initialize count for 0
        map.put(1, 0); // Initialize count for 1
        map.put(2, 0);
        
        Node temp=head;
        
        while(temp!=null){
            if(map.containsKey(temp.data)){
                map.put(temp.data, map.get(temp.data)+1);
            }
            
            else{
                map.put(temp.data,1);
            }
            
            temp=temp.next;
        }
        
        
        temp=head;
        
        for(int i=0; i<map.get(0); i++){
            temp.data=0;
            temp=temp.next;
        }
        
        for(int i=0; i<map.get(1); i++){
            temp.data=1;
            temp=temp.next;
        }
        
        for(int i=0; i<map.get(2); i++){
            temp.data=2;
            temp=temp.next;
        }
        
        return head;
    }
}

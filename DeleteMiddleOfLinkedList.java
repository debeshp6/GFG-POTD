/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        Node slow = head;
        if(head.next==null) return null;
        Node fast = head.next;
        
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
           }
           
         slow.next=slow.next.next;
         return head;
    }
}




/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
       if(head == null || head.next == null)return head;
        Node st = head;
        Node temp = st.next;
        while(temp != null){
            if(temp.data >= st.data){
                st = temp;
                temp = temp.next;
            }else{
                st.next = temp.next;
                Node prev = null;
                Node curr = head;
                while(curr != st && curr.data <= temp.data){
                    prev = curr;
                    curr = curr.next;
                }
                if(prev == null){
                    temp.next = head;
                    head = temp;
                }else{
                    temp.next = curr;
                    prev.next = temp;
                }
            }
            temp = st.next;
        }
     return head;
   }
}

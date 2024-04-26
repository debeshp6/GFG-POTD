// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class Solution {
    // Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head) {
        // add your code here
        if(head == null)
           return head;
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;        
        }
        Collections.sort(arr);
        Node newNode = new Node(arr.get(0));
        Node dummyHead = newNode;
        for(int i = 1; i < arr.size(); i++){
            Node temp_node = new Node(arr.get(i));
            dummyHead.next = temp_node;
            temp_node.prev = dummyHead;
            dummyHead = temp_node;
        }
        return newNode;
    }
}

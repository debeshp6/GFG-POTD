//User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */

class Solution {

    public static Node insertionSort(Node head_ref)
    {
        if (head_ref == null || head_ref.next == null) {
            return head_ref; // Already sorted or empty list
        }

        Node sortedList = null;
        Node current = head_ref;

        while (current != null) {
            Node next = current.next;

            sortedList = sortedInsert(sortedList, current);

            current = next;
        }

        return sortedList;
    }
    
    private static Node sortedInsert(Node sortedList, Node newNode) {
        if (sortedList == null || sortedList.data >= newNode.data) {
            newNode.next = sortedList;
            return newNode;
        }

        Node current = sortedList;

        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
        
        newNode.next = current.next;
        current.next = newNode;

        return sortedList;
    }
}

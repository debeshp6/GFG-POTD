/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public Node arrangeCV(Node head) {
        Node con = new Node('a');
        Node conHead = con;
        Node vow = new Node('a');
        Node vowHead = vow;
        while (head != null) {
            if (isVowel(head.data)) {
                vow.next = head;
                vow = vow.next;
            } else {
                con.next = head;
                con = con.next;
            }
          head = head.next;
        }
        con.next = null;
        vow.next = conHead.next;
        return vowHead.next;
    }
}

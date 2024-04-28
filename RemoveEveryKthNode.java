

/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	    if(k==1)
        return null;
        Node temp=head;
        int x=1;
        while(temp!=null && temp.next!=null ) {
            if((x+1)%k==0 ) {
               x=0;
               temp.next=temp.next.next;
            }
            temp=temp.next;
            x++;
        }
        return head;
    }
}

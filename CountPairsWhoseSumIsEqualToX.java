

// your task is to complete this function

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        int count=0;
        HashSet<Integer> temp = new HashSet<>(head1);
      for(Integer nums : head2){
          if(temp.contains(x-nums)){
              count++;
          }
      }
        return count;
    }
}

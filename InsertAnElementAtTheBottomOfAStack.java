//User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        insertAtBtm(st, x);
        return st;
    }
    public void insertAtBtm(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int s= st.pop();
        insertAtBtm(st,  x);
        st.push(s);
        return;
    }
}

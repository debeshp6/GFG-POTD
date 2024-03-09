//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        if(r==0) return s.charAt(n);
        char value=nthCharacter(s,r-1,n/2);
        String curr=value=='0'?"01":"10";
        return n%2==0?curr.charAt(0):curr.charAt(1);
    }
}

//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String> a=new ArrayList<>();
        solve(s,"",a);
        Collections.sort(a);
        return a;
    }
    
    void solve(String s,String ans,List<String> a){
        if(s.length()==0)
        {
            if(!ans.equals(""))
            a.add(ans);
            return;
        }
        char ch=s.charAt(0);
        String r=s.substring(1);
        solve(r,ans,a);
        solve(r,ans+ch,a);
        return ;
    }
}

//User function Template for Java

class Solution {
    String removeDuplicates(String str) {
        String s1="";
        for(int i=0;i<str.length();i++)
        {
            if(s1.contains(String.valueOf(str.charAt(i)))==true)
            continue;
            else
            s1+=str.charAt(i);
        }
      return s1;
    }
}

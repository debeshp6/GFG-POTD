//User function template for JAVA

/*You are required to complete this method */

class Solution
{
    int atoi(String s) {
	// Your code here
	 if(s.charAt(s.length()-1)=='-')return -1;
      for(int i=0;i<s.length();i++){
        try{  int a=Integer.parseInt(String.valueOf(s.charAt(i)));
        } catch(Exception e){
            if(s.charAt(i)=='-')continue;
            else return -1;
        }
      }
      return Integer.parseInt(s);
    }
}

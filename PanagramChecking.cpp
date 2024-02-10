//User function template for C++

class Solution
{
  public:

    //Function to check if a string is Pangram or not.
    bool checkPangram (string s) {
        // your code here
        vector<bool> check(26, false);
        
        for(int i = 0; i < s.size(); i++){
            
            // for capital
            if(s[i] >= 65 && s[i] <= 90){
                check[s[i] - 65] = true;
            }
            
            if(s[i] >= 97 && s[i] <= 122){
                check[s[i] - 97] = true;
            }
        }
        
        for(int i = 0; i < 26; i++){
            if(check[i] == false){
                return false;
            }
        }
        return true;
    }
};

class Solution {
  public:
    string adds(string x ,string y){
       string str;
        int carry=0;
        int i=x.size()-1,j=y.size()-1;
        while(i>=0&&j>=0){
            int sum=(x[i]-'0')+(y[j]-'0')+carry;
            carry=sum/10;
            sum=sum%10;
            i--;j--;
            str.push_back(sum+'0');
        }
        while(i>=0){
            int sum=(x[i]-'0')+carry;
            carry=sum/10;
            sum=sum%10;
            str.push_back(sum+'0');
            i--;
        }
        while(j>=0){
            int sum=(y[j]-'0')+carry;
            carry=sum/10;
            sum=sum%10;
            str.push_back(sum+'0');
            j--;
        }
        while(carry!=0){
            int sum=carry;
            carry=sum/10;
            sum=sum%10;
            str.push_back(sum+'0');
            
        }
        int k=str.size()-1;
        while(str[k--]=='0'&&str.size()>1){str.pop_back();}
        reverse(str.begin(),str.end());
        return str;
  }
    bool isAdditiveSequence(string s) {
    if(s.size()<3)return false;
    string curr;
    bool add=true;
    for(int i=0;i<s.size();i++){
        if(add){
            curr+=s[i];
        }
        else{
            add=true;
        }
        string next;
        bool flag=false;
        for(int j=i+1;j<s.size();j++){
            next+=s[j];
            
            string num=adds(curr,next);
            int found=s.find(num,j+1);
            if(found==j+1){
                add=false;
                curr=next;
                flag=true;
                if(found+num.size()>=s.size()){
                    return true;
                }
                break;
            }
        }
    }
    return false;
    }
};

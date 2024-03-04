//User function template for C++
class Solution{
public:
	static bool comp(string a, string b){
	    string s1=a+b;
	    string s2=b+a;
	    return s1>s2;
	}
	string printLargest(int n, vector<string> &arr) {
	    sort(arr.begin(),arr.end(),comp);
	    string ans="";
	    for(auto i:arr) ans+=(i);
	    return ans;
	}
};

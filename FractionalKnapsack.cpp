//class implemented
/*
struct Item{
    int value;
    int weight;
};
*/

class Solution
{
    public:
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        // Your code here
        sort(arr, arr+n, [](Item a, Item b){
            double v1=(double)a.value/a.weight;
            double v2=(double)b.value/b.weight;
            return v1>v2;
        });
        double res=0;
        for(int i=0; i<n; i++){
            int value=arr[i].value;
            int weight=arr[i].weight;
            
            if(!W) break;
            if(W<weight){
                res+=(((double)value/weight)*W);
                break;
            }
            res+=value;
            W-=weight;
        }
        return res;
    }   
};

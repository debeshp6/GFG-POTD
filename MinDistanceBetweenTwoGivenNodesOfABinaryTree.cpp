/* A binary tree node
struct Node
{
    int data;
    Node* left, * right;
}; */

class Solution{
    public:
    /* Should return minimum distance between a and b
    in a tree with given root*/
    void traverse(Node *root, unordered_map<int, vector<int>> &adj, unordered_map<int, int> &distance){
        if(root == nullptr) return;
        distance[root->data] = INT_MAX;
        if(root->left){
            adj[root->data].push_back(root->left->data);
            adj[root->left->data].push_back(root->data);
        }
        if(root->right){
            adj[root->data].push_back(root->right->data);
            adj[root->right->data].push_back(root->data);
        }
        traverse(root->left, adj, distance);
        traverse(root->right, adj, distance);
    }
    int findDist(Node* root, int a, int b) {
        // Your code here
        unordered_map<int, vector<int>> adj;
        unordered_map<int, int> distance;
        traverse(root, adj, distance);
        distance[a] = 0;
        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
        pq.push({0, a});
        while(!pq.empty()){
            int currDist = pq.top().first;
            int currNode = pq.top().second;
            pq.pop();
            for(int const &newNode: adj[currNode]){
                if(1 + currDist < distance[newNode]){
                    distance[newNode] = 1 + currDist;
                    pq.push({(1+currDist), newNode});
                }
            }
        }
        return distance[b];
    }
};

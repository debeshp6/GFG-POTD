//User function Template for C++

// struct Node {
//     int val;
//     vector<Node*> neighbors;
//     Node() {
//         val = 0;
//         neighbors = vector<Node*>();
//     }
//     Node(int _val) {
//         val = _val;
//         neighbors = vector<Node*>();
//     }
//     Node(int _val, vector<Node*> _neighbors) {
//         val = _val;
//         neighbors = _neighbors;
//     }
// };

class Solution {
public:
Node* rec(Node* node,map<Node*, Node*>&mp )
    {
        Node* copyNode= new Node(node->val);
        mp[node]=copyNode;
        vector<Node*>copyNeighbors;
        for (auto it: node->neighbors)
        {
            if (mp.find(it)!=mp.end())
            copyNeighbors.push_back(mp[it]);
            else
            {
                copyNeighbors.push_back(rec(it,mp));
            }
        }
        copyNode->neighbors=copyNeighbors;
        return copyNode;
    }
    Node* cloneGraph(Node* node) {
        map<Node* , Node*>mp;
        return rec(node,mp);
    }
};

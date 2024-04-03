// User function Template for Java
class Solution {
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        if (x == y) return -1;
        List<Integer> list = new ArrayList<>();
        while (root != null){
            list.add(root.data);
            if (x < root.data && y < root.data) root = root.left;
            else if (x > root.data && y > root.data) root = root.right;
            else break;
        }
        if (k > list.size()) return -1;
        return list.get(list.size() - k);
    }
}

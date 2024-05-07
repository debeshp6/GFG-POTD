class Solution {
    
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        findPaths(root, currentPath, allPaths);
        return allPaths;
    }

    private static void findPaths(Node node, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> allPaths) {
        if (node == null)
            return;
            currentPath.add(node.data);
        if (node.left == null && node.right == null) {
            allPaths.add(new ArrayList<>(currentPath));
        } else {
            findPaths(node.left, currentPath, allPaths);
            findPaths(node.right, currentPath, allPaths);
        }
      currentPath.remove(currentPath.size() - 1);
    }
}

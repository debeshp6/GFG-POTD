

/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/

class Tree {
    // Function to serialize a tree and return a list containing nodes of the tree.
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur != null) {
                result.add(cur.data);
                queue.offer(cur.left);
                queue.offer(cur.right);
            } else {
                result.add(-1); // Placeholder for null nodes
            }
        }

        return result;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        if (A == null || A.isEmpty()) {
            return null;
        }

        int i = 0;
        Node root = new Node(A.get(i++));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            // left tree construct
            int leftValue = A.get(i++);
            if (leftValue != -1) {
                cur.left = new Node(leftValue);
                queue.offer(cur.left);
            }

            // right tree construct
            int rightValue = A.get(i++);
            if (rightValue != -1) {
                cur.right = new Node(rightValue);
                queue.offer(cur.right);
            }
        }
        return root;
    }
}

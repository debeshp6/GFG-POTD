//User function Template for Java

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/


class Solution
{
    public static int distributeCandy(Node root)
    {
        //code here
        int[] moves = new int[1]; // Using an array to pass by reference
        distributeCandyUtil(root, moves);
        return moves[0];
    }

    private static int distributeCandyUtil(Node node, int[] moves)
    {
        if (node == null) {
            return 0;
        }

        int leftMoves = distributeCandyUtil(node.left, moves);
        int rightMoves = distributeCandyUtil(node.right, moves);

        // Calculate moves needed for the current node
        int nodeMoves = Math.abs(leftMoves) + Math.abs(rightMoves);

        // Update moves array with the moves needed for the current node
        moves[0] += Math.abs(leftMoves) + Math.abs(rightMoves);

        // Return the excess candies at the current node
        return node.data + leftMoves + rightMoves - 1;
    }
}

package DSA.NonLinear.BinaryTrees.problems;


class Node{
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class HeightOfBinaryTree {
    static int findHeight(Node root) {
        // base case-> If the root is null, tree is empty, height is 0
        if (root == null){
            return 0;
        }
        int leftHeight=findHeight(root.left);
        int rightHeight=findHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        System.out.println("Height of 1st tree is:"+findHeight(root));
        Node root1 = null;
        System.out.println("Height of 2nd tree is:"+findHeight(root1));
    }
}

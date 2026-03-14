package DSA.NonLinear.BinaryTrees.Traversals.bsf;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTree {
    public static void levelOrderTraversalOrBFS(TreeNode root) {
        //base case //corner case// edge case
        if (root == null) {
            return;
        }
        //you are pushing nodes into queue not integers
        Queue<TreeNode> queue = new LinkedList<>();
        //add the root node into the queue and then traverse left and right
        queue.add(root);
        //print all the nodes level by level till the queue is empty
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();//removes and stores the first node
            System.out.println(temp.data + " ");
            //left subtree
            if (temp.left != null) {
                queue.add(temp.left);
            }
            //right subtree
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        System.out.println();
    }

    static void main(String[] args) {
        //level 0
        TreeNode root = new TreeNode(1);
        //level 1
        root. left = new TreeNode(2);
        root. right = new TreeNode(3);
        //level2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("BFS or Level Order Traversal:");
        levelOrderTraversalOrBFS(root);
    }
}
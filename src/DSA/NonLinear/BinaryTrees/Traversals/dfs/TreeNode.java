package DSA.NonLinear.BinaryTrees.Traversals.dfs;

public class TreeNode {
    int data;//the data of the node
    TreeNode left;//the reference to the left child
    TreeNode right;//the reference to the right child
    TreeNode(int data){
        this.data = data;
        this.right=this.left=null;//intially node has np children
    }
    public static void preOrder(TreeNode root){//DLR
       if(root != null){
           System.out.println(root.data +" ");
           preOrder(root.left);
           preOrder(root.right);
       }
    }
    public static void inOrder(TreeNode root){//LDR
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data +" ");
            inOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root){//LRD
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data +" ");
        }
    }

     public static void main(String[] args) {
        //rule for constructing the binary tree => top to bottom and left to right
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
        //level 3
        root.left.right.left = new TreeNode(9);
        root.left.right.right = new TreeNode(15);
         System.out.println("PreOrder Traversal:");
         preOrder(root);
         System.out.println();
         System.out.println("inOrder Traversal:");
         inOrder(root);
         System.out.println();
         System.out.println("PostOrder Traversal:");
         postOrder(root);
         System.out.println();

    }
}

package DSA.NonLinear.BinaryTrees;
public class GenericTree<T>{
    private final T data;
    private GenericTree<T> left;
    private GenericTree<T> right;
    public GenericTree(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    void  preOrder(){
        System.out.println(this.data+" ");
        if(this.left != null) this.left.preOrder();
        if(this.right != null) this.right.preOrder();
    }
    void inOrder(){
        if(this.left != null) this.left.inOrder();
        System.out.println(this.data+" ");
        if(this.right != null) this.right.inOrder();
    }
    void postOrder(){
        if(this.left != null) this.left.postOrder();
        if(this.right != null) this.right.postOrder();
        System.out.println(this.data+" ");
    }
    public static void main(String[] args) {
        // this is a tree of integers
        GenericTree<Integer> integerRoot = new GenericTree<Integer>(1);
        integerRoot.left = new GenericTree<Integer>(2);
        integerRoot.right = new GenericTree<Integer>(3);
        System.out.println("Preorder Integer Tree");
        integerRoot.preOrder();
        System.out.println();
        System.out.println("Inorder Integer Tree");
        integerRoot.inOrder();
        System.out.println();
        System.out.println("Postorder Integer Tree");
        integerRoot.postOrder();
        System.out.println();
        // this is the tree of floats
        GenericTree<Float> floatRoot = new GenericTree<Float>(1.2f);
        floatRoot.left = new GenericTree<Float>(2.4f);
        floatRoot.right = new GenericTree<Float>(4.6f);
        System.out.println("Preorder Float Tree");
        floatRoot.preOrder();
        System.out.println();
        System.out.println("Inorder Float Tree");
        floatRoot.inOrder();
        System.out.println();
        System.out.println("Postorder Float Tree");
        floatRoot.postOrder();
        System.out.println();
        GenericTree<Double> doubleRoot = new GenericTree<Double>(1.2d);
        doubleRoot.left = new GenericTree<Double>(2.6d);
        doubleRoot.right = new GenericTree<Double>(4.7d);
        System.out.println("Preorder Double Tree");
        doubleRoot.preOrder();
        System.out.println();
        System.out.println("Inorder Double Tree");
        doubleRoot.inOrder();
        System.out.println();
        System.out.println("Postorder Double Tree");
        doubleRoot.postOrder();
        System.out.println();
        // this is a tree of boolean
        GenericTree<Boolean> booleanRoot = new GenericTree<Boolean>(true);
        booleanRoot.left = new GenericTree<Boolean>(false);
        booleanRoot.right = new GenericTree<Boolean>( true);
        System.out.println("Preorder Boolean Tree");
        booleanRoot.preOrder();
        System.out.println();
        System.out.println("Inorder Boolean Tree");
        booleanRoot.inOrder();
        System.out.println();
        System.out.println("Postorder Boolean Tree");
        booleanRoot.postOrder();
        System.out.println();
    }
}

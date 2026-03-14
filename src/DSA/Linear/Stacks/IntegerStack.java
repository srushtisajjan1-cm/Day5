package DSA.Linear.Stacks;

public class IntegerStack {
    int arr[];
    int top;
    int capacity;
    IntegerStack(int size){
        capacity =size;
        arr=new int[size];//stack of integer
        top=-1;
    }
    void push(int x){
        if(top==capacity-1){
            System.out.println("stack overflow");
            return;
        }
        arr[++top]=x;
        System.out.println("added " + x+ "top of the stack");
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }
    void display(){
        if(top == -1){
            System.out.println("Stack underflow.nothing to display");
            return;
        }
        for(int i = top;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped:"+stack.pop());
        stack.display();

    }
}

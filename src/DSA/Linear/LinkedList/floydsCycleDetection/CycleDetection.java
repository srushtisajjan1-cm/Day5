package DSA.Linear.LinkedList.floydsCycleDetection;
class Node{
int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class CycleDetection {
    static Node head=null;
    static void createList(){
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        //Creating a cycle
        head.next.next.next.next=head.next;//5th node is connected to 2nd node
    }
    static boolean hasCycle(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;//move 1 steps
            fast=fast.next;//move 2 steps
            if(slow==fast){
                return true;//detected cycle
            }
        }
        return false;//no cycle has been detected
    }

    public static void main(String[] args) {
        createList();//its return type is void so just createList
        if(hasCycle()){
            System.out.println("cycle detected");
        }else{
            System.out.println("no cycle");
        }
    }
}
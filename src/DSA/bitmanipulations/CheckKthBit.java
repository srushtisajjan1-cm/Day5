package DSA.bitmanipulations;

public class CheckKthBit {
    static void main(String[] args) {
        int n =4;
        int k =1;
        if((n & (1<<k))!=0) {
            System.out.println("Bit is Set");
        }else{
            System.out.println("Bit is not a set");
        }

    }
}

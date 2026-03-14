package DSA.Linear.Queue;
import java.util.*;
import java.util.LinkedList;

public class BinaryNumberGenerator {
    public static void generateBianryNumbers1toN(int N){
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        while(N --> 0){
            String curr=q.poll();
            System.out.println(curr + " ");//print tha latest
            q.offer(curr + "0");
            q.offer(curr +"1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N=5;
        generateBianryNumbers1toN(N);
    }
}
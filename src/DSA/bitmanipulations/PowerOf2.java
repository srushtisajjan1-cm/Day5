package DSA.bitmanipulations;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n & (n-1))==0){
            System.out.println(n + "Power of 2");
        }else{
            System.out.println(n + " not power of 2");
        }
    }
}
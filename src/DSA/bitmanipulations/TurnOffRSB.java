package DSA.bitmanipulations;

public class TurnOffRSB {
    static void main(String[] args){
        int n =12;
        int result = n&(n-1);
        System.out.println("result:"+result);
    }
}
//output is8 becuase it is in bitformat
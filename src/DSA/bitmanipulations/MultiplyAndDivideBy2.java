package DSA.bitmanipulations;

public class MultiplyAndDivideBy2 {
    static void main(String[] args) {
        int n =5;//0101 << 1010
        int result = n<<1;//multiply by 2
        System.out.println("Result:"+result);
        int x = 50;
        int res = x>>1;//divide by 2
        System.out.println("RES:"+res);
    }
}

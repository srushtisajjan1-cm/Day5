package DSA.lambdaExpressions;

import java.util.ArrayList;
//java stream api
public class Example4 {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(5);
        list.forEach(System.out::println);//stream api java 8
        list.forEach(n->System.out.println(n));//lambda


    }

}

package DSA.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class Example5 {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        System.out.println("Intial list:"+ list);
        Collections.sort(list,(a,b)->b - a);//descending
        System.out.println("Sorted List:"+list);
        Collections.sort(list,(a,b)->a - b);//ascending
        System.out.println("Sorted List:"+list);
    }
}

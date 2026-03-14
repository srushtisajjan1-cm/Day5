package DSA.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveUsingLambda {

        static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(8);
            list.add(21);
            list.add(54);
            list.add(64);
            list.add(74);
            System.out.println("Before:"+list);
            list.removeIf(n -> n%2 == 0);
            System.out.println("After:"+list);
                }
            }




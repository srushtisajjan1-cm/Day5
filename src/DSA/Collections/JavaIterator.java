package DSA.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(21);
        list.add(54);
        list.add(64);
        list.add(74);
        Iterator<Integer> it =  list.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i>10){
                it.remove();
            }
        }
        System.out.println(list);
    }
}

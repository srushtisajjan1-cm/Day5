package DSA.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder {
    static void main(String[] args) {

        HashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(99);
        set.add(3);
        set.add(11);
        set.add(34);
        set.add(67);
        System.out.println(set);
    }
}
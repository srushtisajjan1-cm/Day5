package DSA.Sets;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoard {
    static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(Collections.reverseOrder());//this is used to change the order
        //normally ascending order
        scores.add(450);
        scores.add(980);
        scores.add(1243);
        scores.add(123);
        scores.add(899);
        System.out.println("LeaderBoard Stats:"+scores);

    }
}

package DSA.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        liveOrders.add("0B2321");
        liveOrders.add("ERC34N");
        liveOrders.add("JDJ789");
        System.out.println("0B2321 exists?"+liveOrders.contains("0B2321"));
        System.out.println("liveOrders:"+liveOrders);
        liveOrders.clear();
        System.out.println("Orders after closing:"+liveOrders);


    }
}

package DSA.Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    static void main(String[] args) {
            Queue<String> orders = new LinkedList<>();
            //for adding add()[strict and it can fail],offer() [not strict and not fail]
            orders.add("Order101");//strict capacity based
            orders.offer("Oder102");//flexible
        System.out.println("Orders:"+orders);
        System.out.println("Serving:"+orders.poll());
//for removal we use remove() which is strict[fail poll()][not srtict[not fail]
        System.out.println("Pending order:"+orders);
//
    }
}

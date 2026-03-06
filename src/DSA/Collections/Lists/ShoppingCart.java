package DSA.Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.remove("Mouse"); //Removes the item
        cart.set(1,"Mechanical Keyboard"); //Update
        System.out.println("Cart items: "+cart);
        System.out.println("Total items: "+cart.size());
    }
}


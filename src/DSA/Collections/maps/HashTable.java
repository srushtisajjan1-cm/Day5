package DSA.Collections.maps;

import java.util.Hashtable;

public class HashTable {
    static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Sharanya");
        ht.put(117, "shreyas");
        ht.put(128, "sonika");
        ht.put(100, "siri");
        ht.put(99, "sunil");
        ht.put(101, "prashanth");
        System.out.println(ht.getOrDefault(101, "Not Found"));
        System.out.println(ht.getOrDefault(130, "Not Found"));
        ht.putIfAbsent(104,"basu");
        System.out.println("Updated Table:"+ht);
    }
}

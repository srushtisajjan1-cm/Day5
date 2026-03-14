package DSA.Collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    static void main(String[] args) {
        Hashtable<Integer,String>ht = new Hashtable<>();
        ht.put(106,"Sharanya");
        ht.put(117,"shreyas");
        ht.put(128,"sonika");
        ht.put(100,"siri");
        ht.put(99,"sunil");
        ht.put(101,"prashanth");
        //ht.put(null,srushti); no null values are allowed in hashtable
        for(Map.Entry<Integer, String>entry:ht.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

    }
}
//here the output comes in the way the values assigned top to bottom and left to right
// and for placing the values they are placed by doing mod//*
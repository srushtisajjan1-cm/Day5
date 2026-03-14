package DSA.Collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    static void main(String[] args) {
        Map<String,String> hashmap = new HashMap<>();
        hashmap.put("01","aaaa");
        hashmap.put("03","yyyy");
        hashmap.put("04","zzzz");
        hashmap.put("02","bbbb");
        for(Map.Entry<String,String>entry:hashmap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        Map<String,String>hashmap1 = new LinkedHashMap<>();
        hashmap1.put("01","aaaa");
        hashmap1.put("03","yyyy");
        hashmap1.put("04","zzzz");
        hashmap1.put("02","bbbb");
        for(Map.Entry<String,String>entry:hashmap1.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());


    }
}}
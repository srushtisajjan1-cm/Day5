package DSA.Collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApiLogs {
    static void main(String[] args) {
        Map<String,String> logs = new LinkedHashMap<>();
        logs.put("2","signup");
        logs.put("3","login");
        logs.put("1","browse videos");
        logs.put("5","logout");
        logs.put("4","signin");
        System.out.println("API logs:"+logs);

    }
}

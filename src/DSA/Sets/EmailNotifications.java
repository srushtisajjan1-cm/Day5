package DSA.Sets;

import java.util.HashSet;
import java.util.Set;

public class EmailNotifications {
    static void main(String[] args) {
        Set<String> emailQueue = new HashSet<>();
        emailQueue.add("sab@gmail.com");
        emailQueue.add("adv@gmail.com");
        emailQueue.add("bse@gmail.com");
        emailQueue.add("sam@gmail.com");
        emailQueue.add("sam@gmail.com");
        emailQueue.add("adv@gmail.com");
        emailQueue.add("sru@gmail.com");
        emailQueue.add("efg@gmail.com");
        emailQueue.add("anaa@gmail.com");
        System.out.println("Emails to send:"+emailQueue);
        System.out.println("Unique emails:"+emailQueue.size());
    }
}

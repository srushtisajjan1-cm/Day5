package threads;

public class DeadlockDemo {
    static final Object accountA = new Object();
    static final Object accountB = new Object();

    static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (accountA) {
                System.out.println("Thread 1 locked Account A");
                try {
                    Thread.sleep(2000);
                }catch(Exception e){}

                synchronized (accountB) {
                    System.out.println("Thread 1 locked Account B");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (accountB) {
                System.out.println("Thread 2 locked Account B");
                try {
                    Thread.sleep(2000);
                }catch(Exception e){}

                synchronized (accountA) {
                    System.out.println("Thread 2 locked Account A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
/*  thread 1 acquires a lock on account  A and then sleeps,giving
Thread 2 to acquire a lock on account B,now thread 1 waits for account A and thread 2 waits for
account B since neither thread releases the lock.both keep waiting and thus creating a deadlock
Deadlock explanation it occurs when each thread is holding  a resource and waiting for the other
to release it

 */
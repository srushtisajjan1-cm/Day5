package threads;

public class TicketTask implements Runnable{
    String task;
    TicketTask(String task){
        this.task =task;
    }
    public void run(){
        System.out.println(task+" in progress.");
    }

    static void main(String[] args) {
        Thread t1 = new Thread(new TicketTask("Seat Assignment"));
        Thread t2 = new Thread(new TicketTask("Payment Processing"));
        Thread t3 = new Thread(new TicketTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
⭐Each runnable object is a job and the thread class is
responsible only for execution,which makes this approach cleaner and more
flexible
⭐implements runnable
⭐better design
⭐interviewers mostly ask this
⭐supports multiple inheritance via interfaces

 */
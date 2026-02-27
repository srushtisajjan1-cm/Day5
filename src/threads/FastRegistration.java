package threads;

public class FastRegistration {
    static class FormFilling extends Thread{
        public void run(){
            System.out.println("Form Filling Started!");
        }
    }
    static class DocumentsUpload extends Thread {
        public void run() {
            System.out.println("Documents upload started!");
        }
    }
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("Confirmation email sent!");
        }
    }

    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();

    }
}
/*Java program starts with one main thread
threads allow parallel execution -> concurrency
output order is nit guranteed
threads share the same memory
Improves the performance and responsiveness
when start() is called,the JVM creates a new thread
when run() is called directly,there is no concurrency
process vs thread
process is running a prgm
thread a path of execution inside the prgm
a process has its own memory
threads share the same memory
creating a thread is cheaper than creating a process
ex process -> chrome browser thread ->new tab of chrome
closing a tab will not close chrome or kill chrome


 */
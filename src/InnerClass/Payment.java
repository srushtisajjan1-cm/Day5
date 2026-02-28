package InnerClass;
public  interface Payment {
    void pay();
}
class PaymentDemo {
    static void main(String[] args) {
        Payment p = new Payment() {
            public void pay() {
                System.out.println("Payment done using credit card.");
            }

        };
        p.pay();
        Payment p1 = () -> System.out.println("Cash Payment");
        p1.pay();
    }
}
package InnerClass;

public class BankAccount1{
    private double balance= 10000;
    class Transaction{
        void withdraw(double amount){
            if(amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn:" + amount);
            }else{
                System.out.println("Insufficient Funds");
            }
        }
    }

 public static void main(String[] args) {
    BankAccount1 account = new BankAccount1();
    //Outer,Inner in_obj = out_obj.new inner()
    BankAccount1.Transaction tx = account.new Transaction();
    tx.withdraw(3000);
    tx.withdraw(3000);
     System.out.println("final balance:" + account.balance);

}
}

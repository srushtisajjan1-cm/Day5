package Exception;

public class Demo {
   public static void main(String[] args) {
       try {
           int balance = 2000;
           int withdraw = 7000;
           if (withdraw > balance) {
               throw new ArithmeticException("Insufficient Funds!");
           }
               System.out.println("Withdrawal successful.");
       }catch(ArithmeticException e){
           System.out.println("Caught Exception:" + e.getMessage());
       }
       }


    }


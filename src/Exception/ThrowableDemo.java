package Exception;

public class ThrowableDemo {
    static void test() throws Throwable {
        throw new Throwable("something went wrong");
    }

    public static void main(String[] args) {
        try {
            test();
        }catch(Throwable t){
            System.out.println("Handled:"+t);
            System.out.println("Handled:" +t.getMessage());
        }
    }
}
/*
throw new String("Error");❌
throw new Integer("error");❌
throw new throwable("Error");✅
throw new Exception("Error");✅
throw new RuntimeException("Error");✅
throw new IOException("Error");✅
*/

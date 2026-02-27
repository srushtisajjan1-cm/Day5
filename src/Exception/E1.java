package Exception;

public class E1 {
    public static void main(){
        int i,j,k=0;
        i=10;
        j=0;
        try{
            k = i / j;
            int [] arr = {1,2,3,4,5};

        } catch (Exception e) {
            System.out.println("Something unexpected happened");
        }finally{
            System.out.println("end execution");
            System.out.println("turn off DB");
            System.out.println("turn off internet");
            System.out.println("turn off files");
            System.out.println("turn off srushti");
        }
        System.out.println("the value of k is:"+k);
    }
    static {
        System.out.println("start execution");
        System.out.println("load DB");
        System.out.println("load internet");
        System.out.println("load files");
        System.out.println("load srushti");
    }
}

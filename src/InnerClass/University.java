package InnerClass;

public class University {
    static class Admission{
        static boolean isEligible(int marks)
        {
            return marks>=60;
        }
    }
    static class Scholorship{
        static boolean isEligible(int marks){
            return marks>=90;
        }
    }
    public static void main(String[] args) {
        boolean result=University.Admission.isEligible(45);
        System.out.println(result);
        boolean result2=University.Admission.isEligible(63);
        System.out.println(result2);
        boolean result3=University.Scholorship.isEligible(73);
        System.out.println(result3);
    }
}
    /* No university object needed
    Logical grouping of data improves readability
    similar to creating utility hepler classes
     */


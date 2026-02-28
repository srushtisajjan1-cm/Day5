package arrays;

public class E6 {
    static void display(int... arr) {
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        display(arr);

    }
}

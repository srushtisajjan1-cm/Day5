package DSA.sorting;
import java.util.Arrays;

public class CountSort {
    static void countSort(int[] arr) {
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > k) {
                k = arr[i];
            }
        }
        //step2 create a count array[0 max]
        int[] count = new int[k + 1];
        //step3 calculate the freq of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
            //step4 calculate the cumulative frequency
            //step index 0 and start from 1 till max(k)
            for (int i = 1; i <= k; i++) {
                //curr =curr+prev
                count[i] += count[i - 1];
            }
            int[] output = new int[arr.length];
            for (int i = arr.length - 1;i>=0; i--) {
                output[--count[arr[i]]] = arr[i];
            }
            System.arraycopy(output, 0, arr, 0, arr.length);
        }
        public static void main (String[]args){
            int[] arr = {1, 2, 3, 3, 2, 4, 7, 8};
            System.out.println(Arrays.toString(arr));
            countSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
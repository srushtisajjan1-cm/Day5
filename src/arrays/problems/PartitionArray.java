package arrays.problems;

public class PartitionArray {
    static void main(String[] args) {
        int[] arr = {3, 8, 5, 12, 7, 6};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0) {
                left++;//if the left side has even nos move forward
            }
            while (arr[right] % 2 != 0) {
                right--;//if the right side has odd nos move backwards
            }
            if (left < right) { //if the right side hAS ODD NUMBERS,MOVE BACKWARDS
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for (int x : arr) {
            System.out.println(x + " ");
        }
    }
}
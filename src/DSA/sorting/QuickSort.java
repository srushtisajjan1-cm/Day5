package DSA.sorting;
import java.util.Arrays;
public class QuickSort {
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

    static int partitionIndex(int[]arr,int s,int e) {
        int pivot=arr[s];
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<pivot){
                count++;
            }
        }
       //place pivot at the correct place or at index
       int pivotIndex = s+count;
        swap(arr,pivotIndex,s);
        //lets manage the right and left side of pivot
        int i =s,j=e;
        while(i<pivotIndex && j > pivotIndex){
            while(arr[i]<pivot) {
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i++,j--);
            }
        }
        return pivotIndex;
    }

    static void quickSort(int[] arr,int s,int e) {
        //base class //if single element or outofbounds
        if(s>=e){
            return;
        }
        //find the pivot for the partition of the array
        int p = partitionIndex(arr,s,e);
        //now we use recursion to sort the lhs and rhs
        //left part
        quickSort(arr,s,p-1);
        //right part
        quickSort(arr,p+1,e);
    }

    static void main(String[] args) {
        int[] arr = { 1,4,5,6,9,8,0};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
}



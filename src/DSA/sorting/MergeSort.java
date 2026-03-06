package DSA.sorting;


import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr,int s,int mid,int e){
        //sizes of the two subarrays to be merged
        int n1=mid-s+1;
        int n2=e-mid;
        //temporary arrays
        int[] L =new int[n1];
        int[] R =new int[n2];
        //copy the data to the temporary arrays
        for(int i=0;i<n1;i++){
            L[i]=arr[s+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }
        //Initial indexes of first and second subarrays
        int i=0,j=0;
        //Initial index of the merged subarray
        int k=s;
        while(i<n1 && j<n2){
            if (L[i] <= R[j]) {
                arr[k++]=L[i++];
            }else{
                arr[k++]=R[j++];
            }
        }
        //copy remaining elements from L[] if any
        while (i<n1){
            arr[k++]=L[i++];
        }
        //copy remaining elements from R[] if any
        while(j<n2){
            arr[k++]=R[j++];
        }
    }
    public static void mergeSort(int[] arr,int s,int e){
        if(s<e){
            //find the middle point
            int mid=s+(e-s)/2;
            //sort first and second class
            mergeSort(arr,s,mid);
            mergeSort(arr,mid+1,e);
            //merge the sorted half in to one
            merge(arr,s,mid,e);
        }
    }

    public static void main(String[] args) {
        int[] arr={5,2,4,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

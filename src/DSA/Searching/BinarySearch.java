package DSA.Searching;

public class BinarySearch {
    static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length -1;
        while(s<e){
            int mid = s +(e-s)/2;
            if(arr[mid]==key) {
                return mid;
            }else if(arr[mid] <key) {
                s = mid + 1;//go to right side to find key
            }else{
                e = mid -1;//go to left side to find key
            }
        }
        return -1;//if key was not found then return an invalid index
    }

    static void main(String[] args) {
        int[] arr = { 2,4,6,8,9,12};
        System.out.println(binarySearch(arr,800));
        System.out.println(binarySearch(arr,6));
    }
}

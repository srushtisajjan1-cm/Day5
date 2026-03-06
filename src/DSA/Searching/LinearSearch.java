package DSA.Searching;

public class LinearSearch {
        static int linearSearch(int[] arr,int target){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == target){
                    return i; //if target is found,return the index
                }
            }
            return -1;//if not found return an invalid index
        }

        static void main(String[] args) {
            int[] arr ={10,52,0,8,1,3};
            System.out.println(linearSearch(arr,80));//-1
            System.out.println(linearSearch(arr,8));//-3

        }
    }



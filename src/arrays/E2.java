package arrays;

public class E2 {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[1]);
        arr[1] = 40;
        System.out.println(arr[1]);
        //access and upadte elements in an array -.> TC 0(1)
        //this is bcz pf index based access or
        //direct index mapping
        //[idx = pos -1]or[pos = idx +1]
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
        String name = "Java";
        System.out.println(name.length());//length() method
/* array.length is a property
string.length is a method
memory management
array obj is stored in heap
variable ref is stored in stack
elements are stored in contiguos memory blocks
char[1][1][1][1] int[4][4][4][4]double[8][8][8][8]bytes
 */
    }
}
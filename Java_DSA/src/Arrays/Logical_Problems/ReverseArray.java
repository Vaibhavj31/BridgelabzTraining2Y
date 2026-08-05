//
//public class ReverseArray {
//    static void main(int arr[], int a, int b){
//
//    }
//}
package Arrays.Logical_Problems;

public class ReverseArray {
    static void reverse(int arr[]) {
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("This is Original Array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThis is Reversed Array");
        reverse(arr);
    }
}
package Arrays.Logical_Problems;

import java.util.Scanner;
public class FirstRepeating {
    public static void display(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int firstRepeating(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        display(arr);
        int ans = firstRepeating(arr);
        if(ans==-1){
            System.out.println("No repeating element found.");
        }else{
            System.out.println("First repeating element: " + ans);
        }
    }
}
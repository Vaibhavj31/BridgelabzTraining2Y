package Arrays.Leetcode;
import java.util.Scanner;
import java.util.Arrays;

public class Problem414 {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        for(int i=n-1; i>0; i--){
            if(nums[i] != nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i - 1];
            }
        }
        return nums[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int answer = thirdMax(nums);
        System.out.println("Third maximum = " + answer);
    }
}
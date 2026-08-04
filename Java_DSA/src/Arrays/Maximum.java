public class Maximum{
    static int max(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 15, 7, 3};
        System.out.println("Maximum = " + max(arr));
    }
}
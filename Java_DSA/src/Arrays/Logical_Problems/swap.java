package Arrays;

public class swap{
    static void swap(int[] arr){
        int temp=arr[0];
        arr[0]=arr[4];
        arr[4]=temp;
    }
        public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
            swap(arr);
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
}

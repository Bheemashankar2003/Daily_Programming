package Arrays;

public class AA {
    
    public static void main(String[] args) {
        
        int [] arr = {8, 9, 7, 4, 1, 1, 2};
        int start = 0;
        int end = 0;

        /// o/p = 2,1,1,4,7,9,8;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start--;
            end++;
        }

        for(int num : arr){
            System.out.println(num+" ");
        }

    }
}

package Arrays;

public class Rev {
    
    public static void main(String[] args) {
        
        int [] arr = {2, 5, 4, 5, 7, 8, 0};
        int start = 0;
        int end = arr.length-1;

        // for(int i = arr.length-1;i>=0;i--){
        //     System.out.println(arr[i]);
        // }

        //or

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}

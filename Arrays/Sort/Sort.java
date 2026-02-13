package Arrays.Sort;

import java.util.Arrays;

public class Sort {
    
    public static void main(String[] args) {
        
        int [] arr = {12, 34, 65, 78, 90, 80};
        int max = arr[0];
        
        for(int i = 0 ;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }}}

            System.out.println(Arrays.toString(arr));

        // for(int n : arr){
        //     System.out.print(n+" ");
        // }
    }
}

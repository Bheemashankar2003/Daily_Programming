package Arrays;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        
        int [] arr = {12, 45, 57 , 78, 90, 1};


        // for(int i = 0 ;i<arr.length;i++){
        //     for(int j = i+1;j<arr.length;j++){
        //         if(arr[i] > arr[j]){
        //             int num = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = num;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

        //or
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

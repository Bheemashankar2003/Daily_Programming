package Arrays;

public class SecondMax {
    
    public static void main(String[] args) {
        
        int [] arr = {34, 56, 67, 78, 90};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){

                if(arr[i] > arr[j]){
                    max = smax;
                }else if(arr[i] <= smax && arr[i]!=max){
                    smax = max;
                }
            }
        }
        
        System.out.println(smax);
    }
}

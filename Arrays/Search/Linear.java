package Arrays.Search;

public class Linear {
    public static void main(String[] args) {
        
        int [] arr = {23, 45, 65, 67, 87};
        int ele = 23;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == ele)
              System.out.println("element found at the index: "+i);
        }
          System.out.println("elements not found ");
    }
}

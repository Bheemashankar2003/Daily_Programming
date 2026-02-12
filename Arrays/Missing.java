package Arrays;

public class Missing {
    

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 5};
        int n = arr.length+1;

        int sum = n*(n+1)/2;
        int num = 0;

        for(int a : arr){
            num+=a;
        }

        int missing = sum - num;
        System.out.println("missing element: "+missing);
    }
}

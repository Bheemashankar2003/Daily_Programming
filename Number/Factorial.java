package Number;

public class Factorial {
    public static void main(String[] args) {
        
        int num = 15;
        int original = 0;

        while(num>0){
            int fact = 1;
            int n = num % 10;
            for(int i = 1;i<=n;i++){
                fact =fact*i ;
            }
            original+=fact;
            num/=10;
        }
        System.out.println(original);
        
        // while(num>0){

        //     int fact = 1;
        //     int n = num%10;
        //     for(int i = 1;i<=n;i++){
        //         fact = fact*i;
        //     }
        //     original+=fact;
        //     num/=10;
        // }
        // System.out.println(original);
    }
}

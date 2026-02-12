package Number;

import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        boolean prime = true;

        if(num<0)
         prime = false;
        else{
            for(int i = 2;i<=num/2;i++){
                if(num % i == 0){
                    prime = false;
                    break;
                }
            }
        }

        if(prime)
          System.out.println("is prime");
        else 
          System.out.println("is not a prime");
    }
}

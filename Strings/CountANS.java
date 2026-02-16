package Strings;

public class CountANS {
    
    public static void main(String[] args) {
        
        String s1 = "hello 345 ^()$";
        int alpha = 0;
        int num =0;
        int sym = 0;

        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch>='a' && ch<='z')
              alpha++;
            else if(ch>='0' && ch<='9')
              num++;
            else
              sym++;
        }

        System.out.println("count of alphabets: "+alpha);
        System.out.println("count of numbers: "+num);
        System.out.println("count of symbols: "+sym);
        
    }
}

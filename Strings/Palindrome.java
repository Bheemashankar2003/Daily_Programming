package Strings;

public class Palindrome {
    
    public static void main(String[] args) {
        
        String name = "madam";
        String rev= "";

        for(int i = name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        if(rev.equals(name))
          System.out.println("is palindrome");
        else
          System.out.println("is not palindrome");
    }
}

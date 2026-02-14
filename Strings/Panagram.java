package Strings;

public class Panagram {
    
    public static void main(String[] args) {
        
        String s = "the quick brown fox jumps over the lazy dog";

        boolean [] alpha = new boolean[26];
        s = s.toLowerCase();

        //removing dublicates
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                alpha[ch-'a'] = true;
            }
        }

        //checking all the 26 charecters present
        for(int i = 0;i<26;i++){
          if(!alpha[i]){
            System.out.println("is not an panagram");
            return;
          }
        }
        System.out.println("is panagram");
}
}

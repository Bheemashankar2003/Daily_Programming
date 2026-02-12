package Arrays;

import java.util.HashMap;

public class Frequency {
    
    public static void main(String[] args) {

        int [] arr = {23, 43, 23, 77, 89, 43, 77, 1};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num: arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        System.out.println(hm);
    }
}

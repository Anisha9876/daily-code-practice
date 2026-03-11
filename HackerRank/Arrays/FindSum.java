package HackerRank.Arrays;

import java.util.HashMap;

public class FindSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,2,9};
        int target=9;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int key:arr){
            if(map.containsKey(target-key)){
                System.out.print(target-key+" "+key+" ");
            }
            map.put(key,1);
        }
    }
}

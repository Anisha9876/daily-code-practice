package HackerRank.Arrays;

import java.util.HashMap;

public class FindMajorityElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,4,5,3,3};
        HashMap<Integer,Integer> map= new HashMap<>();
        int c=0;
        int l=0;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet() ){
            if(map.get(key)>c){
                c=map.get(key);
                l=key;
            }
        }
        System.out.print("Frequently occur number is "+l);
    }
}

package HackerRank.Arrays;

import java.util.HashMap;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,5,6,7,7};
        int dup;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>1){
                System.out.println("Duplicate "+ i);
                break;
            }

        }
    }
}

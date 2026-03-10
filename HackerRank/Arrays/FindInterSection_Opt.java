package HackerRank.Arrays;

import java.util.HashMap;

public class FindInterSection_Opt {
    public static void main(String[] args) {
        int[] arr1={1,2,4,3,2};
        int[] arr2={4,5,7,2,3,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],0);
        }
        for(int n:arr2){
            if(map.containsKey(n)){
                System.out.print(n+" ");
                map.remove(n);
            }
        }
    }
}

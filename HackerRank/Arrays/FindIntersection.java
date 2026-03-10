package HackerRank.Arrays;

import java.util.HashMap;

public class FindIntersection {
    public static void main(String[] args) {
        int[] arr1={1,2,4,3,2};
        int[] arr2={4,5,7,2,3,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],0);
        }
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                map.put(arr2[i],arr2[i]);
            }
        }
        for(int n:map.keySet()){
            if(map.get(n)== n){
                System.out.print(n+" ");
            }
        }
    }
}

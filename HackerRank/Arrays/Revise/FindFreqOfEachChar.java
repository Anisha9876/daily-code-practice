package HackerRank.Arrays.Revise;

import java.util.HashMap;

public class FindFreqOfEachChar {
    public static void main(String[] args) {
        String str="Anisha";
        String s=str.toUpperCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}

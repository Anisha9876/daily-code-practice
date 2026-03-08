package HackerRank.Strings;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        String s="Anishaaa";
        String str=s.toLowerCase();
        int c=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}

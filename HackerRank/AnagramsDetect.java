package HackerRank;

import java.util.HashMap;

public class AnagramsDetect {
    public static void main(String[] args) {
        String s1="CAT";
        String s2="Tacj";
        int c=0;int c2=0;
        String ns1=s1.toUpperCase();
        String ns2=s2.toUpperCase();
        if(ns1.length()!=ns2.length()){
            System.out.println("It's not an anagrams...");
            return;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character ch:ns1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
//        for(Character key:map.keySet()){
//            System.out.println(key+"-> "+map.get(key));
//        }
        for(Character ch2:ns2.toCharArray()){
            if(!map.containsKey(ch2)){
                System.out.println("It's not an Anagrams Number...");
                return;
            }
            map.put(ch2,map.getOrDefault(ch2,0)-1);
        }
        for(Character key:map.keySet()){
            if(map.get(key)!=0){
                System.out.println("It's Not an anagram number ...");
                return;
            }
        }
        System.out.println("it's an anagrams number...");
    }
}

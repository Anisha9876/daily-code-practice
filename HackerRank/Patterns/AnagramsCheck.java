package HackerRank.Patterns;

import java.util.HashMap;

public class AnagramsCheck {
    public static void main(String[] args) {
        //If the same letters are in different order known as anagrams
        String str1="teaa";
        String str2="eatt";

        HashMap<Character,Integer> map=new HashMap<>();
        if(str1.length() !=str2.length()){
            System.out.println("It's not anagram..");
            return;
        }
        for(char c:str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char ch:str2.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch)==0){
                System.out.println("It's not anagram..");
                return;
            }
            map.put(ch,map.get(ch)-1);

        }
        System.out.println("Anagrams");

    }
}

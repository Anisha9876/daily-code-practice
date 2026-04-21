package HackerRank.Strings;

import java.util.HashMap;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String str="aabbccdee";
        if(str==null || str.length()==0){
            System.out.println("Invalid");
            return;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Character key:str.toCharArray()){
            if(map.get(key)==1){
                System.out.println(key);
                return;
            }
        }
        System.out.println("It contain all duplicates");
    }
}

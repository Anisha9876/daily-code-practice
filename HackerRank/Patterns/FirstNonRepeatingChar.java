package HackerRank.Patterns;

import java.util.HashMap;

public class FirstNonRepeatingChar{
    public static void main(String[] args) {
        String str="mming";

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);

        }
        for(Character ch:str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }

    }
}

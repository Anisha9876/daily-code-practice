package DSA.Array.SlidingWindow.Brut;

import java.util.HashSet;

public class LongestSubstring_secnd {
    public static void main(String[] args) {
        String str="pkkmpr";
        String longStr="";
        int maxLen=0;
        for(int i=0;i<str.length();i++){
            HashSet<Character> set = new HashSet<>();

            for(int j=i;j<str.length();j++){
                char ch = str.charAt(j);

                if(!set.contains(ch)){
                    set.add(ch);

                    if(set.size() > maxLen){
                        maxLen = set.size();
                        longStr = str.substring(i, j+1);
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(longStr);

    }
}

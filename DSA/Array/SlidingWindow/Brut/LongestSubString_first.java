package DSA.Array.SlidingWindow.Brut;

import java.util.HashSet;

public class LongestSubString_first {
    public static void main(String[] args) {
        //longest subString which contain no repeating character

        String str="You live in this cruel world where no one help";
        int i=0;
        String longStr="";
        String str1="";
        HashSet<Character> set=new HashSet<>();
        while(i<str.length()){
            char ch=str.charAt(i);
            if(ch !=' '){
                if(!set.contains(ch)) {
                    str1=str1+ch;
                    set.add(ch);
                    i++;
                }
                else{
                    str1="";
                    set.clear();
                    i++;
                }

            }
            else{
                set.clear();
               if(longStr.length()<str1.length()){
                   longStr=str1;
               }
                str1="";
                i++;
            }
        }
        System.out.println(longStr);

    }
}

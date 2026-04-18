package DSA.Array.SlidingWindow.Optimal;

import java.util.HashSet;

public class LongSubString_Final {
    public static void main(String[] args) {
        //Longest Substring which contains non-repeating value
        String str="pwwkew";
        String longStr="";
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int left=0,right=0;
        while(right<str.length()){
            char ch=str.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                if (right-left+1 >maxLen ) {
                    maxLen=right-left+1;
                    longStr = str.substring(left,right+1);
                }
                right++;

            }
            else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        System.out.println(longStr);

    }
}

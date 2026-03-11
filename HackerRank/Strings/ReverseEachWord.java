package HackerRank.Strings;

import java.util.ArrayList;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s=" Is this a cat ";
        String sent=s.toLowerCase();
        ArrayList<String> arr=new ArrayList<>();
        String word="";

        for(int i=sent.length()-1;i>=0;i--){
            if(sent.charAt(i) !=' '){
                word=word+sent.charAt(i);
            }
            else{
                String rev="";
               for(int j=word.length()-1;j>=0;j--){
                   rev=word.charAt(j)+rev;

               }
                System.out.print(rev+" ");
                word="";

            }
        }


    }
}

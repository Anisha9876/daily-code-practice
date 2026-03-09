package HackerRank.Patterns;

import java.util.ArrayList;

public class ReverseASentence {
    public static void main(String[] args) {
        String sent="I am a good girl"+" ";
        String word="";
       ArrayList<String> al=new ArrayList<>();
       for(int i=0;i<sent.length();i++){
           if(sent.charAt(i) !=' '){
               word=word+sent.charAt(i);
           }
           else{
               al.add(word);
               word="";
           }
       }
       for(int i=al.size()-1;i>=0;i--){
           System.out.print(al.get(i)+" ");
       }
    }
}

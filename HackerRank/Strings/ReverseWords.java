package HackerRank.Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String word=" "+"I have a pen";
        String res="",sent="";
       for(int i=word.length()-1;i>=0;i--){
           if(word.charAt(i) !=' '){
               res=word.charAt(i)+res;
           }
           else{
               sent=sent+res+" ";
               res="";
           }
       }
        System.out.println(sent);
    }
}

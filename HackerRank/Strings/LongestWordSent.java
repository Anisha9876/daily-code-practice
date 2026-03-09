package HackerRank.Strings;

public class LongestWordSent {
    public static void main(String[] args) {
        String str="I am a Good Girls"+" ";
        int longStr=0;
        String longWord="";
        String word="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word=word+str.charAt(i);
            }
            else{
                if(longStr < word.length()){
                    longStr=word.length();
                    longWord=word;

                }
                word=" ";
            }
        }
        System.out.println("Longest word :"+ longWord);

    }
}

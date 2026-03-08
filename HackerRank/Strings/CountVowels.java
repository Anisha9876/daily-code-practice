package HackerRank.Strings;

public class CountVowels {
    public static void main(String[] args) {
        String str="Anisha";
        int vowelsCount =0;
        for(Character ch:str.toLowerCase().toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelsCount++;
            }
        }
        System.out.println("Total Vowels Present in the String "+ vowelsCount);




    }
}

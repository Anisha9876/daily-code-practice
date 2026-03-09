package HackerRank.Strings;

public class CompareString {
    public static void main(String[] args) {

        String str1="Anisha";
        String str2="Anisba";
        boolean sameWord=false;
        if(str1.length() !=str2.length()){
            sameWord=false;
        }
        else{
        for(int i=0;i<str1.length();i++){

                if(str1.charAt(i)!=str2.charAt(i)){
                    sameWord=false;
                    break;
                }
                else{
                   sameWord=true;
                }

        }}
        if(sameWord){
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
    }
}

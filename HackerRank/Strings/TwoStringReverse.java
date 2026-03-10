package HackerRank.Strings;

public class TwoStringReverse {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="DABC";
        boolean isRev=true;
        String con=str1+str1;
        if(str1.length() ==str2.length() && con.contains(str2)){
            System.out.println("Rotation");
        }
        else{
            System.out.println("Not Rotation");
        }


    }
}

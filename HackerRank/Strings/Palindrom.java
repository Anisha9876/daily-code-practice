package HackerRank.Strings;

public class Palindrom {
    public static void main(String[] args) {
        String s="MADAM";
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number ");
        }

    }
}

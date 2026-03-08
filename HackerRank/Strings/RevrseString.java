package HackerRank.Strings;

public class RevrseString {
    public static void main(String[] args) {
        String str="Anisha";
        String rev="";
        String s=str.toUpperCase();
        System.out.println("Original string "+ s);

        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("Reverse String "+rev);
    }
}

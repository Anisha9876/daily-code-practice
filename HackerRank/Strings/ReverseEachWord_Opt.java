package HackerRank.Strings;

public class ReverseEachWord_Opt {
    public static void main(String[] args) {
        String str="SHE IS A QUEEN"+" ";
        String[] words = str.split(" ");
        for(String s:words){
            StringBuilder sb=new StringBuilder(s);
            System.out.print(sb.reverse()+" ");
        }
    }
}

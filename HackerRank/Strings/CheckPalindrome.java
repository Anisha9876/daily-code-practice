package HackerRank.Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str="madama";
        if (str == null || str.length() == 0){
            System.out.println("Invalid");
            return;
        }
        str=str.toLowerCase();
        int s=0,e=str.length()-1;

        while(s<e){
            if(str.charAt(s)==str.charAt(e)){
                s++;
                e--;
            }
            else{
                System.out.println("It's not a palindrome");
                return;
            }
        }
        System.out.println("It is palindrome");
    }
}

package HackerRank.Numbers;

public class CheckingPowOf2_opt {
    public static void main(String[] args) {
        int n=32;
        if(n>0 && ((n & (n-1))==0)){
            System.out.println("Pow of 2");
        }
        else{
            System.out.println("Not pow of 2");
        }
    }
}

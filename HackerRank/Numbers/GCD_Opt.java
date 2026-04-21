package HackerRank.Numbers;

public class GCD_Opt {
    public static void main(String[] args) {
        //Euclidean method
        //where we count gcd(a,a mod b)
        int a=10,b=5;
        int temp;
        while(b!=0){
            temp=b;
            b=b%a;
            a=temp;
        }
        System.out.println("gcd "+a);
    }
}

package HackerRank.Numbers;

public class GCD_Better {
    public static void main(String[] args) {
        int a=2,b=5;
        int gcd=0;
        int m=Math.min(a,b);
        int i=1;
        while( m>=i){
            if(a%i==0 && b%i==0){
                gcd=Math.max(gcd,i);
            }
            i++;
        }
        System.out.println(gcd);
    }
}

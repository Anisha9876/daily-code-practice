package HackerRank.Numbers;

public class GCD {
    public static void main(String[] args) {
        int a=2,b=5;
        int gcd=0;
        for(int i=1;i<=a*b;i++){
            if(a%i==0 && b%i==0){
                gcd=Math.max(gcd,i);
            }
        }
        System.out.println("GCD= "+gcd);
    }
}

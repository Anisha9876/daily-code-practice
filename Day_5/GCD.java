package Day_5;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number ");
        int n2=sc.nextInt();
        int min=Math.min(n1,n2);
        int gcd=min,i=1;
        while(i<=min){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
            i++;
        }
        System.out.println("GCD  = "+gcd);

    }
}

package Day_5;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal number ");
        int n=sc.nextInt();
        int rem,deci=0,revBin=0,rem2;
        int place=1;
        while (n>0){
            rem=n%2;
            deci=(rem*place)+deci;
            place=place*10;
            n=n/2;
        }
        System.out.println(deci);
    }
}

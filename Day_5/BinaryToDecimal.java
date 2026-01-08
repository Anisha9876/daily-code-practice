package Day_5;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("You should pass only 1 or 0 binary number ");
        int bin=sc.nextInt();
        String str=Integer.toString(bin);
        int count=str.length();
        int i=0,sum=0,rem;
        while(i<count){
            rem=bin%10;
            if (rem != 0 && rem != 1) {
                System.out.println("Invalid binary number");
                return;
            }

            sum=sum+rem*((int)Math.pow(2,i));
            bin=bin/10;
            i++;
        }
        System.out.println(sum);
    }
}

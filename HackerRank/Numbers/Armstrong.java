package HackerRank.Numbers;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        String str = String.valueOf(n);
        int len = str.length();
        int digit;
        int i=len;
        while (i > 0) {
            digit = num % 10;
            sum = sum + (int)Math.pow(digit,len);
            num = num / 10;

            i--;
        }

        if (sum ==  n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");

        }
    }
}

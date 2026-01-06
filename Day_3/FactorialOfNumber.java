package Day_3;
import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num ");
        int n=sc.nextInt();

        long fact=1;
        int i=1;
        if(n==0){
            System.out.println("Factorial ="+ 1);
            return;
        }
        if(n<0){
            System.out.println("enter positive number ");
            return;
        }
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("factorial = "+fact);

    }
}

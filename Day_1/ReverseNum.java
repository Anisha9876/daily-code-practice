package Day_1;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        //Question:
        //Write a Java program to reverse a given integer number.

        //Example:
        //Input: 1234
        //Output: 4321

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter as number: ");
        int n= sc.nextInt();
        int org=n;
        int rev=0,rem=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("originial "+ org);
        System.out.println("reverse "+rev);


    }
}

package Day_3;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        boolean isPrm=true;
        int i=2;
        while(i<n) {
            if(i%n==0){
                isPrm=false;
            }
            i++;
        }
        if(isPrm){
            System.out.println("It's a prime number ");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}

package Day_1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
Question:
Write a Java program to check whether a given number is a palindrome.

Example:
Input: 121
Output: Palindrome

Input: 123
Output: Not Palindrome

         */

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
        if(org==rev){
            System.out.println("palindrom number");
        }
        else{
            System.out.println("It's not palindrom number ");
        }
    }
}

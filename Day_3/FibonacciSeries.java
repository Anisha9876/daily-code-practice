package Day_3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
         int n=sc.nextInt();

         if(n==0){
             System.out.println("Plz enter another num");
             return;
         }
         if(n==1){
             System.out.println(0);
             return;
         }
         int num1=0,num2=1;
        System.out.print(num1 +" "+ num2 +" ");
         int num3,i=1;
         while(i<=n-2){
             num3=num1+num2;
             num1=num2;
             num2=num3;
             System.out.print(num3 +" ");
             i++;
         }
    }
}

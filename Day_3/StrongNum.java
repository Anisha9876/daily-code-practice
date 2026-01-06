package Day_3;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n= sc.nextInt();
        //Optimal Solution
        int rem=0,sum=0,num=n;
        int[] fact= new int[10];
        fact[0]=1;
        for(int i=1;i<=9;i++){
            fact[i]=fact[i-1]*i;
        }

        while(n>0){
            rem=n%10;
            sum=sum+fact[rem];
            n=n/10;

        }

        if(sum==num){
            System.out.println("is a strong number");
        }
        else {
        }    System.out.println("not a strong number");


    }
}

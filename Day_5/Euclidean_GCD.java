package Day_5;

import java.util.Scanner;

public class Euclidean_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int n1=sc.nextInt();
        System.out.println("Enter Second Num ");
        int n2=sc.nextInt();

        int res=gcdFind(n1,n2);
        System.out.println("gcd "+res);
    }

    public static int gcdFind(int n1,int n2){
        int temp;
        while(n2>0) {
            temp = n2;
            n2 = n1 % n2;
            n1 = temp;

        }
        return n1;
    }
}

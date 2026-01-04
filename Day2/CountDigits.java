package Day2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        int count=0,rem;
        while(num>0){

            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}

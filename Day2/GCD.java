package Day2;

import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number ");
        int num=sc.nextInt();
        System.out.println("2nd one : ");
        int num2=sc.nextInt();
        int i=1,result=0;
        while(i<=num*num2){
            if(i%num==0 && i%num2==0){
                result=Math.max(i,result);
            }
            i++;
        }
        System.out.println("GCD = "+result);
    }
}

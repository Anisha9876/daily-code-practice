package Day2;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        int org=num,sum=0,rem;
       String s= Integer.toString(num);
       int len=s.length();
       while(num>0){
           rem=num%10;
           sum= (int) (sum+ Math.pow(rem,len));
           num=num/10;
       }
      String result= (org==sum) ? "Armstrong number " : "Not an Armstrong number";
        System.out.println(result);
    }
}

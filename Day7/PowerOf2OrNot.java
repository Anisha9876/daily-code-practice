package Day7;

import java.util.Scanner;

public class PowerOf2OrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int count=0;
        //2-3 =8
        int dev;

        while(n>0){

            dev=n/2;
            if(dev%2!=0){
                count++;
            }
            n=dev;

        }
        if(count==0){
            System.out.println("Yest it is the power of the 2 ");
        }
        else{
            System.out.println("It's not the power of the number");
        }

    }
}

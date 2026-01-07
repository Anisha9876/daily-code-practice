package Day_4;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        int lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int n1=sc.nextInt();
        System.out.println("Enter Second Num ");
        int n2=sc.nextInt();
        int i=1;
        while(i<=n1*n2){
            for(int j=1;j<=n1*n2;j++)
            {
                if(n1*i==n2*j){
                    lcm=n2*j;
                    System.out.println(lcm );
                    return;
                }
            }
            i++;
        }



    }
}

package HackerRank.Strings;
import java.util.*;
public class Q1_Valid {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int c1=0,c2=0;
        for(int i=0;i<s.length;i++){
            if(Objects.equals(s[i], "#")){
                c1++;
            }
            else if(Objects.equals(s[i],"*")){
                c2++;
            }
            else{
                System.out.println("not valid");
            }
        }
        if(c1==c2){
            System.out.println("valid");
        }
        else if(c1>c2){
            System.out.println(c2-c1);
        }
        else if(c2>c1){
            System.out.println(c2-c1);
        }

    }
}
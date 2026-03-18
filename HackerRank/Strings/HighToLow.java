package HackerRank.Strings;
import java.util.*;
public class HighToLow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        String[] s=str.split(",");
        int i=0,j=0,k=s.length-1;
        while(j<=k){
            if(Objects.equals(s[j], "0")){
                String temp=s[i];
                s[i]=s[j];
                s[j]=temp;
                i++;
                j++;
            }
            else if(Objects.equals(s[j], "1")){
                j++;
            }
            else if(Objects.equals(s[j], "2")){
                String temp=s[k];
                s[k]=s[j];
                s[j]=temp;
                k--;
            }

        }
        for(String s1:s){
            System.out.print(s1+" ");
        }
    }
}

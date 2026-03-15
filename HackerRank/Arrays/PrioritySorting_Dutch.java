package HackerRank.Arrays;
import java.util.*;
public class PrioritySorting_Dutch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String[] str= sc.nextLine().split(",");
        int s=0,e=0,k=str.length-1;
        while(e<=k){
            int i=Integer.parseInt(str[e].trim());

            if(i==0){
                String temp=str[e];
                str[s]=str[e];
                str[e]=temp;
                s++;
                e++;
            }
            else if(i==1){
                e++;
            }
            else if(i==2){
                String temp=str[k];
                str[k]=str[e];
                str[e]=temp;
                k--;
            }
        }
        for(String ch:str){
            System.out.print(ch+" ");
        }

    }
}

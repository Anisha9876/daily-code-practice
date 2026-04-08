package HackerRank.Arrays;

import java.util.Arrays;

public class IsArrayContainDuplicates {
    public static void main(String[] args) {
        int[] a={1,3,2,6};
        Arrays.sort(a);
        int i=0,j=1;
        boolean f=false;
        while(j<a.length){
            if(a[i]==a[j]){
                f=true;
                break;
            }
            else{
                i++;
                j++;
            }
        }
        if(f){
            System.out.println("It's contain duplicates ");
        }
        else{
            System.out.println("It's doesn't contain duplicates");
        }
    }
}

package HackerRank.Numbers;

import java.util.Arrays;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        int n=arr.length+1;
        int sum1= n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2=sum2+arr[i];
        }
        System.out.println("So the missing number is : "+ (sum1-sum2));
    }

}

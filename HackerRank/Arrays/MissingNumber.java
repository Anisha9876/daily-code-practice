package HackerRank.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            n=Math.max(n,arr[i]);
            sum=sum+arr[i];

        }
         int expectedSum= n*(n+1)/2;
        System.out.println("Missing number "+(expectedSum-sum));

    }
}

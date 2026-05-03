package HackerRank.Arrays;

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr={2,4,5,7,8,9,2};
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){

            sum=sum+arr[i];
            arr[i]=sum;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}

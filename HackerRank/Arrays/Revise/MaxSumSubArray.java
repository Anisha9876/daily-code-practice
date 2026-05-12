package HackerRank.Arrays.Revise;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr={19,2,3,4,5,6};
        int k=3,sum=0;
        int left=0,right=left+k-1;
        int large;
        for(int i=left;i<=right;i++){
            sum=sum+arr[i];

        }
        large=sum;
//        System.out.println(sum);
        while(right<arr.length-1){

           sum=sum-arr[left];
            left++;
            right++;
            sum=sum+arr[right];
            if(large<sum){
                large=sum;

            }


        }
        System.out.println(large);
    }
}

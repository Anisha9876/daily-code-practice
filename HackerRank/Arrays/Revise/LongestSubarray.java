package HackerRank.Arrays.Revise;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr={1,0,2,1,3,0,4,1,6};
        int k=4;
        // k<=4
        int target=4;
        int left=0,right=k-1;
        int length,sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        length=k;
        while(right<arr.length){
            if(target<=sum){
                length=Math.max(length,(right-left+1));

            }
            else if(sum<target){
                right++;
                sum=sum+arr[right];
            }
            else{
                sum=sum-arr[left];
                left++;
            }
        }
        System.out.println(length);
    }
}

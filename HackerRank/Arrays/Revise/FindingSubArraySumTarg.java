package HackerRank.Arrays.Revise;

public class FindingSubArraySumTarg {
    public static void main(String[] args) {
        int[] arr={3,0,3,8,5,2,9};
        int target=16;
        int sum=arr[0];
        int left=0,right=0;

        while(right<arr.length){
            if(sum==target){
                break;
            }
            else if(sum>target){
                sum=sum-arr[left];
                left++;
            }
            else if(sum<target){
                right++;

                sum = sum + arr[right];

            }
        }
        for(int i=left;i<=right;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

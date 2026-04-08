package HackerRank.Arrays;

import java.util.Arrays;

public class FindSum_Better {
    public static void main(String[] args) {
        int[] arr={2,5,9,3,20,12,9};
        int target=21;
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int sum=0;
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(left+" , "+right);
                break;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }

    }
}

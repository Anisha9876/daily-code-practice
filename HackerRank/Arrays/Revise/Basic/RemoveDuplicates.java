package HackerRank.Arrays.Revise.Basic;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4,5};
        int left=0,right=0;
        while(left<=right && right<arr.length){
            if(arr[left]!=arr[right]){
                arr[left+1]=arr[right];
                right++;
                left++;
            }
            else if(arr[left]==arr[right]){
                right++;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

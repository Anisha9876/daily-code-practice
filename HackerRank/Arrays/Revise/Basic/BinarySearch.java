package HackerRank.Arrays.Revise.Basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,6,8,10,12,14,16};

        int left=0,right=arr.length-1;
        int target=14;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid]==target){
                System.out.println("target is at "+mid);
                return;
            }
            else if(arr[mid]<target){
                left=mid+1;

            }
            else{
                right=mid-1;


            }
        }
        System.out.println("Target is missing");
    }
}

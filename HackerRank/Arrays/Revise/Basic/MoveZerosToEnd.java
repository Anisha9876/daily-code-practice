package HackerRank.Arrays.Revise.Basic;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,3,6,9,0,3,0,0};
        //using two pointer approach

        int left=0,right=0;
        while(left<=right && right<arr.length){
            if(arr[right]==0){
               right++;

            }
            else if(arr[right]!=0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right++;

            }


        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

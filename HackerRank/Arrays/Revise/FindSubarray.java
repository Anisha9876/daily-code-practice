package HackerRank.Arrays.Revise;

public class FindSubarray {
    public static void main(String[] args) {

    int[] arr={19,2,3,4,5,6};
    int k=3,sum=0;
    int left=0,right=left+k-1;
    int tr=k-1,tl=0;
    int large;
    for(int i=left;i<=right;i++) {
                        sum = sum + arr[i];

    }
    large=sum;
    while(right<arr.length-1){
        sum=sum-arr[left];
        left++;
        right++;
        sum=sum+arr[right];
        if(large<sum){
            System.out.println(left+" "+right);
            large=sum;

        }


    }

    for(int i=tl;i<=tr;i++){
            System.out.print(arr[i] +" ");
        }
}
}

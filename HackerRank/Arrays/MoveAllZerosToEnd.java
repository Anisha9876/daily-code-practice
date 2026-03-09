package HackerRank.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr={1,4,0,0,1,0,4,5,0};
        int start=0;
        int end=arr.length-1;
        int temp=0;
         while(end>start){
             if(arr[end]==0 && arr[start] !=0){
                 end--;
                 start++;
             }
             else if(arr[end]!=0 && arr[start]==0){
                 temp=arr[start];
                 arr[start]=arr[end];
                 arr[end]=temp;
                 start++;
                 end--;
             }
             else if(arr[end]!=0 && arr[start]!=0){
                 start++;

             }
             else if (arr[end]==0 && arr[start]==0) {
                 end--;
             }
         }


         for(int n:arr){
             System.out.print(n+" ");
         }

    }
}

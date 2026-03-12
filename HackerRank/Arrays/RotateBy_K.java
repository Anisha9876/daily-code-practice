package HackerRank.Arrays;

public class RotateBy_K {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        int len=arr.length;
        k=k%len;
       reverse(arr,0,len-1);
      reverse(arr,0,k-1);
      reverse(arr,k,len-1);
       for(int n:arr){
           System.out.print(n+" ");
       }
    }
    public static void reverse(int[] arr,int i,int f){
        int temp;
        while(i<f){
            temp=arr[i];
            arr[i]=arr[f];
            arr[f]=temp;
            i++;
            f--;
        }
    }
}

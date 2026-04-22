package HackerRank.Arrays.Revise;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,3,6,4,6,8};
        int l=0,e=arr.length-1;
        int temp;
        while(l<e){
            temp=arr[e];
            arr[e]=arr[l];
            arr[l]=temp;
            l++;
            e--;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}

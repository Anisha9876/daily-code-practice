package HackerRank.Arrays.Revise.Basic;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={4,5,3,4,442,5};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

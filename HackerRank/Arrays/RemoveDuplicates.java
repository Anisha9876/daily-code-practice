package HackerRank.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,5,2,6,8,9,5};
        int left=0,end=arr.length-1;
        while(end<left){
            if(arr[left]>arr[end]){
                int temp=arr[left];
                arr[left]=arr[end];
                arr[end]=temp;
            }
        }

    }
}

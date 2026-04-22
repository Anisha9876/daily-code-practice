package HackerRank.Arrays.Revise;

public class CheckArrayIsSort {
    public static void main(String[] args) {
        //checking is the array is sorted or not
        int arr[]={1,2,3,5,6};
//        int arr[]={5,4,3,6,1};

        int i=0;
        while(i<arr.length-1){
            if(arr[i]<=arr[i+1]){
                i++;
            }
            else{
                System.out.println("not sorted");
                return;
            }

        }
        System.out.println("Sorted array");
    }
}

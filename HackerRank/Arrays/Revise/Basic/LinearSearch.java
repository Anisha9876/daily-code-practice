package HackerRank.Arrays.Revise.Basic;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,5,3,7,8,9};
        int target=18;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                return;
            }
        }
        System.out.println(target+ " target is not present in this array");
    }
}

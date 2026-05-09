package HackerRank.Arrays.Revise.Basic;

public class GreatestElement {
    public static void main(String[] args) {
        int[] arr={1,67,45,39,70,50};
        int maxNum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maxNum<arr[i]){
                maxNum=arr[i];
            }
        }
        System.out.println("Greatest Element = "+ maxNum);
    }
}

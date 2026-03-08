package HackerRank.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr={12,45,23,78,20,90,200};
        int largest=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>largest){
                largest=n;
            }
        }

        System.out.println("Largest Number is "+largest);
    }
}

package HackerRank.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={12,56,34,23,90,80};
        int scdLar = Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int num:arr){

            if(num>largest){
                scdLar=largest;
                largest=num;
            } else if (num>scdLar && num !=largest) {
                scdLar=num;
            }
        }
        System.out.println("Second largest Number in the array : "+scdLar);
    }
}

package HackerRank.Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr={1,5,9,23,20,4};

        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;;
        for(int i:arr){
            if(i>l){
                l=i;
            }
            else if(i>sl){
                sl=i;
            }
        }
        System.out.println("Secoond Largest Element "+ sl);
    }
}

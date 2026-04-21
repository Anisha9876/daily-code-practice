package HackerRank.Arrays;

public class MissingNumber_Opt {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5;
        int xor1=0,xor2=0;
        for(int i=0;i<=n;i++){
            xor1=xor1^i;
        }
        for(int i:arr){
            xor2^=i;
        }
        System.out.println("missing number is "+( xor1^xor2));
    }
}

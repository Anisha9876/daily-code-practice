package HackerRank.Arrays.Revise.Basic;

public class MaxSumOfSubArr {
    public static void main(String[] args) {
        int[] a={1,5,9,9,3,1,5,8,9};
        int k=3;
        int sum=a[0];
        int max=Integer.MIN_VALUE;
        int i=0,j=1;
        while(j<a.length){
            sum=sum+a[j];
            if((j-i+1)==k){
                max=Math.max(max,sum);
//                System.out.println(max);
                sum=sum-a[i];
                i++;
                j++;
            }

            else if((j-i+1)<k){
                j++;
            }
        }
        System.out.println("Maximum "+ max);
    }
}

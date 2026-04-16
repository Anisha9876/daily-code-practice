package DSA.Array.SlidingWindow.Optimal;

public class LongestSubArr {
    public static void main(String[] args) {
        int[] arr={11,2,6,3,9,4,23,1,2};
        int k=11;
        int e=0,l=0;
        int maxLen=1;
        int sum=0;
        // Here we shrink only one
        //when only length ask we can use this
        //but not when it ask for subArray itself
        while(e<arr.length){
            sum=sum+arr[e];
            if(sum>k){
                sum=sum-arr[l];
                l++;
            }
            maxLen=Math.max(maxLen,e-l+1);
            e++;
        }
        System.out.println(maxLen);
    }
}

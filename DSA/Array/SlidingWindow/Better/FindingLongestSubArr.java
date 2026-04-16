package DSA.Array.SlidingWindow.Better;

public class FindingLongestSubArr {
    public static void main(String[] args) {
        int[] arr={1,2,6,3,9,4,2,1,2};
        int k=22;
        int l=0,e;
        int sum=0;
        int maxLen=0,len;
        for(e=0;e<arr.length;e++){
            sum=sum+arr[e];

            while(sum>k){
                sum=sum-arr[l];
                l++;
            }
            len=e-l+1;
            maxLen=Math.max(maxLen,len);
        }
        System.out.println(maxLen);
    }
}

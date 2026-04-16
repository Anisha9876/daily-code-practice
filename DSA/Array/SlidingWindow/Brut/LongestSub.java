package DSA.Array.SlidingWindow.Brut;

public class LongestSub {
    public static void main(String[] args) {
        int[] arr={1,2,6,3,9,4,23,1,2};
        int k=12;
        int maxLen=Integer.MIN_VALUE;
        int len;int sum;
        // I  need to find out the longest sub array that follow <=k
        for(int i=0;i<arr.length;i++){
           sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum <=k ){
                    len=j-i+1;
                    if(len>maxLen){
                        maxLen=len;
                    }
                }

            }

        }

        System.out.println("Maximum Length "+maxLen  );
    }

}

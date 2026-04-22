package HackerRank.Arrays.Revise;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,4,3,8,3,2,6,7};
        int lar=Integer.MIN_VALUE;
        int scndLar=Integer.MIN_VALUE;
        int i=0;
        while(i<arr.length){
            if(arr[i]>lar){
                scndLar=lar;
                lar=arr[i];

            }
            else if(arr[i]>scndLar && arr[i]<lar){
                scndLar=arr[i];
            }

            i++;
        }
        System.out.println("Second largest "+ scndLar);
    }
}

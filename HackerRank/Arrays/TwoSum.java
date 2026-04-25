package HackerRank.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int target=7;
        int sum;
        int arr[]={1,2,3,6,1,7};
        int f=0;
        for (int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length-1;j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println(arr[i]+" "+arr[j]);
                    return;
                }
            }
        }
        System.out.println("no such elements found");
    }

}

package HackerRank.Arrays;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<buy){
                buy=arr[i];
            }
            int currentProfit=arr[i]-buy;
            if(profit<currentProfit){
                profit=currentProfit;
            }
        }
        System.out.println("Max profit = "+profit);
    }
}

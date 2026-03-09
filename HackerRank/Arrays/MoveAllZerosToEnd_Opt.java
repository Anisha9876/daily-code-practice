package HackerRank.Arrays;

public class MoveAllZerosToEnd_Opt {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,0,3,0,4,5,0,0};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

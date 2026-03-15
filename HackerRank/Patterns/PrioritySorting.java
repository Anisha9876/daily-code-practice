package HackerRank.Patterns;
//import java.util.Scanner;
public class PrioritySorting {
    public static void main(String args[]){
        // 0-high priority,1-mid,2-low
        //high to low
//        Scanner sc= new Scanner(System.in);
//        String[] str=sc.nextLine().split(",");
        int arr[]={0,1,2,0,2,1,0,0,1};
        int s=0,e=0,k=arr.length-1;
       while(e<=k ){
           if(arr[e]==0){
               int temp=arr[s];
               arr[s]=arr[e];
               arr[e]=temp;
               e++;
               s++;
           }
           else if(arr[e]==1){
               e++;
           }
           else if(arr[e]==2 ) {
               int temp = arr[e];
               arr[e] = arr[k];
               arr[k] = temp;
               k--;
           }

       }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}

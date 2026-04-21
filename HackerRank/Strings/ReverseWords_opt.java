package HackerRank.Strings;

public class ReverseWords_opt {
    public static void main(String[] args) {
        String str="I have a pen";
        String[] arr=str.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}

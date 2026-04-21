package HackerRank.Numbers;

public class NumOfZerosTrailerEnd {
    public static void main(String[] args) {
        //Finding the number of zeros present at trailer position after finding the factorial

        //so number of 5's and 2's create zeros
        //but 2's are more number than 5's -> calculating number of 5's give us number of zeros
        int n=10;
        int count=0;
        while(n>0){
            n=n/5;
            count=count+n;
        }
        System.out.println("so there are number of zeros at trailer point= "+ count);
    }
}

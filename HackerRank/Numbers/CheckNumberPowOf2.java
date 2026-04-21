package HackerRank.Numbers;

public class CheckNumberPowOf2 {
    public static void main(String[] args) {
        int n=32;
        if(n<=0){
            System.out.println("not power of 2");
            return;
        }
        while(n>1){

            if(n%2!=0){
                System.out.println("not power of 2");
                return;
            }
            n=n/2;
//            System.out.println(n);

        }
        System.out.println("power of 2");

    }
}

package HackerRank.Patterns;

public class FloyedsTriangle {
    public static void main(String[] args) {
//        1
//        2 3
//        4 5 6
//        7 8 9 10
        int c=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

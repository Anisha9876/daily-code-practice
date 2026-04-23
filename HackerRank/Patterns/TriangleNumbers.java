package HackerRank.Patterns;

public class TriangleNumbers {
    public static void main(String[] args) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}

package HackerRank.Patterns;

public class Numbers_serial {
    public static void main(String[] args) {
//        1 2 3
//        1 2 3
//        1 2 3
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print((j+1)+" " );
            }
            System.out.println();
        }
    }
}

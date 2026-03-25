package Java_Revise_Concepts;
interface Ab{
//    void show();
    int add(int a,int b );
        }
public class Lambda_Expression {
    public static void main(String[] args) {
//        Ab ab= ()-> System.out.println("In show");;
//        Ab ab= ()-> System.out.println("In show");
        Ab ab= (int a,int b)-> {
            return a+b;
        };

//        ab.show();
        System.out.println(ab.add(2,4));
    }
}

package Java_Revise_Concepts;

class A{
    String brand="";
    static String name="";
    A(String brand,String name){
        this.brand=brand;
        this.name=name;
        System.out.println("We are in constructor ...");
    }
    static{
        //so static method call first when we create an object of a class the constructor will be called
        //to call it individually : we can use Class.forName("A");
        name="Routray";
        System.out.println("We are in static block");
    }
    public void show(){
        System.out.println(brand+" : "+name);
    }
        }
public class staticConcept {
    public static void main(String[] args) throws ClassNotFoundException {
//    A obj=new A("Audi","BMW");
//        String name = A.name;
//        System.out.println(name);
        Class.forName("Java_Revise_Concepts.A");
//        obj.show();
    }
}

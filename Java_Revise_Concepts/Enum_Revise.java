package Java_Revise_Concepts;

public class Enum_Revise {
    public static void main(String[] args) {
        Laptop macBook = Laptop.MacBook;
        System.out.println(macBook);

        for (Laptop s:Laptop.values()){
            System.out.println(s+" "+s.getPrice());
        }
    }
}
enum Laptop{
 MacBook(2000),XPS(3000),Surface,ThinkPad;
 private int price;
 Laptop(int price){
     this.price=price;
 }
 Laptop(){
     this.price=500;
 }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
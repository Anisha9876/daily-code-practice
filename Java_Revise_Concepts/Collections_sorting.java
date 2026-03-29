package Java_Revise_Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


class Student implements Comparable<Student> {

    int age;
    String name;
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }


    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1;
        }
        return -1;
    }
}
public class Collections_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(31);
        list.add(34);
        list.add(90);

//        Method 1
//        Collections.sort(list);

        //Method 2
        //Using Comparator-
        /*Comparator<Integer> com=new Comparator<Integer>() {
            public int compare(Integer o1,Integer o2){
                if(o1%10 > o2%10){
                    return 1;//sort ascending  order
                }
                return -1; //sort descending order
            }

        };

         */
//        Collections.sort(list,com);

        //Method -3
        //Comparable

        Student st=new Student(12,"Animsha");
        Student st2=new Student(23,"Bivas");
        Student st3=new Student(3,"Sowayam");
        List<Student> a=Arrays.asList(st,st2,st3);
//        Collections.sort(a);  -->We can't do this bcz ony Integer extend the Comparable Interface so We can use it foor thr Integer onlly

       Collections.sort(a);
        for(Student sts:a){
            System.out.println(sts.age+" : "+sts.name);
        }

    }
}

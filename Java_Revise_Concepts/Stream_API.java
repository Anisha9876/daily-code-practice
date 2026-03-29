package Java_Revise_Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,56,4,2,3,2,2,3,33);
        //And we want to extract all the odd values and evaluate square

        /*Stream<Integer> li=list.stream()
                .filter(n->n%2!=0)
                .map(n->n*n)
                .forEach(n-> System.out.println(n));

         */
        //Find the sum of Even numbers
        /*int num=list.stream().filter(n-> n%2==0)
                        .reduce(0,(c,e)->(c+e));
        System.out.println(num);

         */

        //Parallel Stream
        //It take less time than the Normal Stream
       list.parallelStream()
                .filter(n->n%2!=0)
                .map(n->n*n)
                .forEach(n-> System.out.println(n));

    }
}

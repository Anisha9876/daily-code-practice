package HackerRank.Arrays;

import java.util.HashSet;

public class IsArrayContainDuplicates_Optimal {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        HashSet<Integer> set= new HashSet<>();
        for(int i:arr){
            if(!set.contains(i)) {
                set.add(i);
            }
            else{
                System.out.println("It's contain duplicates...");
                return;
            }
        }
        System.out.println("It's don't contain duplicates..");
    }
}

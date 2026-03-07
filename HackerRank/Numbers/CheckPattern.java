package HackerRank.Numbers;

import java.lang.reflect.Array;
import java.util.Stack;
import java.util.Scanner;
public class CheckPattern {

    public static boolean isValid(String s){
        Stack<Character> stack= new Stack<>();
        for(Character ch:s.toCharArray()){
            if(ch=='['||ch=='{'||ch=='('){
                stack.push(ch);
            } else if (ch==']'||ch=='}'||ch==')') {
                if(stack.empty()){
                    return false;
                }
                Character top = stack.pop();
                if(ch==')' && top!='(' || ch=='}'&& top!='{' || ch==']'&& top !='[' ){
                    return false;
                }

            }

        }
        return stack.empty();


    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String arr[]=new String[n];
        String s;
        for(int i=0;i<n;i++) {
            s = sc.next();
            arr[i]=s;
        }
        for(int i=0;i<arr.length;i++){

            if(isValid(arr[i])){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }


    }
}

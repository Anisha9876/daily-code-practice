package Day_9;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{})";
        Stack<Character> stack=new Stack<>();

       for(char ch:s.toCharArray()){
           if(ch=='('|| ch=='{' || ch=='['){
               stack.push(ch);
           }
           else if(ch==')'||ch=='}'||ch==']'){
               if(stack.empty()){
                   System.out.println("Inbalanced");
                   return;
               }
               char top=stack.peek();
               if((ch == ')' && top == '(' ) || (ch == '}' && top == '{') || (ch == ']' && top == '[')){
                   stack.pop();
               }
               else{
                   System.out.println("Inbalanced");
               }
           }
       }
        if(stack.empty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Inbalanced");
        }

    }
}

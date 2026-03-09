package HackerRank.Patterns;

import java.util.Stack;

public class ValidParenthesesOrNot {
    public static void main(String[] args) {
        String str="[{}()]";
        Stack<Character> stack= new Stack<>();
        boolean valid=false;
        for(char ch:str.toCharArray()){
            if(ch=='[' || ch== '{' || ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.empty()){
                   valid=false;
                    break;
                }
                else {
                    Character top = stack.pop();
                    if (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
                            valid=true;
                    }
                    else {
                        valid=false;
                        break;
                    }
                }
            }

        }
        if(stack.empty() && valid){
            System.out.println("Valid..");
        }
        else{
            System.out.println("Invalid..");
        }


    }
}

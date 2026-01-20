package Day_9;

import java.util.Stack;

public class RemoveAdjacentDuplicates_1047 {
    public static void main(String[] args) {
//        Input: s = "abbaca"
//        Output: "ca"
        String s="abbaca";
        StringBuilder result = new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.empty() && stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        for(char c:stack){
            result.append(c);
        }
        System.out.println(result);
    }
}

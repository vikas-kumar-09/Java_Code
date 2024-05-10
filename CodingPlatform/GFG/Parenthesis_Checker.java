package CodingPlatform.GFG;

import java.util.Stack;

public class Parenthesis_Checker {
    public static void main(String[] args) {
        String str = "[{()]";

        if (isValid(str)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("not balanced");
        }
        
    }
    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){

            if(ch == '('){
                stack.push(')');
            }
            else if(ch == '{'){
                stack.push('}');
            }
            else if(ch == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
}

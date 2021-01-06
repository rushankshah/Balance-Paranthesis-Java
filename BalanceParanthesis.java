import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String[] args) {
        String myString = "(([])";
        char[] charArray = myString.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : charArray) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (stack.isEmpty()) {
                System.out.println("Not balanced Paranthesis");
                break;
            }
            if (c == ')') {
                char x = stack.pop();
                if (x == '[' || x == '{') {
                    System.out.println("Not balanced paranthesis");
                    break;
                }
            } else if (c == ']') {
                char x = stack.pop();
                if (x == '(' || x == '{') {
                    System.out.println("Not balanced paranthesis");
                    break;
                }
            } else if (c == '}') {
                char x = stack.pop();
                if (x == '(' || x == '[') {
                    System.out.println("Not balanced paranthesis");
                    break;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Balanced Paranthesis");
        } else {
            System.out.println("Not balanced paranthesis");
        }
    }
}
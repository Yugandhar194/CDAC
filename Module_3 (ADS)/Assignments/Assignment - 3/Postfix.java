import java.util.Stack;
public class Postfix {
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostfix("53+2*"));  
        System.out.println(evaluatePostfix("45*6/"));  
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n)

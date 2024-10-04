public class Infix {

   
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    
    public static class CharStack {
        char[] stack;
        int top;
        int capacity;

        public CharStack(int size) {
            stack = new char[size];
            capacity = size;
            top = -1;
        }

        public void push(char ch) {
            if (top == capacity - 1) {
                System.out.println("Stack overflow");
            } else {
                stack[++top] = ch;
            }
        }

        public char pop() {
            if (top == -1) {
                System.out.println("Stack underflow");
                return 0;
            } else {
                return stack[top--];
            }
        }

        public char peek() {
            if (top == -1) {
                return 0;
            } else {
                return stack[top];
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static String convertToPostfix(String expression) {
        int n = expression.length();
        CharStack stack = new CharStack(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            
            else if (c == '(') {
                stack.push(c);
            }
    
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); 
            }
        
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToPostfix("A+B*C"));        
        System.out.println(convertToPostfix("A*B+C/D"));    
    }
}

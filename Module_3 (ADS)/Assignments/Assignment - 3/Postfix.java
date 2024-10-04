public class Postfix {
    public static class IntStack {
        int[] stack;
        int top;
        int capacity;

        public IntStack(int size) {
            stack = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int value) {
            if (top == capacity - 1) {
                System.out.println("Stack overflow");
            } else {
                stack[++top] = value;
            }
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack underflow");
                return 0;
            } else {
                return stack[top--];
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static int evaluatePostfix(String exp) {
        int n = exp.length();
        IntStack stack = new IntStack(n);

        for (int i = 0; i < n; i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0'); 
            }
            
            else {
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

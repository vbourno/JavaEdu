package gr.aueb.cf.ch6;

public class StackApp {
    static int[] stack = new int[50];
     static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        push(1);
        push(2);
        push(10);
        push(50);
        push(20);
        push(3);
        num = pop();
        num = pop();
        System.out.println("Num = " + num); //expected = 3

        printStack();
    }

    public static void push(int num) {
        if (!isFull()) {
            top++;
            stack[top] = num;
        } else {
            System.out.println("Stack is full");
            //throw new RuntimeException();
        }
    }

    public static int pop() {
        if (!isEmpty()) {
            int returned = stack[top];
            top--;
            return returned;
        } else {
            //System.out.println("Stack is empty");
            throw new RuntimeException();
        }
    }

    public static boolean isFull() {
        return (top == (stack.length -1));
    }

    public static boolean isEmpty() {
        return (top == -1);
    }

    public static void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

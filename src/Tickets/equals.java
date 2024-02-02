package Tickets;

import java.util.Stack;

public class equals {

    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.size() != stack2.size()) {
            return false;
        }
        Stack<Integer> newStack = new Stack<>();
        boolean flag = true;
        int temp = stack1.size();
        for (int i=0; i<temp; i++) {
            if (!stack1.peek().equals(stack2.peek())){
                flag = false;
            }
            newStack.push(stack1.pop());
            newStack.push(stack2.pop());
        }
        temp = newStack.size()/2;
        for (int i=0; i<temp; i++) {
            stack2.push(newStack.pop());
            stack1.push(newStack.pop());
        }
        System.out.println(stack1);
        System.out.println(stack2);
        return flag;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(1);
        stack1.push(3);
        stack1.push(4);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);

        boolean result = equals(stack1, stack2);
        System.out.println(result);
    }
}

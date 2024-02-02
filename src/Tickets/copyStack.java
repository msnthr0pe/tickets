package Tickets;

import java.util.*;

public class copyStack {

    public static Stack<Integer> copyStack(Stack<Integer> stack) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> newStack = new Stack<>();

        Integer size = stack.size();
        for (int i=0; i<size; i++){
            newStack.push(stack.pop());
        }
        for (int i=0; i<size; i++){
            q.offer(newStack.pop());
        }
        for (int i=0; i<size; i++){
            newStack.push(q.peek());
            stack.push(q.peek());
            q.poll();
        }
        return newStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Initial stack: " + stack);
        Stack<Integer> newStack = copyStack(stack);
        System.out.println("Copied stack: " + newStack);
        System.out.println("Initial stack: " + stack);
    }
}

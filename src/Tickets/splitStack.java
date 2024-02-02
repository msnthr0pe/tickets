package Tickets;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class splitStack {

    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> q = new LinkedList<>();

        Integer counter = 0;
        while(!stack.isEmpty()) {
            if (stack.peek() < 0) {
                counter ++;
            }
            q.offer(stack.pop());
        }

        while (!q.isEmpty()) {
            if (q.peek() < 0 && counter != 0) {
                stack.push(q.poll());
                counter --;
            }
            else if (counter != 0) {
                q.offer(q.poll());
            }
            else {
                stack.push(q.poll());
            }
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-3);
        stack.push(8);
        stack.push(-2);

        System.out.println("Before: " + stack);

        splitStack(stack);

        System.out.println("After: " + stack);
        stack.pop();
        System.out.println("After: " + stack);

    }
}
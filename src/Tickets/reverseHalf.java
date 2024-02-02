package Tickets;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseHalf {
    public static void reverseHalf(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        Integer size = queue.size() / 2;

        for (int i=0; i<size; i++){
            queue.offer(queue.poll());
            stack.push(queue.peek());
            queue.offer(queue.poll());
        }

        if (queue.size() % 2 == 1)
            queue.offer(queue.poll());

        for (int i=0; i<size; i++){
            queue.offer(queue.poll());
            queue.poll();
            queue.offer(stack.pop());
        }

        if (queue.size() % 2 == 1)
            queue.offer(queue.poll());

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(8);
        queue.offer(7);
        queue.offer(2);
        queue.offer(9);
        queue.offer(18);
        queue.offer(12);
        queue.offer(0);
        //queue.offer(5);

        System.out.println("Initial Queue: " + queue);

        reverseHalf(queue);

        System.out.println("Altered Queue: " + queue);
    }
}

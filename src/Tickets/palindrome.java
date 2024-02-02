package Tickets;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

class palindrome {
    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        Integer mid = 0;

        Integer size = q.size();
        Integer initialSize = size;

        if(q.isEmpty() || size == 1)
            return true;


        for (int i=0; i<size/2; i++) {
            stack.push(q.poll());
        }

        if (size % 2 == 1)
            mid = q.poll();

        System.out.println(stack);
        System.out.println(q);

        boolean flag = true;
        while (!stack.isEmpty()) {
            if (!Objects.equals(stack.peek(), q.peek())) {
                flag = false;
            }
            q.offer(stack.pop());
            q.offer(q.poll());
        }
        size = q.size();
        for (int i=0; i<size/2; i++) {
            stack.push(q.poll());
            q.offer(q.poll());
        }

        while (!stack.empty()) {
            q.offer(stack.pop());
        }
        if (initialSize % 2 == 1)
            q.offer(mid);


        for (int i=0; i<size/2; i++) {
            q.offer(q.poll());
        }
        return flag;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        System.out.println(isPalindrome(q));
        System.out.println(q);
    }
}

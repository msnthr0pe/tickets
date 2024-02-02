package Tickets;

import java.util.LinkedList;

class StackOnList<T> {
    private LinkedList<T> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    public Integer size() {
        return list.size();
    }


    public static void main(String[] args) {
        StackOnList<Integer> stack = new StackOnList<>();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}

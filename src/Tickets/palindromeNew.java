package Tickets;

import java.util.*;

class newMain{
    public static boolean isPalindrome(Queue<Integer> queue){
        int n = queue.size();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int el = queue.poll();
            stack.push(el);
            queue.add(el);
        }

        for(int i = 0; i < n; i++){
            int el = queue.poll();
            queue.add(el);
            if(el != stack.pop()){
                i++;
                for(; i < n; i++){
                    queue.add(queue.poll());
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        //q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        System.out.println(isPalindrome(q));
        System.out.println(q);
    }
}
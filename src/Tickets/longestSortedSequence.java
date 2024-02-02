package Tickets;

import java.util.*;

public class longestSortedSequence {

    public static Integer longestSortedSequence(List<Integer> list) {
        Integer max = Integer.MIN_VALUE;
        Integer count = 1;
        if (list.isEmpty()) {
            return 0;
        }
        Integer size = list.size();
        for(int i=0; i<size-1; i++) {
            if (list.get(i) <= list.get(i+1)) {
                count ++;
            }
            else {
                max = Integer.max(max, count);
                count = 1;
            }
        }
        max = Integer.max(max, count);
        if(max == Integer.MIN_VALUE) {
            return 1;
        }
        else {
            return max;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 170));
        Integer result = longestSortedSequence(list);
        System.out.println(result);
    }
}

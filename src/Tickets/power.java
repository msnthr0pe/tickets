package Tickets;

import java.util.Objects;

public class power {

    public static Integer recursion(Integer curr, Integer target) {
        if (Objects.equals(curr, target)) {
            System.out.println("YES");
            return 0;
        }
        else if (curr > target) {
            System.out.println("NO");
            return 0;
        }
        recursion(curr * 2, target);
        return 0;
    }

    public static void main(String[] args) {
        Integer num = 2048;
        recursion(2, num);
    }
}

package Tickets;

public class recursionSum {

    public static Integer getSum(Integer num) {
        if (num == 0)
            return 0;
        else {
            return num % 10 + getSum(num / 10);
        }
    }

    public static void main(String[] args) {
        Integer num = 123;
        System.out.println(getSum(num));
    }
}

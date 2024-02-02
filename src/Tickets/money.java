package Tickets;

class Money {
    private long rubles;
    private double kopecks;

    public Money(long rubles, double kopecks) {
        this.rubles = rubles;
        this.kopecks = kopecks;
        overflow();
    }

    private void overflow () {
        if (kopecks >= 100) {
            rubles += kopecks / 100;
            kopecks -= 100;
        }
        else if (kopecks < 0) {
            rubles--;
            kopecks += 100;
        }
    }

    public Money add(Money other) {
        return new Money(this.rubles + other.rubles, this.kopecks + other.kopecks);
    }

    public Money subtract(Money other) {
        return new Money(this.rubles - other.rubles, this.kopecks - other.kopecks);
    }

    public Money divide(long divisor) {
        return new Money(this.rubles / divisor, this.kopecks / divisor);
    }

    public Money divide(double divisor) {
        return new Money((long) (this.rubles / divisor), this.kopecks / divisor);
    }

    public Money multiply(double factor) {
        return new Money((long) (this.rubles * factor), this.kopecks * factor);
    }

    public boolean isEqual(Money other) {
        return this.rubles == other.rubles && this.kopecks == other.kopecks;
    }

    public boolean isGreater(Money other) {
        return this.rubles > other.rubles || (this.rubles == other.rubles && this.kopecks > other.kopecks);
    }

    public boolean isLess(Money other) {
        return this.rubles < other.rubles || (this.rubles == other.rubles && this.kopecks < other.kopecks);
    }

    @Override
    public String toString() {
        return rubles + "," + String.format("%.2f", kopecks);
    }
}

class Tester {
    public static void main(String[] args) {
        Money money1 = new Money(10, 50.50);
        Money money2 = new Money(5, 50.75);


        Money sum = money1.add(money2);
        Money difference = money1.subtract(money2);
        Money division = money1.divide(2);
        Money divisionByFraction = money1.divide(2.5);
        Money multiplication = money1.multiply(1.5);

        System.out.println("Money 1: " + money1 + '\n');

        System.out.println("Money 2: " + money2 + '\n');

        System.out.println("Sum: " + sum + '\n');

        System.out.println("Difference: " + difference + '\n');

        System.out.println("Division by 2: " + division + '\n');

        System.out.println("Division by 2.5: " + divisionByFraction + '\n');

        System.out.println("Multiplication by 1.5: " + multiplication + '\n');

        System.out.println("Comparison: ");
        System.out.println("Is money1 equal to money2? " + money1.isEqual(money2));
        System.out.println("Is money1 greater than money2? " + money1.isGreater(money2));
        System.out.println("Is money1 less than money2? " + money1.isLess(money2));
    }
}
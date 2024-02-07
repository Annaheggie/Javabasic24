package javabasicanna.homeworks.lecture5;

public class IntegerDivisibilityCounter {

    public static int countUsingWhileLoop(int start, int end) {
        int count = 0;
        int current = start;

        while (current <= end) {
            int sumOfDigits = calculateSumOfDigits(current);

            if (current % sumOfDigits == 0) {
                count++;
            }

            current++;
        }

        return count;
    }

    public static int countUsingDoWhileLoop(int start, int end) {
        int count = 0;
        int current = start;

        do {
            int sumOfDigits = calculateSumOfDigits(current);

            if (current % sumOfDigits == 0) {
                count++;
            }

            current++;
        } while (current <= end);

        return count;
    }

    public static int countUsingForLoop(int start, int end) {
        int count = 0;

        for (int current = start; current <= end; current++) {
            int sumOfDigits = calculateSumOfDigits(current);

            if (current % sumOfDigits == 0) {
                count++;
            }
        }

        return count;
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int start = 100;
        int end = 1000;

        int countUsingWhile = countUsingWhileLoop(start, end);
        int countUsingDoWhile = countUsingDoWhileLoop(start, end);
        int countUsingFor = countUsingForLoop(start, end);

        System.out.println("Count using while loop: " + countUsingWhile);
        System.out.println("Count using do-while loop: " + countUsingDoWhile);
        System.out.println("Count using for loop: " + countUsingFor);
    }
}

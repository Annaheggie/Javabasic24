package javabasicanna.homeworks.lecture4;

public class ShuttleNumberGenerator {
    public static void main(String[] args) {
        generateShuttleNumbers();
    }

    public static void generateShuttleNumbers() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (isUnluckyNumber(i)) {
                continue;
            }
            System.out.println("Shuttle Number: " + i);
            count++;
        }
        System.out.println("Total Shuttle Numbers: " + count);
    }

    public static boolean isUnluckyNumber(int number) {
        return (number % 10 == 4 || number % 10 == 9 || number / 10 == 4 || number / 10 == 9);
    }
}

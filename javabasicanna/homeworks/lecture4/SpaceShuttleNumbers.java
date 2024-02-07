package javabasicanna.homeworks.lecture4;

public class SpaceShuttleNumbers {
    public static void main(String[] args) {
        generateSpaceShuttleNumbers();
    }

    public static void generateSpaceShuttleNumbers() {
        int count = 0;
        int number = 1;

        while (count < 100) {
            if (number % 10 != 4 && number % 10 != 9) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}


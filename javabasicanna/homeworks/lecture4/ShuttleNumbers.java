package javabasicanna.homeworks.lecture4;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 100) {
            if (isUnluckyNumber(number)) {
                number++;
                continue;
            }

            System.out.println(number);
            count++;
            number++;
        }
    }

    private static boolean isUnluckyNumber(int number) {
        String numberString = String.valueOf(number);
        return numberString.contains("4") || numberString.contains("9");
    }
}

package javabasicanna.homeworks.lecture8;

import java.util.Arrays;
import java.util.Random;

public class LotteryNumberMatching {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateRandomNumbers(7);
        int[] playerNumbers = generateRandomNumbers(7);

        System.out.println("Lottery Numbers: " + Arrays.toString(lotteryNumbers));
        System.out.println("Player Numbers: " + Arrays.toString(playerNumbers));

        bubbleSort(lotteryNumbers);
        bubbleSort(playerNumbers);

        System.out.println("Sorted Lottery Numbers: " + Arrays.toString(lotteryNumbers));
        System.out.println("Sorted Player Numbers: " + Arrays.toString(playerNumbers));

        int matches = countMatches(lotteryNumbers, playerNumbers);
        System.out.println("Number of Matches: " + matches);
    }

    private static int[] generateRandomNumbers(int Numb) {
        int[] numbers = new int[Numb];
        Random random = new Random();

        for (int i = 0; i < Numb; i++) {
            numbers[i] = random.nextInt(10);
        }

        return numbers;
    }

    private static void bubbleSort(int[] numbers) {
       // int n = numbers.length;
        boolean swapped;

        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    private static int countMatches(int[] lotteryNumbers, int[] playerNumbers) {
        int matches = 0;

        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == playerNumbers[i]) {
                matches++;
            }
        }

        return matches;
    }
}

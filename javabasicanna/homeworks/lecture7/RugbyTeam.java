package javabasicanna.homeworks.lecture7;

import java.util.Random;

public class RugbyTeam {
    public static void main(String[] args) {
        int[] team1Ages = generateRandomAges(25); //how many players we have
        int[] team2Ages = generateRandomAges(25); //how many players we have

        System.out.println("Team 1 Ages:");
        displayAges(team1Ages);
        System.out.println("Average Age of Team 1: " + calculateAverageAge(team1Ages));

        System.out.println("\nTeam 2 Ages:");
        displayAges(team2Ages);
        System.out.println("Average Age of Team 2: " + calculateAverageAge(team2Ages));
    }

    public static int[] generateRandomAges(int size) {
        int[] ages = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            ages[i] = random.nextInt(23) + 18;
        }

        return ages;
    }

    public static void displayAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    public static double calculateAverageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}

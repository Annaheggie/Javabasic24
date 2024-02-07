package javabasicanna.homeworks.lecture3;

import java.util.Scanner;

public class Countersss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first team: ");
        String teamName1 = scanner.nextLine();

        int[] frags1 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the number of frags for player " + (i + 1) + " of the first team: ");
            frags1[i] = scanner.nextInt();
        }

        System.out.print("Enter the name of the second team: ");
        String teamName2 = scanner.nextLine();

        int[] frags2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the number of frags for player " + (i + 1) + " of the second team: ");
            frags2[i] = scanner.nextInt();
        }

        int totalFrags1 = 0;
        for (int frag : frags1) {
            totalFrags1 += frag;
        }

        int totalFrags2 = 0;
        for (int frag : frags2) {
            totalFrags2 += frag;
        }

        double average1 = totalFrags1 / 5.0;
        double average2 = totalFrags2 / 5.0;

        String winningTeam;
        int result;

        if (average1 > average2) {
            winningTeam = teamName1;
            result = (int) (average1 - average2);
        } else if (average2 > average1) {
            winningTeam = teamName2;
            result = (int) (average2 - average1);
        } else {
            winningTeam = "No team";
            result = 0;
        }

        System.out.println("The winning team " + winningTeam + " scored " + result + " points.");
    }
}

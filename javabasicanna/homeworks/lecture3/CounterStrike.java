package javabasicanna.homeworks.lecture3;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first team: ");
        String team1Name = scanner.nextLine();

        System.out.print("Enter the number of frags for the 5 players of the first team: ");
        int team1Player1Frags = scanner.nextInt();
        int team1Player2Frags = scanner.nextInt();
        int team1Player3Frags = scanner.nextInt();
        int team1Player4Frags = scanner.nextInt();
        int team1Player5Frags = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the name of the second team: ");
        String team2Name = scanner.nextLine();

        System.out.print("Enter the number of frags for the 5 players of the second team: ");
        int team2Player1Frags = scanner.nextInt();
        int team2Player2Frags = scanner.nextInt();
        int team2Player3Frags = scanner.nextInt();
        int team2Player4Frags = scanner.nextInt();
        int team2Player5Frags = scanner.nextInt();

        scanner.close();

        double team1Average = (team1Player1Frags + team1Player2Frags + team1Player3Frags + team1Player4Frags + team1Player5Frags) / 5.0;
        double team2Average = (team2Player1Frags + team2Player2Frags + team2Player3Frags + team2Player4Frags + team2Player5Frags) / 5.0;

        String winningTeam;
        double result;

        if (team1Average > team2Average) {
            winningTeam = team1Name;
            result = team1Average;
        } else if (team2Average > team1Average) {
            winningTeam = team2Name;
            result = team2Average;
        } else {
            winningTeam = "No winner";
            result = team1Average;
        }

        System.out.println("Winning team: " + winningTeam + " scored " + result + " points");
    }
}

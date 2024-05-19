package Uni5;

import java.util.Scanner;

public class ex28 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bands = {"Nenhum de Nós", "CPM22", "Skank", "Jota Quest"};
        int[] votes = new int[4];
        int totalVotes = 0;
        int winnerIndex = -1;

        char voteAgain;
        do {
            System.out.println("Another vote: (y / n)?");
            voteAgain = sc.next().toLowerCase().charAt(0);

            if (voteAgain == 'y') {
                System.out.println("Vote for your favorite band:");
                System.out.println("1. Nenhum de Nós");
                System.out.println("2. CPM22");
                System.out.println("3. Skank");
                System.out.println("4. Jota Quest");
                int vote = sc.nextInt();

                if (vote >= 1 && vote <= 4) {
                    votes[vote - 1]++;
                    totalVotes++;
                } else {
                    System.out.println("Invalid vote.");
                }
            }
        } while (voteAgain == 's');

        System.out.println("Total votes for each band and their percentage:");
        for (int i = 0; i < bands.length; i++) {
            double percentage = (double) votes[i] / totalVotes * 100;
            System.out.println(bands[i] + ": " + votes[i] + " votes (" + String.format("%.2f", percentage) + "%)");
            if (winnerIndex == -1 || votes[i] > votes[winnerIndex]) {
                winnerIndex = i;
            }
        }

        System.out.println("The winner is: " + bands[winnerIndex]);

        sc.close();
    }
}

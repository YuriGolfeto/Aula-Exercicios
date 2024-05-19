package Uni5;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;
        int candidate4Votes = 0;
        int nullVotes = 0;
        int blankVotes = 0;
        int totalVotes = 0;

        int vote;
        boolean running = true;

        while (running) {
            System.out.println(
                    "Enter your vote (1, 2, 3, 4 for candidates, 5 for null vote, 6 for blank vote, 0 to exit):");
            vote = sc.nextInt();

            switch (vote) {
                case 1:
                    candidate1Votes++;
                    totalVotes++;
                    break;
                case 2:
                    candidate2Votes++;
                    totalVotes++;
                    break;
                case 3:
                    candidate3Votes++;
                    totalVotes++;
                    break;
                case 4:
                    candidate4Votes++;
                    totalVotes++;
                    break;
                case 5:
                    nullVotes++;
                    totalVotes++;
                    break;
                case 6:
                    blankVotes++;
                    totalVotes++;
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Incorrect option. Please enter a valid option.");
            }
        }

        double blankPercent = (double) blankVotes / totalVotes * 100;
        double nullPercent = (double) nullVotes / totalVotes * 100;

        System.out.println("Candidate 1 votes: " + candidate1Votes);
        System.out.println("Candidate 2 votes: " + candidate2Votes);
        System.out.println("Candidate 3 votes: " + candidate3Votes);
        System.out.println("Candidate 4 votes: " + candidate4Votes);
        System.out.println("Null votes: " + nullVotes);
        System.out.println("Blank votes: " + blankVotes);
        System.out.println("Blank vote percentage: " + blankPercent + "%");
        System.out.println("Null vote percentage: " + nullPercent + "%");

        sc.close();
    }
}

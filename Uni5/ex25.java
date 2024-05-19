package Uni5;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int scoreLeft = 0;
        int scoreRight = 0;

        while (true) {
            System.out.println("Enter the code of the point (D for right player, E for left player):");
            char pointCode = sc.next().toUpperCase().charAt(0);

            if (pointCode == 'D') {
                scoreRight++;
            } else if (pointCode == 'E') {
                scoreLeft++;
            } else {
                System.out.println("Invalid input. Please enter D or E.");
                continue;
            }

            if ((scoreRight >= 21 || scoreLeft >= 21) && Math.abs(scoreRight - scoreLeft) >= 2) {
                if (scoreRight > scoreLeft) {
                    System.out.println("Right player wins!");
                } else {
                    System.out.println("Left player wins!");
                }
                break;
            }
        }

        sc.close();
    }
}

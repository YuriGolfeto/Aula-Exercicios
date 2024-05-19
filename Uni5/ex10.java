package Uni5;

public class ex10 {

    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        System.out.println("The first 10 numbers with the special property are:");

        while (count < 10) {
            int leftPart = number / 100;
            int rightPart = number % 100;
            int sum = leftPart + rightPart;

            if (sum * sum == number) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

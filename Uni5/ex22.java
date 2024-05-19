package Uni5;

public class ex22 {
    public static void main(String[] args) {
        int salary = 2000;
        double increaseRate = 0.015;

        salary += (salary * increaseRate);

        for (int year = 1997; year <= 2024; year++) {
            increaseRate += increaseRate;
            salary += (salary * increaseRate);
        }

        System.out.println("The current salary of the employee is: R$" + salary);
    }
}

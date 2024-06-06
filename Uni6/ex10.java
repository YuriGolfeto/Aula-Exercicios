package Uni6;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int size = 0;
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Add value");
            System.out.println("2 - Search value");
            System.out.println("3 - Update value");
            System.out.println("4 - Delete value");
            System.out.println("5 - Show values");
            System.out.println("6 - Sort values");
            System.out.println("7 - Reverse values");
            System.out.println("8 - Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    if (size < array.length) {
                        System.out.print("Enter the value to be added: ");
                        int value = sc.nextInt();
                        array[size] = value;
                        size++;
                        System.out.println("Value added to the array.");
                    } else {
                        System.out.println("Array is full, cannot add more values.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the value to be searched: ");
                    int searchValue = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (array[i] == searchValue) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Value found in the array.");
                    } else {
                        System.out.println("Value not found in the array.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the value to be updated: ");
                    int oldValue = sc.nextInt();
                    System.out.print("Enter the new value: ");
                    int newValue = sc.nextInt();
                    boolean updated = false;

                    for (int i = 0; i < size; i++) {
                        if (array[i] == oldValue) {
                            array[i] = newValue;
                            updated = true;
                            break;
                        }
                    }

                    if (updated) {
                        System.out.println("Value updated in the array.");
                    } else {
                        System.out.println("Value not found in the array.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the value to be deleted: ");
                    int deleteValue = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < size; i++) {
                        if (array[i] == deleteValue) {
                            deleted = true;
                            for (int j = i; j < size - 1; j++) {
                                array[j] = array[j + 1];
                            }
                            size--;
                            break;
                        }
                    }

                    if (deleted) {
                        System.out.println("Value deleted from the array.");
                    } else {
                        System.out.println("Value not found in the array.");
                    }
                    break;
                case 5:
                    System.out.print("Values in the array: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    break;
                case 6:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = 0; j < size - 1 - i; j++) {
                            if (array[j] > array[j + 1]) {
                                int temp = array[j];
                                array[j] = array[j + 1];
                                array[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Values sorted.");
                    break;
                case 7:
                    for (int i = 0; i < size / 2; i++) {
                        int temp = array[i];
                        array[i] = array[size - 1 - i];
                        array[size - 1 - i] = temp;
                    }
                    System.out.println("Values reversed.");
                    break;
                case 8:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 8);

        sc.close();
    }
}

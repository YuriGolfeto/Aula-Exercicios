package Uni6;

import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] peso = new int[5];
        String[] valor = new String[5];
        int size = 0;
        int actualLenght = 0;
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Add value (question a)");
            System.out.println("2 - Search value");
            System.out.println("3 - Update value");
            System.out.println("4 - Delete value (question e)");
            System.out.println("5 - Show values in the peso and actual.");
            System.out.println("6 - Sort values (question d)");
            System.out.println("7 - Reverse values");
            System.out.println("8 - print the values (question b)");
            System.out.println("9 - print the bigger value (question c)");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    if (size < peso.length) {

                        System.out.print("Enter the value to be added: ");
                        int value = sc.nextInt();
                        if (actualLenght + value <= 15) {
                            System.out.println("enter the name");
                            String change = sc.next();
                            peso[size] = value;
                            actualLenght += value;
                            valor[size] = change;
                            size++;
                            System.out.println("Value added to the peso.");
                        } else {
                            System.out.println("limite de peso atingido");
                        }
                    } else {
                        System.out.println("peso is full, cannot add more values.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the value to be searched: ");
                    int searchValue = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (peso[i] == searchValue) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Value found in the peso.");
                    } else {
                        System.out.println("Value not found in the peso.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the value to be updated: ");
                    int oldValue = sc.nextInt();
                    System.out.print("Enter the new value: ");
                    int newValue = sc.nextInt();
                    System.out.print("Enter the new value name: ");
                    String newValor = sc.next();
                    boolean updated = false;

                    for (int i = 0; i < size; i++) {
                        if (peso[i] == oldValue) {
                            valor[i] = newValor;
                            peso[i] = newValue;
                            updated = true;
                            break;
                        }
                    }

                    if (updated) {
                        System.out.println("Value updated in the peso.");
                    } else {
                        System.out.println("Value not found in the peso.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the value to be deleted: ");
                    String deleteValue = sc.next();
                    boolean deleted = false;

                    for (int i = 0; i < size; i++) {
                        if (valor[i].equals(deleteValue)) {
                            deleted = true;
                            for (int j = i; j < size - 1; j++) {
                                peso[j] = peso[j + 1];
                                valor[j] = valor[j + 1];
                            }
                            size--;
                            break;
                        }
                    }

                    if (deleted) {
                        System.out.println("Value deleted from the peso.");
                    } else {
                        System.out.println("Value not found in the peso.");
                    }
                    break;
                case 5:
                    System.out.print("Values in the peso: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print("\n " + peso[i] + " ," + valor[i] + " || ");
                        System.out.println(actualLenght);
                    }
                    System.out.println(actualLenght);
                    break;
                case 6:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = 0; j < size - 1 - i; j++) {
                            if (peso[j] > peso[j + 1]) {
                                int temp = peso[j];
                                peso[j] = peso[j + 1];
                                peso[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Values sorted.");
                    break;
                case 7:
                    for (int i = 0; i < size / 2; i++) {
                        int temp = peso[i];
                        String temp2 = valor[i];
                        peso[i] = peso[size - 1 - i];
                        valor[i] = valor[size - 1 - i];
                        peso[size - 1 - i] = temp;
                        valor[size - 1 - i] = temp2;

                    }
                    System.out.println("Values reversed.");
                    break;
                case 8:
                    System.out.println("Valores");
                    for (int i = size; i > 0; i--) {
                        System.out
                                .println(
                                        "slot: " + i + " item :" + valor[i - 1] + " ," + " peso:" + peso[i - 1]
                                                + ":");
                    }
                    break;
                case 9:
                    int pesadao = 0;
                    for (int pesos : peso) {
                        if (pesos > pesadao) {
                            pesadao = pesos;
                        }
                    }
                    System.out.println("maior valor = " + pesadao);

                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (option <= 9);

        sc.close();
    }
}

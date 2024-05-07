package Uni4;

import java.util.Scanner;

public class exProva3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String livro = "Aprendendo java";
        String editora = "Visual Books";

        if (livro.isEmpty() && editora.isEmpty()) {
            System.out.println("não e possivel editar os dados");
            System.out.println("Vazio");

        } else {
            System.out.println("livro: " + livro);
            if (editora.isEmpty()) {
                System.out.println("editora Vazio");
            } else {
                System.out.println("editora :" + editora);
            }
        }

        System.out.println("FIM");
        sc.close();
    }

}

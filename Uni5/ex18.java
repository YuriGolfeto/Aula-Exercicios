package Uni5;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        double em4 = 0, em5 = 0, em9 = 0, em12 = 0;
        String inter;
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("digite o numero da emissora que assiste valor nao numerico vai ser considerado off");
            inter = sc.nextLine();
            if (inter.equals("4")) {
                em4 += 1;
            } else if (inter.equals("5")) {
                em5 += 1;
            } else if (inter.equals("9")) {
                em9 += 1;
            } else if (inter.equals("12")) {
                em12 += 1;
            } else if (inter.equals("0")) {
                isTrue = false;
                num--;
            } else {
                num--;
            }
            num++;

        }
        System.out.println(
                "emisorra 4 :" + em4 + "\nemisorra 5 :" + em5 + "\nemisorra 9 :" + em9 + "\nemisorra 12 :" + em12);
        System.out.println("total de pessoas pesquisadas :" + num);

        System.out.println("percentual para cada emissora");
        System.out.printf("emissora 4 = %%%.2f \n", ((em4 / num) * 100));
        System.out.printf("emissora 5 = %%%.2f \n", ((em5 / num) * 100));
        System.out.printf("emissora 9 = %%%.2f \n", ((em9 / num) * 100));
        System.out.printf("emissora 12 = %%%.2f \n", ((em12 / num) * 100));
        sc.close();

    }

}

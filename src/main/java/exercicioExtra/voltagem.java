package exercicioExtra;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class voltagem {
    public static void main(String[] args) {
        int numero;

        System.out.println("Informe uma voltagem: ");
        numero = new Scanner(System.in).nextInt();
        System.out.printf("A voltagem informada %d  e:  %s",numero, voltagemDescrita(numero));
    }

    public static String voltagemDescrita(int volt) {
        String msg = "";
        if (volt == 110) {
            msg = "1 (UM)";

        } else if (volt == 220) {
            msg = "2 (DOIS)";
        } else if (volt == 220) {
            msg = "2 (DOIS)";
        }else if (volt > 220) {
            msg = "alta";
        }else if (volt < 110) {
            msg = "baixa";
        }else if (volt > 110 && volt < 220) {
            msg = "Indefinida";
        }
        return msg;
    }
}

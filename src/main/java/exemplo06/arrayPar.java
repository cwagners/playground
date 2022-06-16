package exemplo06;

import java.util.Arrays;
import java.util.Scanner;

import static exemplo04.numeroPar.isPar;

public class arrayPar {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o elemento %d do array: " + i);
            numeros[i] = new Scanner(System.in).nextInt();

        }

        System.out.println(retornaElementosArray(numeros));


    }

    public static int retornaElementosArray(int[] numero) {
        int resultado[] = new int[3];
        int menor = 0;
        for (int i = 1; i < numero.length; i++) {
            if (i % 2 !=  0 ) {
                resultado[i] = numero[i];
                menor = resultado[i];
                break;
            }
        }
        return menor;
    }
}
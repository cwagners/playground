package exemplo07;


import java.util.Arrays;
import java.util.Scanner;

public class exercicioArrayImpar {
    public static void main(String[] args) {

        System.out.println("Informe o tamanho do array: ");
        int tamanho = new Scanner(System.in).nextInt();
        int[] numeros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o elemento %d do array: " + i);
            numeros[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(retornaElementosArray(numeros)));


    }

    public static int[] retornaElementosArray(int[] numero) {
        int j = 0;
        int[] impar = new int[quantidadeImpar(numero)];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 != 0) {
                impar[j] = numero[i];
                j++;
            }else{
                continue;
            }
        }
        return impar;
    }

    public static int quantidadeImpar(int[] num) {
        int j = 0;
        int[] impar = new int[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                j++;

            }
        }
        return j;
    }
}

package exercicioExtra;

import java.util.Arrays;
import java.util.Scanner;

public class RetornaMenorValor {
    public static void main(String[] args) {
        System.out.println("Informe o tamanho do array: ");
        int tamanho = new Scanner(System.in).nextInt();
        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o elemento %d do array: " + i);
            numeros[i] = new Scanner(System.in).nextInt();

        }
        int menor = obtemMenorNumero(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(menor);
    }
    public static int obtemMenorNumero(int[] numeros){
        int menor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0){
                menor = numeros[i];
            }else {
                if (menor > numeros[i]){
                    menor = numeros[i];
                }
            }
        }
        return menor;
    }
}
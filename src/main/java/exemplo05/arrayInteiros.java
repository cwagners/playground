package exemplo05;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInteiros {
    public static void main(String[] args) {
        System.out.println("Informe o tamanho do array: ");
        int tamanho = new Scanner(System.in).nextInt();
        int[] numeros = new int[tamanho];
        for(int i=0; i<tamanho; i++){
            System.out.println("Informe o elemento %d do array: "+i);
            numeros[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(retornaElementosArray(numeros)));


    }
    public static int[] retornaElementosArray(int[] numero){
        int resultado[] = new int[2];
        int j =0;
        for(int i=0; i<numero.length; i++){
            if(i==0 || i == numero.length -1 ){
                resultado[j] = numero[i];
                j++;

            }
        }
        return resultado;
    }




}


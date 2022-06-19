package exercicioExtra;

import java.util.Arrays;
import java.util.Scanner;

public class RetornaListaArray {
    public static void main(String[] args) {
        System.out.println("Informe um número: ");
        int numero = new Scanner(System.in).nextInt();



        System.out.println(Arrays.toString(retornaElementosArray(numero)));


    }

    public static int[] retornaElementosArray(int numero) {
        int resultado[] = new int[3];

        for (int i = 0; i < 3; i++) {

            if (i ==0 ){
                resultado[i] = (numero - 1);
            }else if (i == 1){
                resultado[i] = (numero);
            }else{
                resultado[i] = (numero + 1);
            }

        }
        return resultado;
    }

}
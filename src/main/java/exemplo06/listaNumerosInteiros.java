package exemplo06;


import java.util.Arrays;
import java.util.Scanner;

public class listaNumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];
        for(int i=0; i<tamanho; i++){
            System.out.println("Informe o elemento %d do array: "+i);
            numeros[i] = new Scanner(System.in).nextInt();
        }
        scanner.close();

        int resultado = retornaNumeroParArray(numeros);
        System.out.println(numeros[0]);

    }

    public static int retornaNumeroParArray(int[] numero){
        int par = 0;
        for(int i=0; i<numero.length; i++){
            int a = numero[i];
            if( a %2 ==0){
                par = a;


            }
        }
        return par;
    }

}
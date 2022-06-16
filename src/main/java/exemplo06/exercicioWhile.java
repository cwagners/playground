package exemplo06;

import java.util.Scanner;

public class exercicioWhile {
    public static void main(String[] args) {
        System.out.println("Informe um número");
        int numero = new Scanner(System.in).nextInt();
        int total = retornaNumeros(numero);
    }

    public static int retornaNumeros(int total){
        int contador = 0;
        while (contador <= total) {
            System.out.println(total);
            total = total - 1;
        }
        return total;
    }
}
package exemplo06;

import java.util.Scanner;

public class validaNumero {
    public static void main(String[] args) {

        retornaNumero();
    }


    public static int retornaNumero(){

        int numero;
        do {
            System.out.println("Informe um número");
            numero = new Scanner(System.in).nextInt();


        }while(!validaNumero(numero));
        return numero;

    }
    public static boolean validaNumero(int num){
        if (num< 0 || num > 100){
            System.out.printf("Número Inválido tente novamente");
            return false;
        }
        System.out.println("O número esta no intervalo");
        return true;
    }
}


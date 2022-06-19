package exercicioExtra;

import java.util.Scanner;

public class numIntReturnTexto {
    public static void main(String[] args) {
        System.out.println("Informe um numero: ");
        int numero = new Scanner(System.in).nextInt();
        String texto = obtemTextoPeloNumero(numero);
        System.out.printf("O número é: %s", texto);

    }

    public static String obtemTextoPeloNumero(int numero){

        String texto;

        if (numero == 0){
            texto = "Zero";
        }
        else if (numero < 0){
            texto = "Negativo";
        }else{
            texto = "Positivo";
        }
        return texto;
    }
}
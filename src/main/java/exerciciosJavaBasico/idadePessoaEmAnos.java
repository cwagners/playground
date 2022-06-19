package exerciciosJavaBasico;

import java.util.Scanner;

public class idadePessoaEmAnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade em anos, meses e dias: \n");
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        int dia = scanner.nextInt();
        System.out.printf("A sua idade tem o total de %d dias", idadeEmDias(ano,mes,dia));
        scanner.close();
    }

    public static int idadeEmDias(int ano, int mes, int dia){
        int total_dias =  (ano * 365) + (mes * 30) + dia;
         return total_dias;
    }
}

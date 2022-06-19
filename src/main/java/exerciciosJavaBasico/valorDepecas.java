package exerciciosJavaBasico;

import java.util.Scanner;

public class valorDepecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor unitario da peca 1");
        double valorUnitario1 = scanner.nextDouble();
        System.out.println("Informe a quantidade da peca 1: ");
        int quantidadePeca1 = scanner.nextInt();
        System.out.println("Informe o valor unitario da peca 2");
        double valorUnitario2 = scanner.nextDouble();
        System.out.println("Informe a quantidade da peca 2: ");
        int quantidadePeca2 = scanner.nextInt();
        double total = (valorUnitario1 * quantidadePeca1 + valorUnitario2 * quantidadePeca2) * (10/100 +1);
        System.out.println(total);


        scanner.close();
    }
}

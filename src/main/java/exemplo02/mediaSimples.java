package exemplo02;

import java.util.Scanner;

public class mediaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor 1:");
        double valorUm = scanner.nextDouble();
        System.out.println("Informe o valor 2:");
        double valorDois = scanner.nextDouble();

        System.out.println("A media eh: "+ simplesMedia(valorUm,valorDois));

        scanner.close();

    }

    public static double simplesMedia(double valorUm, double valorDois){
        return (valorUm + valorDois) /2;
    }
}

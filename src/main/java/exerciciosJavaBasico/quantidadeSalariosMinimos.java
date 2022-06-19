package exerciciosJavaBasico;

import java.util.Scanner;

public class quantidadeSalariosMinimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor unitario do salario minimo");
        double valorSalarioMinimo = scanner.nextDouble();
        System.out.println("Informe o seu salario: ");
        double salario = scanner.nextDouble();
        System.out.println(salario/valorSalarioMinimo);
        scanner.close();
    }
}

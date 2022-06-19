package exerciciosJavaBasico;

import java.util.Scanner;

public class reajusteSaldo {
    public static void main(String[] args) {
        System.out.println("Informe o seu saldo: ");
        double saldo = new Scanner(System.in).nextDouble();
        saldo = saldo + (saldo * 0.01);
        System.out.println(saldo);
    }
}

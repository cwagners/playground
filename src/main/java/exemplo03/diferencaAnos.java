package exemplo03;

import java.util.Scanner;

public class diferencaAnos {
    public static void main(String[] args) {
        imprimir("Informe o ano inicial: ");
        int anoUm = new Scanner(System.in).nextInt();
        imprimir("Informe o ano final: ");
        int anoDois = new Scanner(System.in).nextInt();
        imprimir("A diferenca entre os anos eh: "+ anoDiferenca(anoUm, anoDois));
    }

    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static int anoDiferenca(int anoUm, int anoDois){
        return anoDois - anoUm;
    }
}

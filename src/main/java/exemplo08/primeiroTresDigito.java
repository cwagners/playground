package exemplo08;

public class primeiroTresDigito {

    public static void main(String[] args) {
        String entrada = "IAB2032";
        System.out.printf("Entrada : %s \n",entrada);
        System.out.printf("Saida : %s", primeirosDigitos(entrada));

    }

    public static String primeirosDigitos(String frase){
        String tresDigito = frase.substring(0,3);
        return tresDigito;

    }
}

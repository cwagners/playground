package exemplo08;

public class ultimaMinuscula {

    public static void main(String[] args) {
        String entrada = "UM DIA É DA CAÇA, OUTRO DO CAÇADOR";
        System.out.printf("Entrada : %s \n",entrada);
        String saida = palavraMinuscula(entrada);
        System.out.printf("Saida : %s",entrada.replaceFirst(saida, saida.toLowerCase()));
    }
    public static String palavraMinuscula(String texto){
        String [] novoTexto = texto.split(" ");
        String ultimo = novoTexto[novoTexto.length -1];

        return ultimo;
    }
}

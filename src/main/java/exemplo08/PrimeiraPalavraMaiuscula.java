package exemplo08;

public class PrimeiraPalavraMaiuscula {

    public static void main(String[] args) {
        String entrada = "Pimenta nos Olhos dos Outros é Refresco";
        System.out.printf("Entrada : %s \n",entrada);
        String saida = palavraMaiuscula(entrada);
        System.out.printf("Saida : %s",entrada.replaceFirst(saida, saida.toUpperCase()));
    }

    public static String palavraMaiuscula(String texto){
        String [] novoTexto = texto.split(" ");
        String primeiro = novoTexto[0];

        return primeiro ;
    }
}

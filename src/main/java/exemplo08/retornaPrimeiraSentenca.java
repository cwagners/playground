package exemplo08;

public class retornaPrimeiraSentenca{
    public static void main(String[] args) {
        String entrada = "UM DIA É DA CAÇA. OUTRO DO CAÇADOR";
        System.out.printf("Entrada : %s \n",entrada);
        String saida = primeiraSentenca(entrada);
        System.out.printf("Saida : %s",primeiraSentenca(entrada) );
    }

    public static String primeiraSentenca(String frase){
        int posicao = frase.indexOf(",");
        String resultado = "";
        if(posicao != -1){
            resultado = frase.substring(0, posicao);
        }else{
            posicao = frase.indexOf(".");
            resultado = frase.substring(0, posicao);
        }
        return resultado;
    }
}



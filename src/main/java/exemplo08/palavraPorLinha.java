package exemplo08;

import java.util.Arrays;

public class palavraPorLinha {
    public static void main(String[] args) {
        String frase = "A pressa é a inimiga da perfeição";
        splitFrase(frase);

    }

    public static void splitFrase(String frase){
        String [] palavras = frase.split(" ");
        for(int i = 0; i < palavras.length; i++){
            System.out.println(palavras[i]);

        }


    }
}

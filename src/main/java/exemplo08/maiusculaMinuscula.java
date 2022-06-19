package exemplo08;

import java.util.Locale;

public class maiusculaMinuscula {
    public static void main(String[] args) {
        String frase = "Pimenta nos Olhos dos Outros é Refresco";
        fraseMaiuculaMinuscula(frase);

    }

    public static void fraseMaiuculaMinuscula(String frase){
        String minuscula = frase.toLowerCase();
        String maiuscula = frase.toUpperCase();
        System.out.println(frase);
        System.out.println(minuscula);
        System.out.println(maiuscula);
    }
}

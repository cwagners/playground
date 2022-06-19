package exericiciosJavaRepeticao;

public class exercicio01 {

    public static void main(String[] args) {

        imprimeVinteVezes("Eu gosto de estudar Algoritmos!");

    }
    public static void imprimeVinteVezes(String texto){
        for(int i=0; i<20; i++){
            System.out.println(i + " - "+ texto);
        }
    }
}

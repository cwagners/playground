package exericiciosJavaRepeticao;

public class exercicio02 {
    public static void main(String[] args) {
        somaNumeros();
    }

    public static void somaNumeros(){
        int somaNumero = 0;
        for(int i=1; i<=15; i++){
            somaNumero = somaNumero + i;
        }
        System.out.println(somaNumero);
    }
}

package exemplo06;

/*
Faça um método que recebe uma lista de números inteiros e retorna o primeiro número PAR.
Refatorar para usar o break/return/continue;

 */
public class exercicioParVersaoBreak {

    public static void main(String[] args) {
        int[] inteiros = new int[]{0, 2, 3, 8, 9, 11, 15, 20};
        int primeiroPar = obtemPrimeiroPar(inteiros);
        System.out.println(primeiroPar);
    }

    public static int obtemPrimeiroPar(int[] inteiros){
        int contador = 0;
        int par = 0;

        while ( contador < inteiros.length){
            if(isPar(inteiros[contador])){
                par = inteiros[contador];
                break;
            }
            contador++;
        }
        return par;
    }

    public static boolean isPar(int numero){
        int restoDe2 = numero%2;
        return restoDe2 == 0; // todas as expressões retornam boolean (true ou false)
    }
}

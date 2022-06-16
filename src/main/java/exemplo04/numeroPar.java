package exemplo04;

import java.util.Scanner;

/**
 * Faça um método que verifica se um número é par.
 * Se par, retornar "true", senão, "false".
 */
public class numeroPar {

    public static void main(String[] args){

//        boolean par3 = isPar(3);
//        System.out.println("3 é par? "+par3);

        int numeroASerVerificado = pedirNumero();
        boolean numeroEhPar = isPar( numeroASerVerificado );
        System.out.println(numeroASerVerificado + " é par?" + numeroEhPar );
    }

    public static int pedirNumero(){
        int numero = new Scanner(System.in).nextInt();
        return numero;
    }

    public static boolean isPar(int numero){
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}


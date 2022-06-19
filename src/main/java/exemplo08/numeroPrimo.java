package exemplo08;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero natual: ");
        int numero = scanner.nextInt();
        if(ePrimoOuNao(numero)){
            System.out.printf("O número %d informado eh Primo!",numero);
        }else{
            System.out.printf("O número %d informado não eh Primo!",numero);
        }

        scanner.close();
    }
    public static boolean ePrimoOuNao(int numero){
        for (int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

}




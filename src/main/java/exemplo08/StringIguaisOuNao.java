package exemplo08;

import java.util.Scanner;

public class StringIguaisOuNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o e-mail: ");
        String email = scanner.next();
        if(stringIguais(email)){
            System.out.println(email);
            System.out.println("seuemail@mail.com");
            System.out.println("As Strings São Iguais True");
        }else{
            System.out.println(email);
            System.out.println("seuemail@mail.com");
            System.out.println("As Strings São Diferentes False");
        }

    }

    public static boolean stringIguais(String frase){
        if(frase.compareTo("seuemail@mail.com") == 0){
            return true;
        }
        return false;
    }
}

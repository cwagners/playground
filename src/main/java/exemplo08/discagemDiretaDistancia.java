package exemplo08;

import java.util.Scanner;

public class discagemDiretaDistancia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um DDD do estado do RS: ");
        int discagem = scanner.nextInt();
        System.out.printf("O DDD %d informado é de uma %s",discagem, dDDRs(discagem));
        scanner.close();
    }

    public static String dDDRs(int ddd){
        String regiao = "";

        switch (ddd){
            case 51:
                regiao = "Região Metropolitana de Porto Alegre";
                break;
            case 53:
                regiao = "Pelotas e região";
                break;
            case 54:
                regiao = "Caxias do Sul e região";
                break;
            case 55:
                regiao = "Santa Maria e região";
                break;
            default:
                regiao = "Região não identificada";

        }
        return regiao;
    }
}

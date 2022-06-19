package exemplo08;

import java.util.Scanner;

public class discagemDiretaDistanciaSul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um DDD da região Sul: ");
        int discagem = scanner.nextInt();
        System.out.printf("O DDD %d informado é de um estado %s",discagem, dDDR(discagem));
        scanner.close();

    }
    public static String dDDR(int ddd){
        String regiao = "";

        switch (ddd){
            case 48:
                regiao = "Santa Catarina";
                break;
            case 49:
                regiao = "Santa Catarina";
                break;
            case 51:
                regiao = "Rio Grande do Sul";
                break;
            case 53:
                regiao = "Rio Grande do Sul";
                break;
            case 45:
                regiao = "Paraná";
                break;
            case 46:
                regiao = "Paraná";
                break;
            default:
                regiao = "não identificado";

        }
        return regiao;
    }
}

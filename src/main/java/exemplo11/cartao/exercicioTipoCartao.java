package exemplo11.cartao;

import java.util.Scanner;

/*
    ExercÌcio 1: FaÁa um programa que recebe como entrada a rendaMensal e retorna o tipo de cart„o recomendado:

    1. Crie um enum TipoCartao com as modalidades:
    - STANDARD
    - GOLD
    - PREMIUM
    - BLACK

    2. Crie um novo mÈtodo que devolve o tipo de cart„o de uma financeira de acordo com a rendaMensal:
    STANDARD:   rendaMensal < 1000
    GOLD:       rendaMensal >= 1000 e < 3000
    PREMIUM:    rendaMensal >= 3000 e < 10000
    BLACK:      rendaMensal >= 10000

    3. O main deve pedir a rendaMensal e imprimir o tipoDeCartao
 */
public class exercicioTipoCartao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua renda mensal :\n");
        Double salario = scanner.nextDouble();
        tipoDeCartao(salario);
        scanner.close();
    }
    public static void tipoDeCartao(Double salary){
        tipoCartao[] cartao = tipoCartao.values();
        if(salary < 1000){
            System.out.printf("O tipo de cartao indicado e o %s", cartao[3]);
        }else if(salary >= 1000 && salary < 3000){
            System.out.printf("O tipo de cartao indicado e o %s", cartao[1]);
        }else if(salary >= 3000 && salary < 10000){
            System.out.printf("O tipo de cartao indicado e o %s", cartao[2]);
        } else if(salary > 10000){
        System.out.printf("O tipo de cartao indicado e o %s", cartao[0]);
    }
    }
}



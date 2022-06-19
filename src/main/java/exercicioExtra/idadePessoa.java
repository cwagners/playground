package exercicioExtra;

import java.util.Scanner;

public class idadePessoa {

    public static void main(String[] args) {
        int numero;
        System.out.println("Informe uma Idade: ");
        numero = new Scanner(System.in).nextInt();
        System.out.printf("A idade informada %d  a pessoa é um(a)  %s",numero, regraPessoa(numero));


    }

    public static String regraPessoa(int idade){
        String classificacao = "";

        if (idade < 12){
            classificacao = "Criança";
        }else if(idade >= 12 && idade <= 18){
            classificacao = "Adolescente";
        }else if(idade > 18){
            classificacao = "Adulto";
        }
        return classificacao;
    }
}
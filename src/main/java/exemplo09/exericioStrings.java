package exemplo09;

import java.util.Scanner;

/*
ExercÌcio de comparaÁ„o de Strings:

Criar um programa para gerenciar uma lista de chamadas.
    - Criar um mÈtodo que pede ao usu·rio por um nome.
    - Criar um mÈtodo que adiciona o nome em uma lista.
    - Regra: somente adicionar o nome se esse ainda n„o estiver na lista.

ExercÌcio de comparaÁ„o de concatenaÁ„o de Strings:

- No Programa de Lista de Chamadas, gerar String ˙nica com todos os nomes da chamada,
    separados por vÌrgula e escrever no console.
 */
public class exericioStrings {

    public static void main(String[] args) {
        String[] chamada = solicitaNomes();
        imprimeChamada(chamada);
    }

    public static String[] solicitaNomes(){
        String[] chamada = new String[5];

        int posicao = 0;
        while (posicao < chamada.length) {
            System.out.println("Informe um nome:");
            String nome = new Scanner(System.in).nextLine();

            if(!existeNaLista(chamada, nome)){
                chamada[posicao++] = nome;
            }
        }

        return chamada;
    }
    public static void imprimeChamada(String[] chamada){
        StringBuilder sbChamada = new StringBuilder("Alunos: ");
        for (int i = 0; i < chamada.length; i++) {
            sbChamada.append(chamada[i]);
            if(i < chamada.length-1){
                sbChamada.append(", ");
            }
        }
        System.out.println(sbChamada.toString());
    }

    public static boolean existeNaLista(String[] lista, String nome){

        boolean jaExisteNaLista = false;
        for (int j = 0; j < lista.length; j++) {
            //if(lista[j].equals(nome)){ // Isso d· NPE Null Pointer Exception
            if(lista[j] != null && lista[j].equals(nome)){
                System.out.println("Nome j· existe na lista!!");
                jaExisteNaLista = true;
                break;
            }
        }
        return jaExisteNaLista;
    }

}

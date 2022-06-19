package exemplo11.pessoa;

import java.util.Scanner;

public class exemploTiposDePessoa {

    public static void main(String[] args) {

        //DeclaraÁ„o "FIXA" de um enum
        tipoPessoa tipoFisica = tipoPessoa.PESSOA_FISICA;

        //Percorrer e listar os tipos
        for(tipoPessoa tipo : tipoPessoa.values()){ // for-each ( tipo nome : lista )
            System.out.println("->" + tipo);
        }

        System.out.println("Informe um tipo de Conta:");
        String entrada = new Scanner(System.in).nextLine();
        // Com valueOf validamos que sÛ passar· os 2 tipos
        // Converte a sting em um enum de mesmo valor
        tipoPessoa tipo = tipoPessoa.valueOf(entrada);

        System.out.println(tipo.name());// transforma o enum em uma string
        System.out.println(tipo.ordinal());// obtÈm a posiÁ„o dentro do enum

        switch (tipo){
            case PESSOA_FISICA:
                System.out.println("Pessoa fÌsica selecionado!");
                break;
            case PESSOA_JURIDICA:
                System.out.println("Pessoa jurÌdica selecionada!");
                break;
        }

        if(tipo == tipoPessoa.PESSOA_FISICA){ // DEVEMOS usar o == em ENUMs
            System.out.println("… pessoa fÌsica!");
        }

    }
}

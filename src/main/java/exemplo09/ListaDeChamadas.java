package exemplo09;

public class ListaDeChamadas {

    public static void main(String[] args) {
        listaChamadasNomes();
    }

    public static void listaChamadasNomes() {
        String[] listaNomes = {"Carlos", "Ana", "Carlos", "Cristiano", "Liziane"};

        StringBuilder stringBuilderLista = new StringBuilder();

        for (int i = 0; i < listaNomes.length; i++) {

            if (!existeNomeLista(listaNomes, listaNomes[i])) {
                System.out.println("TESTE");;
            } else {
                stringBuilderLista.append(i + " - ").append(listaNomes[i]).append("\n");
            }


        }


        String relatorio = stringBuilderLista.toString();
        System.out.println(relatorio);

    }

    public static boolean existeNomeLista(String[] lista, String nome) {
        for (int j = 0; j < lista.length; j++) {
            if (nome.compareTo(lista[j]) == 0) {
                break;
                //   return true;

            }

        }
        return false;
    }
}





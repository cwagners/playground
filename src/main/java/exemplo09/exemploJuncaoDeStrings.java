package exemplo09;

public class exemploJuncaoDeStrings {

    public static void main(String[] args) {

        int[] pedidos = new int[]{81919, 1394, 19292};

        //String relatorio = "Pedidos gerados: \n";

        StringBuilder stringBuilderPedidos = new StringBuilder();
        stringBuilderPedidos.append("Pedidos gerados: \n");

        for (int i = 0; i < pedidos.length; i++) {
            //relatorio = relatorio + "- " + pedidos[i] + "\n";
            //relatorio += "- " + pedidos[i] + "\n";
            stringBuilderPedidos
                    .append("- ")
                    .append(pedidos[i])
                    .append("\n");
        }
        stringBuilderPedidos.append("Fim do relatÛrio.");
        //relatorio = relatorio + "Fim do relatÛrio.";

        String relatorio = stringBuilderPedidos.toString();
        System.out.println(relatorio);
    }

    public static int getInt(){
        return 1;
    }
}

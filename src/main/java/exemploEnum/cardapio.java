package exemploEnum;

public class cardapio {

    public static void main(String[] args) {
        cardapioIdeal(609);
    }

    public static void cardapioIdeal(int calorias){
        StringBuilder menu = new StringBuilder();

        if(calorias <=300){
                menu.append(tipoPrato.VEGETARIANO + "\n");
                menu.append(tipoSobremesa.ABACAXI + "\n");
                menu.append(tipoBebida.CHA + "\n");
            System.out.println(menu.toString());
        }else if(calorias >300 && calorias <=500){
            menu.append(tipoPrato.PEIXE + "\n");
            menu.append(tipoSobremesa.SORVETE_DIET + "\n");
            menu.append(tipoBebida.SUCO_DE_LARANJA + "\n");
            System.out.println(menu.toString());
        }else if(calorias >500 && calorias <=600){
            menu.append(tipoPrato.FRANGO+ "\n");
            menu.append(tipoSobremesa.MOUSE_DIET + "\n");
            menu.append(tipoBebida.SUCO_DE_MELAO + "\n");
            System.out.println(menu.toString());
        }else if(calorias >600){
            menu.append(tipoPrato.CARNE + "\n");
            menu.append(tipoSobremesa.MOUSE_CHOLOCATE + "\n");
            menu.append(tipoBebida.REFRIGERANTE_DIET + "\n");
            System.out.println(menu.toString());
        }


    }
}

package exemplo04;

public class validaNumero {

    public static void main(String[] args) {
        ParOuImpar(3);
    }

    public static void ParOuImpar(Integer numero){

        if(numero %2 == 0){
            System.out.println("O número "+ numero+ " é par");
        }else{
            System.out.println("O numero "+ numero+ " é impar");
        }
    }
}


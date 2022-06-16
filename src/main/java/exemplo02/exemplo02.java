package exemplo02;

public class exemplo02 {
    public static void main(String[] args) {

        System.out.println("A media entre os numeros "+ 5 + " e " + 8 + " eh: "+ media(5.0, 8.0));

    }

    public static double media(double notaUm, double notaDois){
        return (notaUm + notaDois) /2;
    }
}

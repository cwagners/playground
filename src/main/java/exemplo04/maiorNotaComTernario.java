package exemplo04;

public class maiorNotaComTernario {

    public static void main(String[] args) {
        double nota1 = 7.9;
        double nota2 = 8.8;

        double maiorNota = obtemMaiorNota(nota1, nota2);

        System.out.println("Maior nota: "+ maiorNota);
    }

    public static double obtemMaiorNota(double nota1, double nota2){
        return nota1 > nota2 ? nota1 : nota2;
    }
}
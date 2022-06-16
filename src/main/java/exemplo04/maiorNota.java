package exemplo04;

public class maiorNota {
    public static void main(String[] args) {


        System.out.println("A Maior nota e " + maiorNota(9.0, 8.5));
    }
    public static double maiorNota(double nota1, double nota2){
        if(nota1 > nota2){
            return nota1;

        }else{
            return nota2;
        }

    }
}
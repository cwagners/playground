package exerciciosJavaBasico;

public class mediaAritmtica {
    public static void main(String[] args) {
        int [] numerosUm = {4,5,6};
        int [] numerosDois = {8,9,7};
        media(numerosUm, numerosDois);

    }
    public static void media(int [] numeros, int numeros2[]){
        double mediaUm = 0.0;
        double mediaDois = 0.0;
        double mediaDasMedias = 0.0;
        for (int i =0; i< numeros.length; i++){
            mediaUm = mediaUm + numeros[i];
        }
        mediaUm = mediaUm /3;
        for (int j =0; j< numeros2.length;j++){
            mediaDois = mediaDois+ numeros2[j];
        }
        mediaDois = mediaDois /3;
        mediaDasMedias = ((mediaUm  + mediaDois))/2;
        System.out.println("Media do grupo 1 de numeros: "+mediaUm);
        System.out.println("Media do grupo 2 de numeros: "+mediaDois);
        System.out.println("Media das medias: "+mediaDasMedias);


    }

}

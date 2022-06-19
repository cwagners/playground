import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumIntReturnTextoTest {

    @Test

    void deveriaRetornarZero(){
        int numero = 0;
        String texto;
        //Assertions.assertEquals(0, numero);
        if (numero == 0){
            texto = "Zero";
        }
        else if (numero < 0){
            texto = "Negativo";
        }else{
            texto = "Positivo";
        }
        //Assertions.assertEquals(0,numero,"Zero");
        Assertions.assertEquals("Zero", texto);

    }

    @Test

    void deveriaRetornarPositivo(){
        int numero = 1;
        String texto;
        //Assertions.assertEquals(0, numero);
        if (numero == 0){
            texto = "Zero";
        }
        else if (numero < 0){
            texto = "Negativo";
        }else{
            texto = "Positivo";
        }
        //Assertions.assertEquals(0,numero,"Zero");
        Assertions.assertEquals("Positivo", texto);

    }

    void deveriaRetornarNegativo(){
        int numero = -1;
        String texto;
        //Assertions.assertEquals(0, numero);
        if (numero == 0){
            texto = "Zero";
        }
        else if (numero < 0){
            texto = "Negativo";
        }else{
            texto = "Positivo";
        }
        //Assertions.assertEquals(0,numero,"Zero");
        Assertions.assertEquals("Negativo", texto);

    }


}

import exemplo05.primeiroElemento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class primeiroElementoTest {

    @Test
    void deveriaRetornarPrimeiroElemento(){
        int[] elementos = new int[]{3, 8, 1};
        int primeiro = primeiroElemento.obtemPrimeiroElemento(elementos);
        Assertions.assertEquals(3, primeiro);
    }

    @Test
    void deveriaRetornarMenosUmQuandoZero(){
        int[] elementos = new int[]{0, 8, 1};
        int primeiro = primeiroElemento.obtemPrimeiroElemento(elementos);
        Assertions.assertEquals(-1, primeiro);
    }
}


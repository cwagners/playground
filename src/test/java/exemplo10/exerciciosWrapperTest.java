package exemplo10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class exerciciosWrapperTest {

    @Test
    void deveriaRetornarExcessoDeBagagem(){

        String situacao = exercicioWrapper.obtemSituacaoBagagem(23F);

        Assertions.assertEquals("Excesso de peso, haver· cobranÁa de adicional.", situacao);
    }

    @Test
    void deveriaRetornarPesoMaximo(){

        String situacao = exercicioWrapper.obtemSituacaoBagagem(22.5F);

        Assertions.assertEquals("Peso m·ximo atingido.", situacao);
    }

    @Test
    void deveriaRetornarPesoAbaixo(){

        String situacao = exercicioWrapper.obtemSituacaoBagagem(22.4F);

        Assertions.assertEquals("Peso abaixo do limite.", situacao);
    }

}
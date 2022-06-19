import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static exercicioExtra.idadePessoa.regraPessoa;

public class idadePessoaText {
    @Test
    void deveriaRetornarCrianca(){

        int idade = 10;

        String classificacao = regraPessoa(idade);

        Assertions.assertEquals("Criança",classificacao);

    }

    @Test
    void deveriaRetornarAdolescente(){

        int idade = 15;

        String classificacao = regraPessoa(idade);

        Assertions.assertEquals("Adolescente",classificacao);

    }

    @Test
    void deveriaRetornarAdulto(){

        int idade = 90;

        String classificacao = regraPessoa(idade);

        Assertions.assertEquals("Adulto",classificacao);

    }
}

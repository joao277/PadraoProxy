package com.example;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



import java.util.Arrays;



class PlayerProxyTest {

    @BeforeEach
    void setUp() {
        BD.addPlayer(new Player("João", "Juiz de Fora", "87569877","32698745", "111-111-111-11"));
        BD.addPlayer(new Player("Maria", "São domingos", "5556977", "3265984", "999-99-999-99"));
    }

    @Test
    void deveRetornarDadosPessoaisDoPlayer() {
        PlayerProxy player = new PlayerProxy("111-111-111-11");

        assertEquals(Arrays.asList("João", "Juiz de Fora", "111-111-111-11"), player.obterDadosPessoais());
    }

    @Test
    void deveRetonarContatoDoPlayer() {
        GM gameMaster = new GM("ana@gmail.com", true);
        PlayerProxy player = new PlayerProxy("999-99-999-99");

        assertEquals(Arrays.asList("5556977", "3265984"), player.obterContatos(gameMaster));
    }

    @Test
    void deveRetonarExcecaoAdministradorSemValidaccao() {
        try {
            GM gameMaster = new GM("walkiria@gmail.com", false);
            PlayerProxy player = new PlayerProxy("111-111-111-11");

            player.obterContatos(gameMaster);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Faça login no sistema", e.getMessage());
        }
    }
}

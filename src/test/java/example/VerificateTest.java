package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificateTest {

    @Test
    void should_return_ture_when_play_verificateAnswer_given_1234() {
        //given
        Verificate verificate = new Verificate();

        //when
        boolean flag = verificate.verificateAnswer("1234");

        //then
        assertEquals(Boolean.TRUE, flag);
    }
}

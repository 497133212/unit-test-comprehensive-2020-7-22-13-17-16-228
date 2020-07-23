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

    @Test
    void should_return_false_when_play_verificateAnswer_given_12() {
        //given
        Verificate verificate = new Verificate();

        //when
        boolean flag = verificate.verificateAnswer("12");

        //then
        assertEquals(Boolean.FALSE, flag);
    }

    @Test
    void should_return_false_when_play_verificateAnswer_given_1227() {
        //given
        Verificate verificate = new Verificate();

        //when
        boolean flag = verificate.verificateAnswer("1227");

        //then
        assertEquals(Boolean.FALSE, flag);
    }

    @Test
    void should_return_false_when_play_verificateAnswer_given_12345() {
        //given
        Verificate verificate = new Verificate();

        //when
        boolean flag = verificate.verificateAnswer("12345");

        //then
        assertEquals(Boolean.FALSE, flag);
    }
}

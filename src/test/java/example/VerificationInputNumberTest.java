package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificationInputNumberTest {

    @Test
    void should_return_ture_when_play_verificateAnswer_given_1234() {
        //given
        VerificationInputNumber verificationInputNumber = new VerificationInputNumber();

        //when
        boolean flag = verificationInputNumber.verificationGuessNumber("1234");

        //then
        assertEquals(Boolean.TRUE, flag);
    }

    @Test
    void should_return_false_when_play_verificateAnswer_given_12() {
        //given
        VerificationInputNumber verificationInputNumber = new VerificationInputNumber();

        //when
        boolean flag = verificationInputNumber.verificationGuessNumber("12");

        //then
        assertEquals(Boolean.FALSE, flag);
    }

    @Test
    void should_return_false_when_play_verificateAnswer_given_1227() {
        //given
        VerificationInputNumber verificationInputNumber = new VerificationInputNumber();

        //when
        boolean flag = verificationInputNumber.verificationGuessNumber("1227");

        //then
        assertEquals(Boolean.FALSE, flag);
    }

    @Test
    void should_return_false_when_play_verificateAnswer_given_12345() {
        //given
        VerificationInputNumber verificationInputNumber = new VerificationInputNumber();

        //when
        boolean flag = verificationInputNumber.verificationGuessNumber("12345");

        //then
        assertEquals(Boolean.FALSE, flag);
    }
}

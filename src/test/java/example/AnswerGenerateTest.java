package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnswerGenerateTest {

    @Test
    void should_return_answer_when_generate() {
        //given
        AnswerGenerateImplement answerGenerateImplement = new AnswerGenerateImplement();

        //when
        String answer = answerGenerateImplement.generate();

        //then
        assertNotNull(answer);
    }
}

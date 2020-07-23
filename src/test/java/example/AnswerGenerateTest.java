package example;

import org.junit.jupiter.api.Test;

public class AnswerGenerateTest {

    @Test
    void should_return_answer_when_generate() {
        //given
        AnswerGenerateImplement answerGenerateImplement = new AnswerGenerateImplement();

        //when
        String answer = answerGenerateImplement.generate();

        //then
        System.out.println(answer);
    }
}

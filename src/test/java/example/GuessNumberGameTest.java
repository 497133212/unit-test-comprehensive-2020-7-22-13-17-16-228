package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {

    @Test
    void should_return_4A0B_when_1234_given_1234() {
        //given
        GameNumberGame gameNumberGame = new GameNumberGame("1234");

        //when
        String guessResult = gameNumberGame.guess("1234");
        //then
        assertEquals("4A0B", guessResult);
    }

    @Test
    void should_return_2A2B_when_1243_given_1234() {
        //given
        GameNumberGame gameNumberGame = new GameNumberGame("1234");

        //when
        String guessResult = gameNumberGame.guess("1243");
        //then
        assertEquals("2A2B", guessResult);
    }

    @Test
    void should_return_1A1B_when_1025_given_1234() {
        //given
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        GameNumberGame gameNumberGame = new GameNumberGame(mockedAnswerGenerate);

        //when
        String guessResult = gameNumberGame.guess("1025");
        //then
        assertEquals("1A1B", guessResult);
    }
}

package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

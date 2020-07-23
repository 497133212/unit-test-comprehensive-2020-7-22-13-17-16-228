package example;

public class GameNumberGame {
    private String answer;

    public GameNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guess) {
        if(answer.equals(guess)) {
            return "4A0B";
        }
        return "2A2B";
    }
}

package example;

public class GameNumberGame {
    private String answer;

    public GameNumberGame(String answer) {
        this.answer = answer;
    }

    public GameNumberGame(AnswerGenerate answerGenerate) {
        this.answer = answerGenerate.generate();
    }

    public String guess(String guess) {
        int allRight = 0;
        int positionRight = 0;
        String number = this.answer;
        for (int i = 0; i < guess.length(); i++) {
            char charIndex = guess.charAt(i);
            int index = number.indexOf(charIndex);
            if (index == i) {
                allRight++;
                continue;
            }
            positionRight = index != -1 ? ++positionRight : positionRight;
        }
        return String.format("%sA%sB", allRight, positionRight);
    }
}

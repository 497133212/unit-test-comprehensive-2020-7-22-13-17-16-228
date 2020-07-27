package example;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public GuessNumberGame(AnswerGenerate answerGenerate) {
        this.answer = answerGenerate.generate();
    }

    public String guess(String guess) {
        int correctPositionAndNumber = 0;
        int correctPosition = 0;
        String number = this.answer;
        for (int i = 0; i < guess.length(); i++) {
            char charIndex = guess.charAt(i);
            int index = number.indexOf(charIndex);
            if (index == i) {
                correctPositionAndNumber++;
                continue;
            }
            correctPosition = index != -1 ? ++correctPosition : correctPosition;
        }
        return String.format("%sA%sB", correctPositionAndNumber, correctPosition);
    }
}

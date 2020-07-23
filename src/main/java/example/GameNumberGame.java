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
        String number = answer;
        for(int i=0;i<guess.length();i++) {
            String guessSubstring = guess.substring(i,i+1);
            boolean flag = number.contains(guessSubstring);
            if(flag) {
                int index = number.indexOf(guessSubstring);
                if(index == i) {
                    allRight++;
                } else {
                    positionRight++;
                }
            }
        }
        String result = String.format("%sA%sB",allRight, positionRight);
        return result;
    }
}

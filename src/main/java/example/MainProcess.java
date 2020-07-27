package example;

import java.util.Scanner;

public class MainProcess {

    public static final String INPUT_GUESS_NUMBER = "Please enter the number you want to guess. You have a total of six chances.";

    public static void main(String[] args) {
        AnswerGenerate answerGenerate = new AnswerGenerateImplement();
        GeneralMethod generalMethod = new GeneralMethod();
        String answer = answerGenerate.generate();
        generalMethod.printMessage("Answer:" + answer);
        generalMethod.printMessage(INPUT_GUESS_NUMBER);
        generalMethod.JudgeGuessResult(answer);
    }

}

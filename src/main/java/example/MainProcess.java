package example;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        AnswerGenerate answerGenerate = new AnswerGenerateImplement();
        GeneralMethod generalMethod = new GeneralMethod();
        String answer = answerGenerate.generate();
        generalMethod.print("Answer:" + answer);
        generalMethod.print("Please enter the number you want to guess. You have a total of six chances.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            StringBuilder guess = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                guess.append(scanner.nextInt());
            }
            VerificationInputNumber verificate = new VerificationInputNumber();
            boolean flag = verificate.verificationGuessNumber(guess.toString());
            if (flag) {
                GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
                String result = guessNumberGame.guess(guess.toString());
                System.out.println(result);
                if ("4A0B".equals(result)) {
                    generalMethod.print("you win!");
                    break;
                }
            } else {
                generalMethod.print("Wrong Input，Input again");
            }
        }

    }

}

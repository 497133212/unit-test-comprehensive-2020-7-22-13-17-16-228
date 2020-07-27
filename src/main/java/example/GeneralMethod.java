package example;

import java.util.Scanner;

public class GeneralMethod {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String inputGuessNumber() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder guess = new StringBuilder();
        for (int j = 0; j < 4; j++) {
            guess.append(scanner.nextInt());
        }
        return guess.toString();
    }

    public void JudgeGuessResult(String answer) {
        for (int i = 1; i <= 6; i++) {
            String guess = inputGuessNumber();
            VerificationInputNumber verificationInputNumber = new VerificationInputNumber();
            if (verificationInputNumber.verificationGuessNumber(guess)) {
                GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
                String result = guessNumberGame.guess(guess);
                System.out.println(result);
                if ("4A0B".equals(result)) {
                    this.printMessage("you win!");
                    break;
                }
            } else {
                this.printMessage("Wrong Input，Input again");
            }
        }
    }
}

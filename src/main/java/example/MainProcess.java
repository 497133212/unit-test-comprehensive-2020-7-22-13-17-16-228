package example;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        AnswerGenerate answerGenerate = new AnswerGenerateImplement();
        PrintMessage printMessage = new PrintMessage();
        String answer = answerGenerate.generate();
        printMessage.print("Answer:" + answer);
        printMessage.print("Please enter the number you want to guess. You have a total of six chances.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            StringBuilder guess = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                guess.append(scanner.nextInt());
            }
            Verificate verificate = new Verificate();
            boolean flag = verificate.verificateAnswer(guess.toString());
            if (flag) {
                GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
                String result = guessNumberGame.guess(guess.toString());
                System.out.println(result);
                if ("4A0B".equals(result)) {
                    printMessage.print("you win!");
                    break;
                }
            } else {
                printMessage.print("Wrong Input，Input again");
            }
        }

    }

}

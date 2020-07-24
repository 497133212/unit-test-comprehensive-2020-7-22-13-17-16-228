package example;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        AnswerGenerate answerGenerate = new AnswerGenerateImplement();
        PrintMessage printMessage = new PrintMessage();
        String answer = answerGenerate.generate();
        printMessage.print(answer);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            String guess = scanner.next();
            Verificate verificate = new Verificate();
            boolean flag = verificate.verificateAnswer(guess);
            if (flag) {
                GameNumberGame gameNumberGame = new GameNumberGame(answer);
                String result = gameNumberGame.guess(guess);
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

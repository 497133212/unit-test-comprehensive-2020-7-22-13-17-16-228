package example;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        AnswerGenerateImplement answerGenerateImplement = new AnswerGenerateImplement();
        String answer = answerGenerateImplement.generate();
        System.out.println(answer);
        for(int i=1;i<=6;i++) {
            Scanner scanner = new Scanner(System.in);
            String guess = scanner.next();
            Verificate verificate = new Verificate();
            boolean flag = verificate.verificateAnswer(guess);
            if(flag) {
                GameNumberGame gameNumberGame = new GameNumberGame(answer);
                String result = gameNumberGame.guess(guess);
                System.out.println(result);
                if("4A0B".equals(result)) {
                    break;
                }
            } else {
                System.out.println("Wrong Input，Input again");
            }
        }
    }
}

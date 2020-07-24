package example;

import java.util.Random;

public class AnswerGenerateImplement implements AnswerGenerate {
    @Override
    public String generate() {
        StringBuilder stringBuffer = new StringBuilder();
        Random ran = new Random();
        int i = 0;
        while (i < 4) {
            int number = ran.nextInt(9);
            if (stringBuffer.indexOf(String.valueOf(number)) == -1) {
                stringBuffer.append(number);
                i++;
            }
        }
        return stringBuffer.toString();
    }
}

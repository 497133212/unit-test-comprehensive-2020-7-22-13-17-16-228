package example;

import java.util.Random;

public class AnswerGenerateImplement implements AnswerGenerate {
    @Override
    public String generate() {
        StringBuilder stringBuffer = new StringBuilder();
        Random ran = new Random();
        int i = 0;
        while (i < 4) {
            int generateNumber = ran.nextInt(10);
            if (stringBuffer.indexOf(String.valueOf(generateNumber)) == -1) {
                stringBuffer.append(generateNumber);
                i++;
            }
        }
        return stringBuffer.toString();
    }
}

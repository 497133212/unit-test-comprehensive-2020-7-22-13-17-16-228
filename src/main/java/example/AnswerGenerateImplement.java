package example;

import java.util.Random;

public class AnswerGenerateImplement implements AnswerGenerate{
    @Override
    public String generate() {
        StringBuffer stringBuffer = new StringBuffer();
        Random ran = new Random();
        int i = 0;
        while(i < 4){
            int number = ran.nextInt(9);
            if(stringBuffer.indexOf(String.valueOf(number)) == -1){
                stringBuffer.append(number);
                i++;
            }
        }
        String answer = stringBuffer.toString();
        return answer;
    }
}

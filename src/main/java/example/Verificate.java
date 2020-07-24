package example;


import java.util.ArrayList;
import java.util.List;

public class Verificate {

    public boolean verificateAnswer(String answer) {
        StringBuilder stringBuffer = new StringBuilder();
        if (answer != null && answer.length() == 4) {
            for (int i = 0; i < answer.length(); i++) {
                char number = answer.charAt(i);
                if ((int) number < 48 || (int) number > 57 || stringBuffer.indexOf(String.valueOf(number)) != -1) {
                    return false;
                }
                stringBuffer.append(number);
            }
            return true;
        }
        return false;
    }

}

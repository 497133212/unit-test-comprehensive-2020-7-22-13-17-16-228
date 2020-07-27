package example;


import java.util.ArrayList;
import java.util.List;

public class VerificationInputNumber {

    public boolean verificateAnswer(String guess) {
        StringBuilder stringBuffer = new StringBuilder();
        if (guess != null && guess.length() == 4) {
            for (int i = 0; i < guess.length(); i++) {
                char number = guess.charAt(i);
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

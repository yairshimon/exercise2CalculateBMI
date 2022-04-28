
import javax.swing.*;

public class Answer {

    public Answer(){
        String numStr, result;
        int num, again, BMI = 1111;
        JLabel answer = new JLabel("");
        do {
            if (BMI < 15) answer.setText("You Anorexic");
            if (BMI > 15 && BMI < 18.5) answer.setText("You Underweight");
            if (BMI <18.5 && BMI < 24.9) answer.setText("You Normal");
            if (BMI < 25.0 && BMI < 29.9) answer.setText ("You Overweight");
            if (BMI < 30.0 && BMI < 35 ) answer.setText("You Obese");
            if (BMI >  35 ) answer.setText("You Extreme Obese");
            answer.isShowing();
            again = JOptionPane.showConfirmDialog (null, "Do Another calculate BMI?");
        }
        while (again == JOptionPane.YES_OPTION);
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActualWeight extends JPanel  {
    private JLabel actualWeight;
    private JTextField inputActualWeight;
    private double answerActualWeight;

    public double getAnswerActualWeight() {
        return answerActualWeight;
    }

    public ActualWeight()  {
        actualWeight = new JLabel ("Enter actual weight: ");
        inputActualWeight = new JTextField (5);
        add (actualWeight);
        add (inputActualWeight);
        setPreferredSize (new Dimension(300, 15));
        setBackground (Color.yellow);
    }
    private class TempListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {

            int fahrenheitTemp, celsiusTemp;
            String text = inputActualWeight.getText();
            answerActualWeight = Double.parseDouble(text);
        }
    }

}

import java.awt.*;
import javax.swing.*;
public class BorderPanel extends JPanel  {
    public BorderPanel()  {
        setLayout (new BorderLayout());
        setBackground (Color.green);
        JLabel header1 = new JLabel ("BMI test");
        JLabel header2 = new JLabel ("Please complete this form. Press the Submit button when complete ");
        BodyFrame bodyFrame = new BodyFrame();
        ActualWeight actualWeight = new ActualWeight();
        JPanel header = new JPanel(true);
        header.add(header1);
        header.add(header2);
        System.out.println(actualWeight.getAnswerActualWeight());
        JTabbedPane detailsUser = new JTabbedPane();
        detailsUser.addTab ("Intro", new detailsUser());
        detailsUser.setBounds(10000,0,8,8);
        JButton b5 = new JButton ("BUTTON 5");
        header.setFont (new Font ("Helvetica", Font.BOLD,30));
        add(header,BorderLayout.NORTH);
        add (bodyFrame, BorderLayout.CENTER);
        add (actualWeight, BorderLayout.EAST);
        add (detailsUser, BorderLayout.WEST);
        add (b5, BorderLayout.SOUTH);
        new Answer();

    }
}

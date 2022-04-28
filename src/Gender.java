import javax.swing.*;
import java.awt.*;

public class Gender extends JPanel  {

    private JLabel header;
    private JCheckBox Male, Female;
    public Gender()  {

        header = new JLabel ("gender:");
        header.setFont (new Font ("Helvetica", Font.BOLD, 20));

        Male = new JCheckBox ("Male");
        Male.setBackground (Color.cyan);
        Female = new JCheckBox ("Female");
        Female.setBackground (Color.cyan);

        add (header);
        add (Male);
        add (Female);

        setBackground (Color.cyan);
        setPreferredSize (new Dimension(300, 100));
    }

}


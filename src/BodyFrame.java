import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BodyFrame extends JPanel{

    private JLabel header;
    private JCheckBox small, medium, large;
    private String answerUser = null;
    public BodyFrame()  {
        header = new JLabel ("body-frame:");
        header.setFont (new Font("Helvetica", Font.BOLD, 20));
        small = new JCheckBox ("Small");
        small.setBackground (Color.cyan);
        medium = new JCheckBox ("Medium");
        medium.setBackground (Color.cyan);
        large = new JCheckBox ("Large");
        large.setBackground (Color.cyan);
        StyleListener listener = new StyleListener();
        small.addItemListener (listener);
        medium.addItemListener (listener);
        large.addItemListener (listener);

        add (header);
        add (small);
        add (medium);
        add (large);
        setBackground (Color.cyan);
        setPreferredSize (new Dimension(300, 100));
    }
    private class StyleListener implements ItemListener {

        public void itemStateChanged (ItemEvent event) {

            if (small.isSelected()) answerUser = "small";
            if (medium.isSelected()) answerUser = "medium";
            if (large.isSelected()) answerUser = "large";
        }
    }
}


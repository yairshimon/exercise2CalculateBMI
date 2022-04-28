import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("BMI", new BorderPanel());
        tp.setPreferredSize(new Dimension(700,500));
        frame.getContentPane().add(tp);
        frame.pack();
        frame.setVisible(true);


    }
}

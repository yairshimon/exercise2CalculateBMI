import java.awt.*;
import javax.swing.*;
public class detailsUser extends JPanel  {
    private JLabel firstName, lastName, age;
    private JTextField inputFirstName,inputLastName,inputAge;
    public detailsUser()  {
        firstName = new JLabel ("Enter first name: ");
        firstName.setBounds(2220,200,12,12);
        lastName = new JLabel ("Enter last name: ");
        age = new JLabel ("Enter your age: ");
        inputFirstName = new JTextField (5);
        inputLastName = new JTextField (5);
        inputAge = new JTextField (5);
        add (firstName);
        add (inputFirstName);
        add (lastName);
        add (inputLastName);
        add (age);
        add (inputAge);
        add(new Gender());
        setPreferredSize (new Dimension(300, 15));
        setBackground (Color.yellow);
    }
}


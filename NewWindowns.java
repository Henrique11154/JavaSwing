import javax.swing.*;
import java.awt.*;

public class NewWindowns {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Ola");

    NewWindowns(){
        label.setBounds(100,100,100,100);
        label.setBackground(Color.BLUE);
        frame.setSize(500,500);
        frame.add(label);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame3 extends JFrame implements ActionListener{

    JButton button = new JButton("abrir nova janela");
    public frame3(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        button.setBounds(100,160,200,50);
        button.setFocusable(false);
        button.addActionListener(this);
        add(button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
             NewWindowns newWindowns = new NewWindowns(); //cria uma nova janela
        }
    }
}

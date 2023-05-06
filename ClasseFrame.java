import javax.swing.*;
import java.awt.*;

public class ClasseFrame extends JFrame {
    ClasseFrame(){
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("Teste 1");
        frame.setSize(430,430); //muda a dimensão de x e de y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fecha a janela e encerra o programa
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("Luffy2.jpg"); //icone do programa
        frame.setIconImage(icon.getImage()); //Muda o icon
        Color c = new Color(0,0,0);
        frame.getContentPane().setBackground(c); //muda a cor, pode ser sem a variavel fiz assim porque fica mais facil
    }
}

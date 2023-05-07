import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClasseFrame extends JFrame implements ActionListener{
    JLabel label = new JLabel();
    JButton botao = new JButton();
    ClasseFrame(){
        /*JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("Teste 1");
        frame.setSize(430,430); //muda a dimensão de x e de y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fecha a janela e encerra o programa
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("Luffy2.jpg"); //icone do programa
        frame.setIconImage(icon.getImage()); //Muda o icon
        Color c = new Color(0,0,0);
        frame.getContentPane().setBackground(c); //muda a cor, pode ser sem a variavel fiz assim porque fica mais facil
         */
        /*ImageIcon icon = new ImageIcon("lufft2.png"); imagem grande demais
        Border border = BorderFactory.createLineBorder(Color.CYAN);

        JLabel label = new JLabel("ola");
        //ou label.setText("Ola");
        //label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER); //JLabel.LEFT ou rigth da imagem
        label.setVerticalTextPosition(JLabel.BOTTOM); //muda o texto para cima, centro ou baixo(BOTTOM) da imagem
        label.setForeground(Color.BLUE); // MUda a cor da fonte
        label.setFont(new Font("Arial", Font.ITALIC, 20)); //Muda a fonte
        label.setBorder(border);
        label.setBackground(new Color(0xFF12)); //cor de fundo
        label.setOpaque(true); //mostra a cor de fundo
        //label.setVerticalAlignment(10); Muda o texto e a imagem
        //label.setHorizontalAlignment(12); mesma coisa do de cima
        label.setBounds(0,0,250,250);//(posição no x, posição no y, comprimento do label, tamanho do label)*/

        /*ImageIcon icon = new ImageIcon("Icon.png");
        JPanel panel = new JPanel();
        JPanel blue = new JPanel();
        JPanel red = new JPanel();
        JLabel labelRed = new JLabel();
        labelRed.setIcon(icon);

        panel.setBackground(new Color(0xAA66));
        panel.setBounds(0,0,100,100);
        blue.setBackground(Color.BLUE);
        blue.setBounds(100,0,100,100);
        red.setBackground(Color.red);
        red.setBounds(0,100,100,100);*/

        ImageIcon icon = new ImageIcon("Icon.png");

        botao.setBounds(100,100,250,50);
        botao.setText("CLIQUE AQUI!!!!!!!!");
        //botao.addActionListener(e -> label.setText("VOCÊ CLICOU NO BOTÃO"));
        botao.setBackground(new Color(5,120,100));
        botao.setBorder(BorderFactory.createEtchedBorder());
        botao.setFocusable(false);
        botao.setIcon(icon);
        botao.setVerticalTextPosition(JButton.BOTTOM);
        botao.setVerticalAlignment(JButton.TOP);

        label.setText("OLA");
        label.setBounds(140,90, 250, 250);
        label.setVerticalTextPosition(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setResizable(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(botao);
        frame.add(label);
        //frame.pack(); muda o tamanho da  janela
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao) {
            label.setText("VOCÊ CLICOU NO BOTÃO");
            botao.setEnabled(false);
        }
    }
}

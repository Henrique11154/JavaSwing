import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame3 extends JFrame implements ActionListener {

    JTextField textField = new JTextField();
    JRadioButton pizza = new JRadioButton("pizza");
    JRadioButton hamburguer = new JRadioButton("hamburguer");
    JRadioButton cachorroQuente = new JRadioButton("cachorro-quente");
    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton("Enviar");

    ImageIcon x = new ImageIcon("luffy2.jpg");
    ImageIcon v = new ImageIcon("GTA-V-Logo-PNG-Image.png");
    /*JButton button = new JButton("abrir nova janela");
    public frame3(){
        setSize(500,500); so funciona porque ela exstende do JFrame
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
    }*/

    /*public frame3(){
        /*JOptionPane optionPane = new JOptionPane("Você perdeu!",JOptionPane.PLAIN_MESSAGE); Dá pra colocar aqui dentro soq eu não sei fazer
        JOptionPane.showMessageDialog(null, "Você perdeu", "Titulo", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Você perdeu", "Titulo", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Você perdeu", "Titulo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Você perdeu", "Titulo", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Você perdeu", "Titulo", JOptionPane.WARNING_MESSAGE);*/
        //JOptionPane.showConfirmDialog(null,"Você vai a praça", "While",JOptionPane.YES_NO_CANCEL_OPTION);
        //int resposta = JOptionPane.showConfirmDialog(null, "q","número",JOptionPane.YES_NO_CANCEL_OPTION);
        /*String nome = JOptionPane.showInputDialog("Digite seu nome");
        System.out.println("seu nome: "+nome);
        String[] textos = {"wooo!","uai","uhuuuu"}; // tipo uma lista
        JOptionPane.showOptionDialog(null,"Henrique","Quale",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,textos,0); //icon = icone // textos = as opçoes de mensagens// o resto é normal
    }*/

    /*public frame3(){
        setLayout(new FlowLayout());
        //this.pack();  tamanho da tela
        textField.setPreferredSize(new Dimension(250,40));
        button.addActionListener(this);
        setSize(new Dimension(300,200));
        this.add(textField);
        this.add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            String armazenar = String.valueOf(textField.getText()); // pega so o texto
            textField.setText(armazenar);
            textField.setEditable(false); //permite editar o texto
            textField.setCaretColor(Color.RED); //sei la
            textField.setBackground(new Color(0xAA998));
            textField.setForeground(new Color(90,130,255)); // cor da letra
            button.setEnabled(false); // não mexe mais no butão
        }
    }*/

    /*public frame3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        this.pack();

        ImageIcon x = new ImageIcon("luffy2.jpg");
        ImageIcon v = new ImageIcon("GTA-V-Logo-PNG-Image.png");

        checkBox.setText("Eu não sou um robo");
        checkBox.setFocusable(false);
        checkBox.setIcon(x);
        checkBox.setSelectedIcon(v);

        button.setText("Enviar");
        button.addActionListener(this);

        add(checkBox);
        add(button);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            //checkBox
        }
    }*/

    public frame3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        this.pack();

        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(hamburguer);
        group.add(cachorroQuente);

        pizza.addActionListener(this);
        pizza.setIcon(v);

        add(pizza);
        add(hamburguer);
        add(cachorroQuente);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizza){
            System.out.println("pizza");
        }
    }
}

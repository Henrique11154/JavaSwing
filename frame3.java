import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame3 extends JFrame /*implements ActionListener*/ {

    JTextField textField = new JTextField();
    JButton button = new JButton("Enviar");
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


}

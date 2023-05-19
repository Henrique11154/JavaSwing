import javax.swing.*;
import java.awt.*;

public class frame2 extends JFrame{
        JFrame frame = new JFrame();
        /*JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        JLabel label = new JLabel("JUJUJUJUJUJUJUUUJUJUJUJUU");

        public frame2(){
            frame.setSize(600,720);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(300,20);
            frame.setLayout(new BorderLayout(10,10));
            frame.setVisible(true);

            panel.setBackground(Color.darkGray);
            panel2.setBackground(Color.CYAN);
            panel3.setBackground(Color.RED);
            panel4.setBackground(Color.MAGENTA);
            panel5.setBackground(new Color(95,95,95));

            frame.add(panel,BorderLayout.NORTH);
            frame.add(panel2,BorderLayout.EAST);
            frame.add(panel3,BorderLayout.WEST);
            frame.add(panel4,BorderLayout.SOUTH);
            frame.add(panel5,BorderLayout.CENTER);
            panel.add(label);

            label.setFont(new Font("ARIAL",NORMAL,50));
            label.setBackground(new Color(0xFF88));

            panel.setPreferredSize(new Dimension(100,100));
            panel2.setPreferredSize(new Dimension(100,100));
            panel3.setPreferredSize(new Dimension(100,100));
            panel4.setPreferredSize(new Dimension(100,100));
            panel5.setPreferredSize(new Dimension(100,100));
            
        }*/

    /*public frame2(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300,20);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 3, 10)); //o primeiro é onde as coisas vão
                                                                                // ficar, o segundo é a distancia entre as coisas
                                                                                // e o ultimo é a distancia de cima
        // {basicamente margin dos lados e margin em cima e}
       JPanel panel = new JPanel();
       panel.setLayout(new FlowLayout(FlowLayout.CENTER,5,10));
       panel.setPreferredSize(new Dimension(250,250));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));

        frame.add(panel);
        frame.setVisible(true);
    }*/

    /*public frame2(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2, 3,15));
        panel.setPreferredSize(new Dimension(250,250));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));

        frame.add(panel);


        frame.setVisible(true);
    }*/

    public frame2(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane layeredPane = new JLayeredPane(); // colocar as coisa tipo em 3D
        layeredPane.setBounds(100,50, 250,250);
        JLabel label = new JLabel("SAlve");
        label.setOpaque(true);
        label.setBackground(Color.RED);
        label.setBounds(50,50,100,100);

        JLabel label2 = new JLabel("SAl");
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(150,150,100,100);

        JLabel label3 = new JLabel("lve");
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(100,100,100,100);

        layeredPane.add(label);
        layeredPane.add(label2);
        layeredPane.add(label3);
        frame.setLayout(null);
        frame.add(layeredPane);
        frame.setVisible(true);
    }
}

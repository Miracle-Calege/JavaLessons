package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula9_Panels extends JFrame {
    private JPanel red,blue,green;
    private JLabel label;
    private ImageIcon img;


    public Aula9_Panels(){
        setTitle("JFRAME");//coloca o titulo na tela
        setLayout(null);
        setSize(750,750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);
        label=new JLabel("Sho");
        red=new JPanel();
        blue=new JPanel();
        green=new JPanel();
        img=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
        label.setIcon(img);
        label.setBounds(100,100,75,75);
//        label.setVerticalAlignment(JLabel.TOP); usamos para borderLayout
//        label.setHorizontalAlignment(JLabel.RIGHT);
        red.setBackground(Color.red);
        red.setBounds(0,0,250,250);
        blue.setBackground(Color.blue);
        blue.setBounds(250,0,250,250);
        green.setBackground(Color.green);
        green.setBounds(0,250,500,250);
        green.setLayout( null);//determinamos um layout para o painel
        green.add(label);//adicionamos  a label no painel
        add(red);
        add(blue);
        add(green);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula9_Panels();
    }
}

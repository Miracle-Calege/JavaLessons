package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula10_LayeredPanels extends JFrame{
    private JLayeredPane layered;
    private JLabel label1,label2,label3;

    public Aula10_LayeredPanels(){
        setTitle("JFRAME");//coloca o titulo na tela
        setLayout(null);
        setSize(750,750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);
        layered=new JLayeredPane();//criamos uma layeredPane
        layered.setBounds(0,0,500,500);//determinamos as dimensoes
        label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);
        label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);
        label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);
//        layered.add(label1);// o primeiro a ser adicionado fica no topo
//        layered.add(label2);
//        layered.add(label3);
        layered.add(label1,Integer.valueOf(0));// do mais fundo
        layered.add(label2,Integer.valueOf(1));
        layered.add(label3,Integer.valueOf(2));// ate o menos fundo

        add(layered);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula10_LayeredPanels();
    }
}

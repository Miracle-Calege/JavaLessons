package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula4_BorderLayout  extends JFrame {
    private JPanel pn1,pn2,pn3,pn4,pn5,pn6,pn7,pn8,pn9,pn10;

    public Aula4_BorderLayout(){
        setTitle("BorderLayout");
        setSize(500,500);
        setLayout(new BorderLayout(10,10));//os parametros sao responsaveis por criar margens;
        pn1=new JPanel();
        pn2=new JPanel();
        pn3=new JPanel();
        pn4=new JPanel();
        pn5=new JPanel();
        pn1.setBackground(Color.red);
        pn2.setBackground(Color.green);
        pn3.setBackground(Color.yellow);
        pn4.setBackground(Color.magenta);
        pn5.setBackground(Color.blue);// da cor ao background do painel
        pn1.setPreferredSize(new Dimension(100,100));// coloca as dimensoes do painel
        pn2.setPreferredSize(new Dimension(100,100));
        pn3.setPreferredSize(new Dimension(100,100));
        pn4.setPreferredSize(new Dimension(100,100));
        pn5.setPreferredSize(new Dimension(100,100));

        //========Sub-panels======

        pn6=new JPanel();
        pn7=new JPanel();
        pn8=new JPanel();
        pn9=new JPanel();
        pn10=new JPanel();
        pn6.setBackground(Color.black);
        pn7.setBackground(Color.darkGray);
        pn8.setBackground(Color.gray);
        pn9.setBackground(Color.LIGHT_GRAY);
        pn10.setBackground(Color.white);// da cor ao background do painel
        pn6.setPreferredSize(new Dimension(50,50));// coloca as dimensoes do painel
        pn7.setPreferredSize(new Dimension(50,50));
        pn8.setPreferredSize(new Dimension(50,50));
        pn9.setPreferredSize(new Dimension(50,50));
        pn10.setPreferredSize(new Dimension(50,50));

        pn5.setLayout(new BorderLayout());
        pn5.add(pn6,BorderLayout.NORTH);
        pn5.add(pn7,BorderLayout.SOUTH);
        pn5.add(pn8,BorderLayout.WEST);
        pn5.add(pn9,BorderLayout.EAST);
        pn5.add(pn10,BorderLayout.CENTER);




        add(pn1,BorderLayout.NORTH);
        add(pn2,BorderLayout.WEST);
        add(pn3,BorderLayout.EAST);
        add(pn4,BorderLayout.SOUTH);
        add(pn5,BorderLayout.CENTER);//COLOCA O painel numa determinada regiao da frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula4_BorderLayout();
    }
}

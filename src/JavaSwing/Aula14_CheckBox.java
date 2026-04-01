package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula14_CheckBox extends JFrame  {
private JCheckBox check;
private JButton bt;

    public Aula14_CheckBox(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        check=new JCheckBox("Idiossincrasia Africana");//criamos o checkBox com a respectiva mensagem
        check.setFont(new Font("Consolar",Font.PLAIN,35));
        check.setFocusable(false);
        bt=new JButton("Submeter");
        bt.addActionListener((e)->System.out.println(check.isSelected()));

        add(bt);
        add(check);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula14_CheckBox();
    }

}

package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula15_RadioButton extends JFrame {
    private JRadioButton pizza,burguer,hot;
    private ButtonGroup group;

    public Aula15_RadioButton(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        pizza=new JRadioButton("Pizza");//criamos um radiobutton e a mensagem entre o contructor
        burguer=new JRadioButton("Hamburguer");
        hot=new JRadioButton("Hot");
        ImageIcon img=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
        group=new ButtonGroup();//e responsavel por fazer com que so um radioButton seja selecionado
        group.add(pizza);//adiciona os radionButton ao group
        group.add(burguer);
        group.add(hot);
        pizza.addActionListener((e)->System.out.println("Selecionou pizza"));
        burguer.addActionListener((e)->System.out.println("Selecionou Hamburguer"));
        hot.addActionListener((e)->System.out.println("Selecionou HotDog"));
        pizza.setIcon(img);//coloca uma imagem no radiobutton
        add(pizza);
        add(burguer);
        add(hot);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula15_RadioButton();
    }

}

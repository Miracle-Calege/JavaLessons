package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula12_GridLayout extends JFrame {

    public Aula12_GridLayout(){
        setTitle("JFRAME");//coloca o titulo na tela
        setLayout(new GridLayout(3,3,3,3));//numero de linhas,numero colunas,eespacamento horizontal,spacamento veritical
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);
        for(int i=1;i<=9;i++) {
            add(new JButton("Button" + i));
        }
        setVisible(true);

    }

    public static void main(String[] args) {
        new Aula12_GridLayout();
    }
}

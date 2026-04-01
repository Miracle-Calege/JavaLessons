package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula11_FlowLayout extends JFrame {

    public Aula11_FlowLayout(){
        setTitle("JFRAME");//coloca o titulo na tela
        //setLayout(new FlowLayout());//adiciona os elemento da esquerda->direita e so vai a linha seguinte quando ja nao ha mais espaco a direita
       // setLayout(new FlowLayout(FlowLayout.LEADING));//coloca os elementos para a esquerda
        //setLayout(new FlowLayout(FlowLayout.TRAILING));//coloca os elementos para a direita
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//coloca os elementos para a o centro, mas poder defeito eles sempre estarao no centro
        // entao nao e necessario colocar o parametro, espacamento horiznotal, vertical
        setSize(750,750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);
        for(int i=1;i<=9;i++) {
            add(new JButton("Button" + i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula11_FlowLayout();
    }
}

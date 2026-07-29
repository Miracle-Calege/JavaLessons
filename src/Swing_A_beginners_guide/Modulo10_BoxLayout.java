package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;

/*
BoxLayout->é útil para casos em que queremos agrupar um conjunto de componente na vertical ou horizontal.
Geralmente aplica-se esse layout a um JPanel e depois adiciona-se o panel ao container principal

Existem 2 formas de criar uma box:
1.Usando o constructor:
Box(int orientation)
onde orientation pode ser:
X_AXIS
Y_AXIS
LINE_AXIS
PAGE_AXIS
2.Usando metodos:
createHorizontalBox()-> cria uma box horizontal onde os componentes sao adicionados de esquerda para direita
createVerticalBox()->cria uma box vertical onde os componentes sao adicionados de cima para baixo


NB:Para adicionar espaco entre os componentes inserimos um objecto RigidArea:
createRigidArea(Dimension dim)-> o tamanho deste objecto é fixo, ou seja, nao será reajustado se o tamanho da box mudar

 */
public class Modulo10_BoxLayout {

    Modulo10_BoxLayout(){
        JFrame jf=new JFrame("BoxLayout Demo");
        jf.setLayout(new FlowLayout());
        jf.setSize(300,240);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labOne=new JLabel("Button Group one");
        JLabel labTwo=new JLabel("Button Group Two");
        JLabel labThree=new JLabel("Check Box Group");
        JButton one=new JButton("One");
        JButton two=new JButton("Two");
        JButton three=new JButton("Three");
        JButton four=new JButton("Four");
        Dimension btDim=new Dimension(100,25);
        one.setMinimumSize(btDim);
        one.setMaximumSize(btDim);
        two.setMinimumSize(btDim);
        two.setMaximumSize(btDim);
        three.setMinimumSize(btDim);
        three.setMaximumSize(btDim);
        four.setMinimumSize(btDim);
        four.setMaximumSize(btDim);
        JCheckBox boxOne=new JCheckBox("Option one");
        JCheckBox boxTwo=new JCheckBox("Option two");
        //criamos boxes verticais
        Box box1=Box.createVerticalBox();
        Box box2=Box.createVerticalBox();
        Box box3=Box.createVerticalBox();
        //criamos bordas invisiveis
        box1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        box2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        box3.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        //adicionando os componente a box
        box1.add(labOne);
        box1.add(Box.createRigidArea(new Dimension(0,4)));//adicionando um Rigid area
        box1.add(one);
        box1.add(Box.createRigidArea(new Dimension(0,4)));
        box1.add(two);

        box2.add(labTwo);
        box2.add(Box.createRigidArea(new Dimension(0,4)));//adicionando um Rigid area
        box2.add(three);
        box2.add(Box.createRigidArea(new Dimension(0,4)));
        box2.add(four);

        box3.add(labThree);
        box3.add(boxOne);
        box3.add(boxTwo);
        jf.add(box1);
        jf.add(box2);
        jf.add(box3);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              new Modulo10_BoxLayout();
            }
        });
    }
}

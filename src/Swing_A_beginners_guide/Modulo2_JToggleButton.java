package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
O JToggleButton usa o itemListener como gestor de eventos.
Alguns constructores:
JToggleButton();
JToggleButton(String msg);
JToggleButton(Icon icon);
JToggleButton(String msg, boolean estado). Se o estado for true o botao estara inicialmente pressionado
JToggleButton(Icon icon, boolean estado)
JToggleButton(String msg,Icon icon,boolean estado)

JButton vs JToggleButton
JToggleButton quando pressionado fica no estado pressionado("contraido") e devemos pressionar de novo para voltar ao estado inicial
 */
public class Modulo2_JToggleButton {
    JLabel label;
    JToggleButton bt;

    Modulo2_JToggleButton(){
        JFrame jf=new JFrame("Toggle button");
        jf.setLayout(new FlowLayout());
        jf.setSize(290,80);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label=new JLabel("Botao esta desligado");
        bt=new JToggleButton("ligado/desligado");
        bt.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(bt.isSelected()) label.setText("Botao esta ligado");
                else
                    label.setText("Botao esta desligado");
            }
        });
        jf.add(bt);
        jf.add(label);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JToggleButton();
            }
        });
    }
}

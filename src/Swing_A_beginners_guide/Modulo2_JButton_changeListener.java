package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
/*
ButtonModel mod=bt.getModel();->getModel()-> retorna o estado do botao

Abaixo usamos um inner changeListener

 */

public class Modulo2_JButton_changeListener {
    JButton bt;
    JLabel lab;

    Modulo2_JButton_changeListener(){
        JFrame jf=new JFrame("Mudanca de eventos de botao");
        jf.setLayout(new FlowLayout());
        jf.setSize(250,160);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        bt=new JButton("Pressione para um teste de mudanca de evento");
        bt.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel mod=bt.getModel();
                String what="";
                if(mod.isEnabled()) what+="Enabled<br>";
                if(mod.isRollover()) what+="Rollover<br>";
                if(mod.isArmed()) what+="Armed<br>";
                if(mod.isPressed()) what+="Pressed<br>";
                lab.setText("<html>Estado actual:<br>" +what);
            }

        });

        jf.add(bt);
        jf.add(lab);
        jf.setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JButton_changeListener();
            }
        });
    }
}

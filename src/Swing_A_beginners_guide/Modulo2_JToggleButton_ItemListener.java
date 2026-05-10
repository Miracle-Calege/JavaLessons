package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/*
Uma boa parte dos metodos usados no JButton tambem podem ser usados no JToggleButton.

 */

public class Modulo2_JToggleButton_ItemListener implements ItemListener {
    JLabel alpha, beta;
    JToggleButton btAlpha, btBeta;

    Modulo2_JToggleButton_ItemListener(){
        JFrame jf=new JFrame("2 ToggleButtons");
        jf.setLayout(new FlowLayout());
        jf.setSize(290,80);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        alpha=new JLabel("Alpha esta desligado");
        beta=new JLabel("Beta esta desligado");
        btAlpha=new JToggleButton("Alpha");
        btBeta=new JToggleButton("Beta");
        btAlpha.addItemListener(this);
        btBeta.addItemListener(this);
        jf.add(btAlpha);
        jf.add(alpha);
        jf.add(btBeta);
        jf.add(beta);
        jf.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JToggleButton tb= (JToggleButton) e.getItem();//faz um casting para que o elemento que gera o evento seja convertido em JToggleItem.getItem()-> retorna o item/referencia do item
        if(tb==btAlpha)
            if(tb.isSelected())
                alpha.setText("Alpha esta ligado");
        else
            alpha.setText("Alpha esta desligado");
        else if (tb==btBeta)
            if(tb.isSelected())
                beta.setText("Beta esta ligado");
            else beta.setText("Beta esta desligado");

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JToggleButton_ItemListener();
            }
        });
    }
}

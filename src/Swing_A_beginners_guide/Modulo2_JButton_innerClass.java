package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
para usar ActionListener como inner class:

botao.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e) {
 instrucoes
 }
});
NB: A classe nao implementara a interface ActionListener

 */

public class Modulo2_JButton_innerClass{
    JLabel lab;
    JButton primeiro,segundo;

    Modulo2_JButton_innerClass(){
        ImageIcon icon1=new ImageIcon("/home/miracle-calege/Downloads/fly.png");
        ImageIcon icon2=new ImageIcon("/home/miracle-calege/Downloads/cab.png");
        ImageIcon icon3=new ImageIcon("/home/miracle-calege/Downloads/profile.png");
        ImageIcon icon4=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
        JFrame jf=new JFrame("Botao");
        jf.setLayout(new FlowLayout());
        jf.setSize(220,220);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel("Pressione um botao");
        primeiro=new JButton("Primeiro",icon1);
        segundo=new JButton("Segundo",icon1);
        primeiro.setRolloverIcon(icon3);
        segundo.setRolloverIcon(icon3);
        primeiro.setPressedIcon(icon4);
        segundo.setPressedIcon(icon4);
        primeiro.setDisabledIcon(icon2);
        segundo.setDisabledIcon(icon2);
        primeiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(segundo.isEnabled()){
                    lab.setText("segundo botao esta desabilitado");
                    segundo.setEnabled(false);
                }else{
                    lab.setText("segundo botao habilitado");
                    segundo.setEnabled(true);
                }
            }
        });

        segundo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("segundo botao pressionado");
            }
        });
        primeiro.setMnemonic('p');
        jf.add(primeiro);
        jf.add(segundo);
        jf.add(lab);
        jf.getRootPane().setDefaultButton(primeiro);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JButton_images();
            }
        });
    }
}

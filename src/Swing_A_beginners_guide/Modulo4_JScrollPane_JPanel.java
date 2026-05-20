package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;

public class Modulo4_JScrollPane_JPanel {
    JCheckBox op1,op2,op3,op4,op5;
    Modulo4_JScrollPane_JPanel(){
        JFrame jf=new JFrame("ScrollPanel");
        jf.setSize(280,130);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel options = new JLabel("Selecione uma ou mais opcoes");
        op1 = new JCheckBox("opcao um");
        op2 = new JCheckBox("opcao dois");
        op3 = new JCheckBox("opcao tres");
        op4 = new JCheckBox("opcao quatro");
        op5 = new JCheckBox("opcao cinco");
        JPanel pn1 = new JPanel();
        pn1.setLayout(new GridLayout(6,1));
        pn1.setOpaque(true);
        pn1.add(options);
        pn1.add(op1);
        pn1.add(op2);
        pn1.add(op3);
        pn1.add(op4);
        pn1.add(op5);
        JScrollPane scr=new JScrollPane(pn1);
        jf.add(scr);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo4_JScrollPane_JPanel();
            }
        });
    }
}

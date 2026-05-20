package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;

public class Modulo4_JTabbedPane_JPanel {
    JCheckBox dvd,scanner,net,word,comp,data;
    JRadioButton tower,note,hand;

    Modulo4_JTabbedPane_JPanel(){
        JFrame jf=new JFrame("JTabbedPane + JPanel");
        jf.setSize(280,140);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tower=new JRadioButton("Tower");
        note=new JRadioButton("Notebook");
        hand=new JRadioButton("Handheld");
        ButtonGroup bg=new ButtonGroup();
        bg.add(tower);
        bg.add(note);
        bg.add(hand);
        JPanel pn1=new JPanel();
        pn1.setLayout(new GridLayout(3,1));
        pn1.setOpaque(true);
        pn1.add(tower);
        pn1.add(note);
        pn1.add(hand);
        dvd=new JCheckBox("DVD");
        scanner=new JCheckBox("Scanner");
        net=new JCheckBox("Network");
        JPanel pn2=new JPanel();
        pn2.setLayout(new GridLayout(3,1));
        pn2.setOpaque(true);
        pn2.add(dvd);
        pn2.add(scanner);
        pn2.add(net);
        word=new JCheckBox("word");
        comp=new JCheckBox("Program");
        data=new JCheckBox("Database");
        JPanel pn3=new JPanel();
        pn3.setLayout(new GridLayout(3,1));
        pn3.setOpaque(true);
        pn3.add(word);
        pn3.add(comp);
        pn3.add(data);
        JTabbedPane tb=new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
        tb.addTab("Style",pn1);
        tb.addTab("Options",pn2);
        tb.addTab("Software",pn3);
        jf.add(tb);
        jf.setVisible(true);
     }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo4_JTabbedPane_JPanel();
            }
        });
    }
}

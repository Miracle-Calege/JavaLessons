package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo1_JTextField2 implements ActionListener {
    JTextField jt1;
    JTextField jt2;
    JLabel jl;

    Modulo1_JTextField2() {
        JFrame j = new JFrame("2 JTextFields");
        j.setLayout(new FlowLayout());
        j.setSize(240, 120);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jt1 = new JTextField(10);
        jt2 = new JTextField(10);
        jt1.setActionCommand("primeiro");//-> setActionCommand() da um nome/referencia ao compontente
        jt2.setActionCommand("segundo");
        jt1.addActionListener(this);
        jt2.addActionListener(this);
        j.add(jt1);
        j.add(jt2);
        jl = new JLabel("");
        j.add(jl);
        j.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("primeiro")) {//-> se o comando enter for pressionado no action "primeiro"
            jl.setText("Pressionou enter no JTextField1: " + jt1.getText());
        } else {
            jl.setText("Pressionou enter no JTextField2: " + jt2.getText());
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
        new Modulo1_JTextField2();
            }
        });
    }
}
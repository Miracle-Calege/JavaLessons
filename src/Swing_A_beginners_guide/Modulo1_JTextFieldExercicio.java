package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo1_JTextFieldExercicio implements ActionListener {
    JTextField plainText,cipherText;

    Modulo1_JTextFieldExercicio(){
        JFrame j=new JFrame("Exercicio");
        j.setLayout(new FlowLayout());
        j.setSize(340,120);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlPlainText=new JLabel("Plain Text:");
        JLabel jlCipherText=new JLabel("Cipher Text:");
        plainText=new JTextField(10);
        cipherText=new JTextField(10);
        plainText.setActionCommand("Encode");
        cipherText.setActionCommand("Decode");
        plainText.addActionListener(this);
        cipherText.addActionListener(this);
        j.add(jlPlainText);
        j.add(plainText);
        j.add(jlCipherText);
        j.add(cipherText);
        JButton encode=new JButton("Encode");
        JButton decode=new JButton("Decode");
        JButton reset=new JButton("Reset");
        encode.addActionListener(this);
        decode.addActionListener(this);
        reset.addActionListener(this);
        j.add(encode);
        j.add(decode);
        j.add(reset);
        j.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Encode")){
            StringBuilder str=new StringBuilder(plainText.getText());
            for(int i=0;i<str.length();i++)//-> for ou if sem {} é usado quando so temos uma instrucao nesse laco ou condicao, por isso a primeira instrucao e que sera percorrida pelo for e a segunda instrucao: cipherText.setText(str.toString()); vai ser executada uma unica vez
                str.setCharAt(i,(char)(str.charAt(i)+1));
            cipherText.setText(str.toString());
        }else if(e.getActionCommand().equals("Decode")){
            StringBuilder str=new StringBuilder(plainText.getText());
            for(int i=0;i<str.length();i++)
                str.setCharAt(i,(char)(str.charAt(i)-1));
            plainText.setText(str.toString()) ;
        }else{
            plainText.setText("");
            cipherText.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo1_JTextFieldExercicio();
            }
        });
    }
}
//NB:E possivel implementar classes listener diferentes ou tambem usando anonymous inner classes pag 43

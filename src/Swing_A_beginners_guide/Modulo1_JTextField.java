package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo1_JTextField implements ActionListener {
    JTextField jt;
    JLabel jl;

    Modulo1_JTextField(){
        JFrame j=new JFrame("TextField");
        j.setLayout(new FlowLayout());
        j.setSize(240,90);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt=new JTextField(10);//-> determina o tamanho em numero de colunas que o JTextField tera
        jt.addActionListener(this);
        j.add(jt);
        jl=new JLabel("");
        j.add(jl);
        j.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jl.setText("Conteudo actual: "+jt.getText());//->getText() retorna o texto no JTextField
        //quando o usuario clicar Enter o conteudo do JTextField tambem serao exibido no JLabel
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo1_JTextField();
            }
        });
    }
}

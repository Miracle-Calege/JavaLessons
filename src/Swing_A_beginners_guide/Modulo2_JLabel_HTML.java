package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;

/*
setText(String text)-> coloca um texto na label
getText()->retorna o texto da label

Podemos usar HTML como texto da label

devemos inciar o texto com <html> depois formatamos ao nosso gosto

NB:Se um componente exibe texto o HTML tambem pode ser usado nele
 */
public class Modulo2_JLabel_HTML {

    Modulo2_JLabel_HTML(){
        JFrame jf=new JFrame("HTML");
        jf.setLayout(new FlowLayout());
        jf.setSize(260,140);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("<html>Top<br>Bottom");
        jf.add(label);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JLabel_HTML();
            }
        });
    }
}

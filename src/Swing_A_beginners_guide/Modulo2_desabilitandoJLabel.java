package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
/*
setEnable(boolean state)-> habilita (true) ou desabilita(false) a label.
setDisableIcon(Icon icon)->  desabilita o icon
 */

public class Modulo2_desabilitandoJLabel {


    Modulo2_desabilitandoJLabel() {

        JFrame jf = new JFrame("Habilitar e desabilitar");
        jf.setLayout(new GridLayout(3,1));
        jf.setSize(240,250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon=new ImageIcon("/home/miracle-calege/Downloads/cab.png");
        ImageIcon icone=new ImageIcon("/home/miracle-calege/Downloads/fly.png");
        JLabel label1=new JLabel("Habilitado",icon,SwingConstants.CENTER);
        JLabel label2=new JLabel("desabilitado",icon,SwingConstants.CENTER);
        label2.setEnabled(false);
        JLabel label3=new JLabel("Usar o foguete",icon,SwingConstants.CENTER);
        label3.setDisabledIcon(icone);//sobrepoem o icon que so serao visivel quando: setEnable(false)
        label3.setEnabled(false);
        jf.add(label1);
        jf.add(label2);
        jf.add(label3);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new  Modulo2_desabilitandoJLabel();
            }
        });
    }
}

package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;

/*
Tooltip-> e uma mensagem/informacao que e exibida quando o mouse fica sobre um componente.o metodo usado para fazer isso e :
setToolTipText(Strint txt).Este metodo e suportado por todos componentes lightweight
 */
public class Modulo4_tooltips {
    Modulo4_tooltips(){
        JFrame jf=new JFrame("ToolTips");
        jf.setLayout(new FlowLayout());
        jf.setSize(300,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton alpha=new JButton("Alpha");
        JButton beta=new JButton("Beta");
        alpha.setToolTipText("Tooltip alpha");//tooltip activo
        beta.setToolTipText("Tooltip beta");
        jf.add(alpha);
        jf.add(beta);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo4_tooltips();
            }
        });
    }
}

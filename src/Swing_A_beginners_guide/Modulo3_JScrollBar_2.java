package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/*
Incremento de bloco e igual ao extent.
NB:Quanto colocamos o extent=0 o block increment sera igual a 0.
para determinar o tamanho do JScrollBar usamos:
setPreferredSize(new Dimension());
 */
public class Modulo3_JScrollBar_2 {
    JLabel labVert,labHor,labVertInfo,labHorInfo;
    JScrollBar barVert,barHor;

    Modulo3_JScrollBar_2(){
        JFrame jf=new JFrame("ScrollBar PartII");
        jf.setLayout(new FlowLayout());
        jf.setSize(260,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labVert=new JLabel("Valor inicial Scroll bar vertical: 0");
        labHor=new JLabel("Valor inicial Scroll bar horizontal: 0");
        barVert=new JScrollBar(JScrollBar.VERTICAL,0,5,0,500);//direccao,valor inicial,extent, minimo e maximo
        barHor=new JScrollBar(Adjustable.HORIZONTAL,250,0,0,500);
        barVert.setPreferredSize(new Dimension(30,200));
        barHor.setPreferredSize(new Dimension(200,10));
        barHor.setBlockIncrement(25);
        barVert.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if(barVert.getValueIsAdjusting()) return;
                labVert.setText("O valor do scroll vertical : "+e.getValue());
            }
        });
        barHor.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                labHor.setText("O valor do scroll horizontal: "+e.getValue());
            }
        });
        labVertInfo=new JLabel("<html>Scroll bar vertical: <br>"+
                "Minimo valor: "+barVert.getMinimum()+"<br>"
                +"Maximo valor: "+barVert.getMaximum()+"<br>"
                +"Porcao visivel: "+barVert.getVisibleAmount()+"<br>"
                +"Incremento de bloco: "+barVert.getBlockIncrement()+"<br>"+"incremento de unidade: "+barVert.getUnitIncrement());
        labHorInfo=new JLabel("<html>Scroll bar vertical: <br>"+
                "Minimo valor: "+barHor.getMinimum()+"<br>"
                +"Maximo valor: "+barHor.getMaximum()+"<br>"
                +"Porcao visivel: "+barHor.getVisibleAmount()+"<br>"
                +"Incremento de bloco: "+barHor.getBlockIncrement()+"<br>"+"incremento de unidade: "+barHor.getUnitIncrement());

        jf.add(barVert);
        jf.add(barHor);
        jf.add(labVert);
        jf.add(labHor);
        jf.add(labVertInfo);
        jf.add(labHorInfo);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo3_JScrollBar_2();
            }
        });
    }
}


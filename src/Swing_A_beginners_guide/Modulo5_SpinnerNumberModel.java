package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/*
Constructores:
SpinnerNumberModel()->cria um model indefinidos de valor inicial zero e incremento 1
SpinnerNumberModel(int valor,int min,int max,int incr)->cria um model de valor inicial,valor minimo, valor maximo e incremento
SpinnerNumberModel(double valor,double min,double max,double incr)->faz o mesmo que o model acima para valores decimais
SpinnerNumberModel(Number valor, Comparable min,Comparable max,Number incr)->faz o mesmo que model acima mas usando comparable para min e max
 Metodos:
 getMaximum()->retorna o maximo valor
 setMaximum(Comparable max)-> determina o valor maximo
 getMinimum()->retorna o minimo valor
 setMinimum(Comparable min)-> determina o valor minimo
 getStepSize()->retorna o incremento
 setStepSize(Number step)-> determina o incremento

 */
public class Modulo5_SpinnerNumberModel {
    JSpinner spin;
    JLabel lab;

    Modulo5_SpinnerNumberModel(){

        JFrame jf=new JFrame("Spin");
        jf.setLayout(new FlowLayout());
        jf.setSize(900,800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpinnerNumberModel sp=new SpinnerNumberModel(1,1,10,1);//criamos um SpinnerNumberModel com valor actual,min,max e incremento
        spin=new JSpinner(sp);
        spin.setPreferredSize(new Dimension(40,20));
        lab=new JLabel("O tamanho da borda: 1");
        lab.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        spin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Integer size=(Integer) spin.getValue();
                lab.setText("O tamanho da borda: "+size);
                lab.setBorder(BorderFactory.createLineBorder(Color.BLACK,size.intValue()));
            }
        });
        jf.add(spin);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo5_SpinnerNumberModel();
            }
        });
    }
}

package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Constructores:
SpinnerDateModel()-> cria um model que usa a data actual como valor inicial
SpinnerDateModel(Date val,Comparable inicio,Comparable fim, int calendarField)->cria um model com data inicial,limitada por inicio e fim, propriedade do calendar(pag 249)

Metodos:
getCalendarField()-> retorna a propriedade do calendarField
getEnd()->retorna a ultima data
getStart()-> retorna a data inicial
setCalendarField(int calField)
setEnd(Comparable fim)
setStart(Comparable inico)
getDate()-> retorna  a data
 */
public class Modulo5_SpinnerDateModel {
    JSpinner spin;
    JLabel lab;
    Modulo5_SpinnerDateModel(){
        JFrame jf=new JFrame("Spin");
        jf.setLayout(new FlowLayout());
        jf.setSize(300,120);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GregorianCalendar g=new GregorianCalendar();
        Date date=new Date();
        g.add(Calendar.MONTH,-1);
        Date inicio=g.getTime();
        g.add(Calendar.MONTH,2);
        Date fim=g.getTime();
        SpinnerDateModel sp=new SpinnerDateModel(date,inicio,fim,Calendar.HOUR);//criamos um SpinnerDateModel
        spin=new JSpinner(sp);//criamos um spinner
        lab=new JLabel("Data selecionada: "+date);
        spin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Date date=(Date) spin.getValue();
                lab.setText("Data selecionada:"+date +" ");

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
                new Modulo5_SpinnerDateModel();
            }
        });
    }
}

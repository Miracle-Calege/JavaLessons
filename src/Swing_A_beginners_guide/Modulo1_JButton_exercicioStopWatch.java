package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Modulo1_JButton_exercicioStopWatch implements ActionListener {
    JLabel jl;
    long start;

    Modulo1_JButton_exercicioStopWatch(){
        JFrame j=new JFrame("Cronometro");
        j.getContentPane().setLayout(new FlowLayout());
        j.setSize(230,90);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton start=new JButton("Start");
        JButton stop=new JButton("Stop");
        start.addActionListener(this);
        stop.addActionListener(this);
        j.add(start);
        j.add(stop);
        jl=new JLabel("Pressione Start para iniciar a contagem");
        j.add(jl);
        j.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar cal=Calendar.getInstance();//-> retornar o tempo actual do sistema

        if(e.getActionCommand().equals("Start")){
            start=cal.getTimeInMillis();
            jl.setText("Tempo esta contando");
        }else{
            jl.setText("O tempo e "+ (double) (cal.getTimeInMillis()-start)/1000);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo1_JButton_exercicioStopWatch();
            }
        });
    }
}

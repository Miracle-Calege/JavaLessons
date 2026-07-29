package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/*
Timer pode ser uma alternativa para multithreading.Pois com o time podemos determinar que instruçao executar depois de determinado período.
Timer faz parte do pacote javax.swing.

******************Constructor*********************
Timer(int period, ActionListener al)->onde period é o duraçao do tempo entre os eventos(intervalos de tempo) e al é o evento
***************************Metodos**************************************************
addActionListener(ActionListener al2)-> nos permite adicionar mais lsitener que serao notificados quando o tempo acabar
start()-> inicia o timer
stop()->para o timer

 NB:Por padrao o timer continua a acionar o evento no intervalo especificado de tempo, para acionar o evento uma única vez:

 setRepeats(booolean repeats)->o tempo se repetirá(true) ou o tempo para depois de um intervalo(false)

 */
public class Modulo10_Timer {
    JLabel lab;
    JButton btStart, btStop;
    long start;
    Timer swTimer;//criamos uma variavel do tipo Timer

    Modulo10_Timer(){
        JFrame jf=new JFrame("Thread-based Stopwatch");
        jf.setLayout(new FlowLayout());
        jf.setSize(230,90);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel("Press Start to begin timing");
        btStart=new JButton("Start");
        btStop=new JButton("Stop");
        btStop.setEnabled(false);
        //criamos um ActionListener
        ActionListener timerAl=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        };
        swTimer=new Timer(100,timerAl);//criamos um timer que tem como argumentos o tempo de intervalo e o evento

        btStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start= Calendar.getInstance().getTimeInMillis();
                btStop.setEnabled(true);
                btStart.setEnabled(false);
                swTimer.start();//iniciamos o timer
            }
        });

        btStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long stop=Calendar.getInstance().getTimeInMillis();
                lab.setText("Elapsed time is "+(double) (stop-start)/1000);
                btStart.setEnabled(true);
                btStop.setEnabled(false);
                swTimer.stop();//paramos o timer
            }
        });
        jf.add(btStart);
        jf.add(btStop);
        jf.add(lab);
        jf.setVisible(true);

    }
    void updateTime(){
        long temp=Calendar.getInstance().getTimeInMillis();
        lab.setText("Elapsed time is "+(double) (temp -start)/1000);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo10_Timer();
            }
        });
    }
}

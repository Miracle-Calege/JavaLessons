package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/*
Multithreading->permite que diferentes partes do programa executem paralelamente, permitindo escrever programas eficientes que possam fazer o maximo proveito possivel da cpu.
Também evite que o programa pare devido a algumas partes que levam muito tempo.
NB:Instruçoes que levam muito tempo devem ser executadas na sua propria thread.

Sempre que um componente for actualizado, alterado,etc  deve ser executado no event-dispatching thread(invokeLater() ou invokeAndWait())
 invokeLater(Runnable obj)-> retorna imediatamente
 invokeAndWait(Runnable obj)->espera o obj.run() retornar
Obj é um objecto runnavble que tem o metodo run() onde colocaremos o codigo que interage com o componente swing.Se precisarmos de actualizar o componente colocamos o codigo dentro do do objecto runnable e passamos o objecto para invokeLater() ou invokeAndWait().

 NB:Para saber qual thread esta a ser executada: SwingUtilities.isEventDispatchThread()
 */
public class Modulo10_Multithreading {
    JLabel lab;
    JButton btStart, btStop;
    long start;
    boolean running=false;
    Thread thrd;//criamos uma variavel do tipo Thread

    Modulo10_Multithreading(){
        JFrame jf=new JFrame("Thread-based Stopwatch");
        jf.setLayout(new FlowLayout());
        jf.setSize(230,90);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel("Press Start to begin timing");
        btStart=new JButton("Start");
        btStop=new JButton("Stop");
        btStop.setEnabled(false);
        //Criamos uma instancia do runnavle que será a segunda thread
        Runnable myThread=new Runnable() {
            @Override
            public void run() {
                try{
                    for(; ;){
                        Thread.sleep(100);//pausa a thread for  100 milissegundos
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            updateTime();
                        }
                    });
                    }
                }catch (InterruptedException exc){
                    System.out.println("Call to sleep was interrupted.");
                    System.exit(1);
                }
            }
        };
        thrd=new Thread(myThread);//cria a thread
        thrd.start();//inicia a thread
        btStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start= Calendar.getInstance().getTimeInMillis();
                btStop.setEnabled(true);
                btStart.setEnabled(false);
                running=true;
            }
        });
        btStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long stop=Calendar.getInstance().getTimeInMillis();
                lab.setText("Elapsed time is "+(double) (stop-start)/1000);
                btStart.setEnabled(true);
                btStop.setEnabled(false);
                running=false;
            }
        });
        jf.add(btStart);
        jf.add(btStop);
        jf.add(lab);
        jf.setVisible(true);
    }
    void updateTime(){
        if(!running) return;
        long temp=Calendar.getInstance().getTimeInMillis();
        lab.setText("Elapsed time is "+(double) (temp -start)/1000);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo10_Multithreading();
            }
        });
    }
}

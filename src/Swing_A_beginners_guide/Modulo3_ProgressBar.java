package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Progress bar-> e usada para mostrar o estagio ou progresso de uma certa tarefa
Constructores:
JProgressBar()->por defeito cria uma barra de progresso na horizontal cujo o valor compreende de 0-100(como os de mais componentes vistos neste modulo).
JProgressBar(int min,int max)->cria uma barra de progresso com os respectivos valores minimos e maximos.
JProgressBar(int posicao).cria uma barra de progresso numa determinada posicao(JProgressBar.HORIZONTAL ou JProgressBar.VERTICAL).
JProgressBar(int posicao,int min,int maximo)->cria uma barra de progresso numa determinada posicao,com os respectivos valor min e max.
 Alguns dos metodos usados neste modulo tambem sao validos para a barra de progresso:
 getMinimum();
 getMaximum();
 getValue();
 NB:A barra de progresso nao tem extent.Por defeito o valor min =0 e max=100 e o actual=0

 setStringPainted(boolean valor)->exibe uma string que exibe o estado da tarefa
isStringPainted()->e o get do metodo acima
setIndeterminate(boolean valor)-> cria uma animacao que vai de uma extremidade para a outra
 isIndeterminate()-> e o get do metodo acima
setBorderPainted(boolean valor)->determina se a borda estara visivel ou nao.
isBorderPainted()-> e o get do metodo acima
setString(String normal)->coloca esta string na barra de progresso
getString()-> retorna o string acima
setPreferredSize()-> determina as dimensoes da barra de progresso
 */
public class Modulo3_ProgressBar {
    JLabel labVer,labHor;
    JProgressBar progHor,progVer;
    JButton bt;

    Modulo3_ProgressBar(){
        JFrame jf=new JFrame("Barra de progresso");
        jf.setLayout(new FlowLayout());
        jf.setSize(280,270);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        progVer=new JProgressBar(JProgressBar.VERTICAL);
        progHor=new JProgressBar();
        progHor.setIndeterminate(true);
        progVer.setIndeterminate(true);
        progHor.setStringPainted(true);
        progVer.setStringPainted(true);
        bt=new JButton("Empurre-me");
        labHor=new JLabel("Valor da barra de progresso na horizontal: "+progHor.getValue());
        labVer=new JLabel("Valor da barra de progresso na vertical: "+progVer.getValue());
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hVal=progHor.getValue();
                int vVal=progVer.getValue();
                if(hVal>=progHor.getMaximum())
                    return;
                else
                    progHor.setValue(hVal+10);
                if(vVal>=progHor.getMaximum())
                    return;
                else
                    progVer.setValue(vVal+10);
                labHor.setText("o valor da barra progresso horizontal: "+progHor.getValue());
                labVer.setText("o valor da barra progresso vertical: "+progVer.getValue());
            }
        });
        jf.add(progHor);
        jf.add(progVer);
        jf.add(labHor);
        jf.add(labVer);
        jf.add(bt);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo3_ProgressBar();
            }
        });
    }

}

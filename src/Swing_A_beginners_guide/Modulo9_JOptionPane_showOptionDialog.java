package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
showOptionDialog()-> é usado para casos em que os diálogos anteriores nao vao de acordo com as nossas vontades.Aqui passamos como argumento todos os argumentos dos diálogos anteriores

showOptionDialog(Component parent,Object msg,String title,int opT,int msgT,Icon image,Object[]options,Object initVal)->
 NB:Para usar o icon padrao colocamos o null,options é um array que geralmente será os botoes do diaĺogo, quando pressionarmos um botao sera retornado o indice do mesmo,
 opt padrao(YES_NO_OPTION, YES_NO_CANCEL_OPTION) só sao usado quando passamos null caso contrario sao ignorados neste casos usamod DEFAULT_OPTION
 */
public class Modulo9_JOptionPane_showOptionDialog {
    JLabel lab;
    JButton show;
    JFrame jf;

    Modulo9_JOptionPane_showOptionDialog(){
        jf = new JFrame("Message Dialog");
        jf.setLayout(new FlowLayout());
        jf.setSize(400, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab = new JLabel();
        show = new JButton("Show dialog");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //criams um array com strings  que serao os botoes do diálogo
                String[]opts={"Modem","Wireless","Satelite","Cable"};
                int response=JOptionPane.showOptionDialog(jf,"Choose one","Connection Type",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opts,"Wireless");
                switch (response){
                    case 0-> lab.setText("Modem");
                    case 1-> lab.setText("Wireless");
                    case 2-> lab.setText("Satelite");
                    case 3-> lab.setText("Cable");
                    case JOptionPane.CLOSED_OPTION -> lab.setText("Dialog cancelled");
                }
            }
        });
        jf.add(show);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo9_JOptionPane_showOptionDialog();
            }
        });
    }
}

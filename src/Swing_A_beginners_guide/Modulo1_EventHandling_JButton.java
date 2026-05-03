package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
Nas paginas 15,16,17 temos alguns tipos de eventos e seus casos de uso e tambem temos adapter classes
pag 18 que servem para customizar eventos ao nossa preferencia, para caosos onde algumas classes de eventos obrigam-nos a implementar todos os metodos enquanto por vezes so queremos implementar um.
Adapter class esta disponivel para listener com 2 ou mais metodos\
event handler nao deve ter operacoes longas porque isso pode comprometer todo o programa deixando o lento, se a operacoes for longa e melhor que se faca numa outra thread
do mesmo jeito que existe um addTipoListener() tambem existe removeTipoListener()

 */
public class Modulo1_EventHandling_JButton implements ActionListener {// implementamos o ActionListener para que o botao quando for pressionado gere alguma accao
   JLabel jl;

   Modulo1_EventHandling_JButton(){
    JFrame j=new JFrame("Botao");
     j.getContentPane().setLayout(new FlowLayout());//->determina qual sera o layout a ser usado no container
     j.setSize(220,90);
     j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JButton primeiro=new JButton("Primeiro");//->Cria um botao
       JButton segundo=new JButton("Segundo");

       primeiro.addActionListener(this);//-> coloca o actionListener no botao
       segundo.addActionListener(this);

       j.getContentPane().add(primeiro);
       j.getContentPane().add(segundo);

       jl=new JLabel("Pressione o botao");
       j.getContentPane().add(jl);
       j.setVisible(true);

   }

    @Override
    public void actionPerformed(ActionEvent e) {//-> metodo que controlar as accoes apos o botao ser pressionado, ActionEvent e represent o evento do botao

       if(e.getActionCommand().equals("Primeiro")){//-> getActionCommand()-> retorna uma string, o nome do botao. determina qual botao foi pressionad  o
           jl.setText("Primeiro botao pressionado");
       }else{
           jl.setText("Segundo botao pressionado");
       }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo1_EventHandling_JButton();
            }
        });
    }
}

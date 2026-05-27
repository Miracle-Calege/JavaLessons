package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/*
Tipos de JSpinner(Models):
SpinnerDateModel-> gere lista de datas
SpinnerListModel->gere uma lista de itens definidos por um array ou coleccao
SpinnerNumberModel->gere uma lista de numeros

NB:O gestor de eventos do JSpinner e o changeListener.
Metodos:

addChangeListener(ChangeListener le)-> adiciona o listener
getNextValue()->retorna o proximo valor ou null se o valor actual for o ultimo
getPreviousValue()-> retorna o valor anterior ou retorna null se o valor actual for o primeiro
getValue()->retorna o valor actual
removeChangeListener(ChangeListener le) -> remove o listener
setValue(Object val)->determina o valor actual

Constructores:
JSpinner()->cria um spinner que "spina" por uma infinita lista de integers
JSpinner(SpinnerModel spm)-> cria um spinner que "spina" baseado no model dado

SpinnerListModel-> e usada para "spina" uma lista de qualquer tipo de dados
Metodos:
getList()->retorna a referencia da lista
setList(List<>itens)-> insere a lista no spinner

Constructores do SpinnerListModel :
SpinnerListModel()->cria um spinner sem dados
SpinnerListModel(Object[]itens)->cria um spinner com os dados do array
SpinnerListModel(List<>itens)->cria um spinner com os dados da lista

**********************************************************
1.Criamos um Spinner Model
2.Criamos um Spinner que leva como argumento o Model


 */
public class Modulo5_JSpinner_SpinnerListModel {
    JSpinner spin;
    JLabel lab;

    String[]cores={"Red","Green","Blue"};

    Modulo5_JSpinner_SpinnerListModel(){
        JFrame jf=new JFrame("Spinner");
        jf.setLayout(new FlowLayout());
        jf.setSize(900,800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpinnerListModel list=new SpinnerListModel(cores);//criamos um SpinnerModel
        spin=new JSpinner(list);//criamos um spinner que recebe como argumento o model
        spin.setPreferredSize(new Dimension(60,20));
        lab=new JLabel("A seleccao actual e: Red");
        lab.setBorder(BorderFactory.createLineBorder(Color.RED,4));
        spin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String cor=(String) spin.getValue();
                lab.setText("A seleccao actual: "+cor+" ");
                if(cor.equals("Red"))
                    lab.setBorder(BorderFactory.createLineBorder(Color.RED,4));
                else if (cor.equals("Green"))
                    lab.setBorder(BorderFactory.createLineBorder(Color.GREEN,4));
                    else
                    lab.setBorder(BorderFactory.createLineBorder(Color.BLUE,4));
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
                new Modulo5_JSpinner_SpinnerListModel();
            }
        });
    }
}

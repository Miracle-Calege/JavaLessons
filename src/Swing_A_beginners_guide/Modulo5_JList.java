package Swing_A_beginners_guide;

/*
Constructores:
JList()-> cria uma lista vazia
JList(Object[]itens)->cria uma lista que contem os elementos do array itens
JList(Vector<>itens)->cria uma lista que contem os elementos do vector itens
 O gestor de eventos e o ListSelectionListener que gera o metodo valueChanged(ListSelection Event)

 Metodos:
 setSelectionMode(int mode)-> permite a seleccao de multiplos itens na lista

 Modes:
 SINGLE_SELECTION->O usuario so pode escolher um unico elemento
 SINGLE_INTERVAL_SELECTION->O usuario pode escolher um unico intervalo de valores
 MULTIPLE_INTERVAL_SELECTION->O usuario pode escolher multiplos intervalos de valores.Este e o mode usado por defeito.
NB: Usamos com o ListSelectionModel.mode

getSelectedIndex()-> retorna o indice do  elemento selecionado.Retorna -1 se nenhum indice tiver sido selecionado
 */


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo5_JList {
    JList list;
    JLabel lab;
    JScrollPane scr;
    JButton bt;
    String[] macas={"winesap","cortland","red delicious","golden delicious","gala","fuji","granny smith","Jonathan"};

    Modulo5_JList(){
    JFrame jf=new JFrame("*JList*");
    jf.setLayout(new FlowLayout());
    jf.setSize(204,200);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    list=new JList(macas);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//determinamos que so um item seja selecionado
    scr=new JScrollPane(list);//adicionamos uma scrollpane a lista
    scr.setPreferredSize(new Dimension(120,90));
    lab=new JLabel("*Escolha uma maca*");
    list.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            int idx=list.getSelectedIndex();//retorna o indice selecionado
            if(idx!=-1)
                lab.setText("selecao actual"+macas[idx]);
            else
                lab.setText("selecione uma opcao");
        }
    });
        bt=new JButton("Compre a maca");
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx=list.getSelectedIndex();
                if(idx!=-1)
                    lab.setText("Compraste "+macas[idx]);
                else
                    lab.setText("Nada foi selecionado");
            }

        });
        jf.add(scr);
        jf.add(bt);
        jf.add(lab);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo5_JList();
            }
        });
    }
}

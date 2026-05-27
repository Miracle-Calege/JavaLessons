package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Se a preferencia for interagir com os dados da lista,adicionando, removendo e etc o mais ideal e usar ListModel

Passos:
1.Criar o Model
2.Preencher o Model
3.Criar um JList usando o model.
Constructor:
JList(DefaultListModel model)

Metodos:
getModel()-> retorna o a referencia para o model
add(int ind,Object item)-> adiciona o item no indice especificado
addElement(Object item)-> adiciona o item no fim da lista
clear()-> remove todos os elementos da lista
get(int idx)-> retorna o elemento no indice especificado
getSize()-> retorna o tamanho da lista
remove(int idx)-> remove o elemento no indice especificado
removeRange(int inicio,int fim)->remove os elementos no intervalo especificado
 */
public class Modulo5_JList_ListModel {
    JList list;
    JLabel lab;
    JScrollPane scr;
    JButton bt;
    JButton de1;
    Modulo5_JList_ListModel(){
        JFrame jf=new JFrame("*JList*");
        jf.setLayout(new FlowLayout());
        jf.setSize(180,240);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel lm=new DefaultListModel();//criando um DefaultListModel

        lm.addElement("Winesap");
        lm.addElement("Cortland");
        lm.addElement("Red delicious");
        lm.addElement("Gold delicious");
        lm.addElement("Gala");
        list=new JList(lm);//passando o DefaultListModel como parametro na JList
        scr=new JScrollPane(list);
        scr.setPreferredSize(new Dimension(120,90));
        lab=new JLabel("*Escolha uma maca*");
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String what="";
                Object []values=list.getSelectedValues();//guardamos os indices selecionados no array
                if(values.length==0){
                    lab.setText("selecione uma maca");
                    return;
                }
                for(int i=0;i<values.length;i++)
                    what+= values[i]+ "<br>";
                lab.setText("<html> selecao actual:<br>"+ what);

            }
        });
        bt=new JButton("Compre a maca");
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String what="";
                Object []values=list.getSelectedValues();//guardamos os indices selecionados no array
                if(values.length==0){
                    lab.setText("Nenhuma maca selecionada");
                    return;
                }
                for(int i=0;i<values.length;i++)
                    what+= values[i]+ "<br>";

                lab.setText("<html> Macas compradas:<br>"+ what);
            }
        });
         de1=new JButton("*Adicione mais variedades*");
        de1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel lm=(DefaultListModel) list.getModel();
                if(lm.getSize()>5){
                        for (int i=7;i>4;i--) lm.remove(i);
                    de1.setText("Adicione mais variedades");
                }else{
                    lm.addElement("Fuji");
                    lm.addElement("Granny Smith");
                    lm.addElement("Jonathan");
                    de1.setText("Remova variedades extra");
                }
            }
        });
        jf.add(scr);
        jf.add(bt);
        jf.add(de1);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo5_JList_ListModel();
            }
        });
    }
}

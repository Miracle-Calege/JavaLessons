package Swing_A_beginners_guide;
/*
Metodos:
addItem(Object item)->adiciona o elemento no fim da combo
removeItem(Object item)-> remove o item da combo
removeItemAt(int idx)-> remove o item no indice especificado
removeAllItens()-> remove todos itens da combo
getItemCount()->retorna o tamanho da combo
setEditable(boolean valor)-> permite que a comboBox seja editavel.NB: esta linha deve ser colocada logo apos a criacao da comboBox.O valor editado torna-se a selecao actual
getItemAt(int ind)-> retorna o indice na posicao especificada
setEnable(boolean valor)->disabilita e habilita o combo
setModel(ComboBoxModel box)-> define o ComboBoxModel
getModel()-> retorna a referencia do comboBox

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo5_JComboBox_dynamic {
    JComboBox box;
    JLabel lab;
    JButton bt;

    String[] macas={"winesap","cortland","red delicious","golden delicious","gala","fuji","granny smith","Jonathan"};

    Modulo5_JComboBox_dynamic(){
        JFrame jf=new JFrame("JComboBox");
        jf.setLayout(new FlowLayout());
        jf.setSize(220,240);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box=new JComboBox(macas);
        box.setEditable(true);
        lab=new JLabel();
        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item=(String) box.getSelectedItem();
                if(item==null) return;
                lab.setText("Seleccao actual: "+item);
                for(int i=0;i<box.getItemCount();i++)
                    if(item.equals(box.getItemAt(i))){
                        break;
                    }else if(!item.equals(box.getItemAt(i)) && i==box.getItemCount()-1){
                        box.addItem(item);
                    }
            }
        });
        box.setSelectedIndex(0);
        JButton remove=new JButton("Remova selecao");
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item=(String) box.getSelectedItem();
                if(item==null) return;
                box.removeItem(item);
                lab.setText("Removido: "+item);
            }
        });
    jf.add(box);
    jf.add(lab);
    jf.add(remove);
    jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo5_JComboBox_dynamic();
            }
        });
    }
}

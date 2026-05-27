package Swing_A_beginners_guide;
/*
JComboBox-> e uma combinacao entre uma droplist e um botao.A JComboBox usa menos espaco em relacao a JList
JComboBox usa ActionListener como gestor de eventos

Constructores:
JComboBox()->cra um comboBox vazio
JComboBox(Object[]itens)-> cria um comboBox com os itens especificados
JComboBox(Vector<>itens)-> cria um comboBox com os itens especificados
JComboVox(ComboBoxModel md)-> cria um comboBox com o model especificado(a criacao do ComboxModel segue a mesma logica do DefaultListModel)

Metodos:
getSelectedItem()-> retorna a referencia o indice selecionado.Caso nenhum esteja selecionado retorna null
setSelectedItem(Object item)-> faz o oposto do seu getter
getSelectedIndex()->retorna o indice do item selecionado
setSelectedIndex(int idx)->faz o oposto do seu getter
setEditable(boolean valor)-> permite que a comboBox seja editavel.NB: esta linha deve ser colocada logo apos a criacao da comboBox.O valor editado torna-se a selecao actual
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo5_JComboBox {
    JComboBox box;
    JLabel lab;
    String[] macas={"winesap","cortland","red delicious","golden delicious","gala","fuji","granny smith","Jonathan"};

    Modulo5_JComboBox(){
        JFrame jf=new JFrame("JComboBox");
        jf.setLayout(new FlowLayout());
        jf.setSize(220,240);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box=new JComboBox(macas);
        lab=new JLabel();
        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item=(String) box.getSelectedItem();//retorna o indice selecionado
                lab.setText("Seleccao actual: "+item);
            }
        });
        box.setSelectedIndex(0);//seleciona o primeiro elemento na box
        jf.add(box);
        jf.add(lab);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo5_JComboBox();
            }
        });
    }
}

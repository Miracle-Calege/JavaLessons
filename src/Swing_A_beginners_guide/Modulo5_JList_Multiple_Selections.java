package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
getSelectedIndices()-> retorna um array com todas as posicoes selecionadas em ordem crescente, se nenhum indice tiver sido selecionado o tamanho do array sera zero
getSelectedValue()-> retorna o valor selecionado.Retorna null se nenhum valor tiver sido selecionado
getSelectedValues()-> retorna um array com os valores selecionados
setSelectedIndex(int idx)-> seleciona o  elemento correspondente ao indice na lista
setSelectedIndices(int[] idxs)-> seleciona os elementos correspondentes aos indices no array
setSelectedValue(object item,boolean valor)-> seleciona o item(true-selecionado false-nao selecionado)
clearSelection()-> limpa das as selecoes
isSelectionEmpty()-> retorna um valor logico determinando se o ha selecoes ou nao
getAnchorSelectionIndex()->retorna o primeiro elemento a ser selecionado em selecoes multiplas.Retorna -1 um caso nenhum elemento tenha sido selecionado
getLeadSelectionIndex()->retorna o ultimo elemento a ser selecionado em selecoes multiplas.Retorna -1 um caso nenhum elemento tenha sido selecionado
setSelectionInterval(int inicio,int fim)-> seleciona elementos num intervalo
setListData(Object[]itens)-> este metodo preenche a lista de elementos.O parametro deve ser um array ou vector
getValueIsAdjusting()-> retorna um valor logico verificando se selecoes ainda estao a ser feitas
getListCellRenderComponent()->retorna o elemento customizado
setCellRender()-> customiza o elemento
NB:Para usar os 2 ultimos metodos acima a classe do objecto deve implementar ListCellRender
usamos o ctrl+setas para fazer multiplas selecoes
 */
public class Modulo5_JList_Multiple_Selections {
    JList list;
    JLabel lab;
    JScrollPane scr;
    JButton bt;
    String[] macas={"winesap","cortland","red delicious","golden delicious","gala","fuji","granny smith","Jonathan"};

    Modulo5_JList_Multiple_Selections(){

        JFrame jf=new JFrame("*JList*");
        jf.setLayout(new FlowLayout());
        jf.setSize(180,240);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        list=new JList(macas);
        scr=new JScrollPane(list);//adicionamos uma scrollpane a lista
        scr.setPreferredSize(new Dimension(120,90));
        lab=new JLabel("*Escolha uma maca*");
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String what="";
                int []indices=list.getSelectedIndices();//guardamos os indices selecionados no array
                if(indices.length==0){
                    lab.setText("selecione uma maca");
                return;
                }
                for(int i=0;i<indices.length;i++)
                    what+= macas[indices[i]]+ "<br>";
                lab.setText("<html> selecao actual:<br>"+ what);

            }
        });
        bt=new JButton("Compre a maca");
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String what="";
                int []indices=list.getSelectedIndices();//guardamos os indices selecionados no array
                if(indices.length==0){
                    lab.setText("Nenhuma maca selecionada");
                    return;
                }
                for(int i=0;i<indices.length;i++)
                    what+= macas[indices[i]]+ "<br>";

                lab.setText("<html> Macas compradas:<br>"+ what);
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
                new Modulo5_JList_Multiple_Selections();
            }
        });
    }
    }

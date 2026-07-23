package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/*
Os eventos fundamentais gerados pela JTable sao:
ListSelectionEvent->é gerado quando o usuário seleciona algo da tabela.O gerenciador do evento é:
ListSelectionListener que implementa o metodo: valueChanged(ListSelectionEvent le)

**********************Metodos***************************
getSelectionModel()->retorna a referencia do ListSelectionModel que sera usada para acionar o evento
getValueIsAdjusting()->retorna true se alguma selecao ainda estiver em curso e false caso contrario
getSelectedRow()->determina a linha selecionada(retorna o index da primeira linha selecionada).Ideal para o Single selection mode.Retorna -1 se nenhuma linha tiver sido selecionada
getSelectedRows()->determina as linhas selecionadas(retorna um array de indices de todas linhas selecionadas). Ideal se o selection mode for o padrao.Se nenhuma linha for selecionada o tamanho do array sera 0.







 */
public class Modulo8_JTable_rowSelectionEvent {
    String[]headings={"From","Address","Subject","Size"};//cria um array de cabeçalhos
    Object[][] data={{"Wendy","wendy@HerbSchildt.com","Hello Herb",287},
            {"Alex","Alex@HerbSchildt.com","Hello Alex",308},
            {"Hale","Hale@HerbSchildt.com","Hello Hale",887},
            {"Todd","todd@HerbSchildt.com","Hello Todd",223},
            {"Steve","steve@HerbSchildt.com","Hello Steve",357},
            {"Ken","ken@HerbSchildt.com","Hello Ken",512},
    };//criamos um array 2D de dados

    JTable tabEmail;//criamos uma variavel do tipo JTable
    JLabel lab;

    Modulo8_JTable_rowSelectionEvent(){
        JFrame jf=new JFrame("Table");
        jf.setLayout(new FlowLayout());
        jf.setSize(500,160);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabEmail=new JTable(data,headings);//criamos a JTable e inicializamos com os array headings e data
        JScrollPane scr=new JScrollPane(tabEmail);//adicionamos um JScrollPane ao JTable
        tabEmail.setPreferredScrollableViewportSize(new Dimension(450,80));
        lab=new JLabel();
        ListSelectionModel lsm=tabEmail.getSelectionModel();//retorna o selection model da tabela
        lsm.addListSelectionListener(new ListSelectionListener() {//o selection model aciona o listener
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String str="Selected Rows: ";
                int[] rows=tabEmail.getSelectedRows();//os indices das linhas selecionadas serao colocados no array
                for(int i=0;i<rows.length;i++)
                str += rows[i]+" ";
                lab.setText(str);//exibe na label os indices selecionados
            }
        });
        jf.add(scr);//adicionamos o scrollPane na Frame
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo8_JTable_rowSelectionEvent();
            }
        });
    }
}

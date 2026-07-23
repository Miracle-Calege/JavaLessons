package Swing_A_beginners_guide;
/*
*********************Metodos************************
* getColumnModel()->retorna selection model da coluna
* getSelectedColumn()->retorna o indice da coluna selecionada(com as mesma caracteristicas e getSelectedRow())
* getSelectedColumns()->retorna um array com indices de todas as colunas selecionadas(semelhante ao getSelectedRows())
*
* NB:Para retornar os indices originais das colunas(antes de terem sido movidas) fazemos:
*  nomeJTable.getColumnModel().getColumn(indice).getModelIndex().
*getColumn(int idx)->retorna a coluna no indice idx
* getModelIndex()->retorna o indice original
 */

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class Modulo8_JTable_columnSelectionEvents {
    String[]headings={"From","Address","Subject","Size"};//cria um array de cabeçalhos
    Object[][] data={{"Wendy","wendy@HerbSchildt.com","Hello Herb",287},
            {"Alex","Alex@HerbSchildt.com","Hello Alex",308},
            {"Hale","Hale@HerbSchildt.com","Hello Hale",887},
            {"Todd","todd@HerbSchildt.com","Hello Todd",223},
            {"Steve","steve@HerbSchildt.com","Hello Steve",357},
            {"Ken","ken@HerbSchildt.com","Hello Ken",512},
    };
    JTable tabEmail;//criamos uma variavel do tipo JTable
    JLabel lab;


    Modulo8_JTable_columnSelectionEvents(){
        JFrame jf=new JFrame("Table");
        jf.setLayout(new FlowLayout());
        jf.setSize(500,160);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabEmail=new JTable(data,headings);//criamos a JTable e inicializamos com os array headings e data
        JScrollPane scr=new JScrollPane(tabEmail);//adicionamos um JScrollPane ao JTable
        tabEmail.setPreferredScrollableViewportSize(new Dimension(450,80));
        lab=new JLabel();
        tabEmail.setColumnSelectionAllowed(true);
        tabEmail.setRowSelectionAllowed(false);
        TableColumnModel tcm=tabEmail.getColumnModel();//retornamos o column model
        ListSelectionModel lsmcol=tcm.getSelectionModel();//chamamos o selection model usando o column model
        lsmcol.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String str="Selected Columns: ";
                int[]cols=tabEmail.getSelectedColumns();
                for(int i=0;i<cols.length;i++)
                    str+=cols[i]+" ";

                lab.setText(str);
            }
        });
        jf.add(scr);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo8_JTable_columnSelectionEvents();
            }
        });
    }
}

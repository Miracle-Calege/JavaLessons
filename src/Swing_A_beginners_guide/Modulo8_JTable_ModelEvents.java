package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;

/*
TableModelEvent->é gerado quando há alguma mudança na tabela(inserçao,eliminaçao,actualizaçao,etc)
NB:O TableModelEvent tem como gestor de eventos o TableModelListener que implementa o metodo tableChanged().
****************************Metodos**************************************
* getModel()->retorna o model do tipo TableModel
* getFirstRow()->retorna a primeira linha onde o evento ocorreu
* getLastRow()->retorna a ultima linha onde o evento ocorreu
*getColumn()->retorna o indice da coluna onde o evento ocorreu
* getType()->retorna o tipo de mudança que ocorreu(DELETE,INSERT,UPDATE).
* getValueAt(int linha,int coluna)->retorna o dado nas coordenadas especificadas
setValueAt(Object val,int linha,int coluna)->coloca o val nas coordenadas fornecidas
  setAutoResizeMode(int how)->reajusta o tamanho das colunas
  o how pode assumir os valores:
  AUTO_RESIZE_ALL_COLUMNS->a largura de todas as colunas e ajustada quando a largura de uma é alterada pelo usuário
  AUTO_RESIZE_LAST_COLUMN->a largura da ultima coluna e ajustada quando a largura de uma é alterada pelo usuário
  AUTO_RESIZE_NEXT_COLUMN->a largura da coluna a seguir e ajustada quando a largura de uma é alterada pelo usuário
  AUTO_RESIZE_OFF->nao há ajustes,se parte do campo de visao nao estiver visivel uma scrollbar horizontal serao adicionada automaticamente se a table tiver sido passada como argumento da JScrollPane
  AUTO_RESIZE_SUBSEQUENT_COLUMNS-> havera ajusten para todas as colunas a direita da coluna que sofreu mudanças
  setPreferredWidth(int w)-> determina a largura da coluna
  setMaxWidth(int w)->determina a largura maxima da coluna
  setMinWidth(int w)->determina a largura minima da coluna
  Existe os respectivos getters para os 3 metodos acima.
  Para usá-los devemos primeiro retornar a TableColumnModel(getColumnModel()),depois retornar a coluna desejada(getColumn(1)) e depois chamar o metodo ex: setPreferredWidth(50)

 */
public class Modulo8_JTable_ModelEvents {
    String[]headings={"From","Address","Subject","Size"};//cria um array de cabeçalhos
    Object[][] data={{"Wendy","wendy@HerbSchildt.com","Hello Herb",287},
            {"Alex","Alex@HerbSchildt.com","Hello Alex",308},
            {"Hale","Hale@HerbSchildt.com","Hello Hale",887},
            {"Todd","todd@HerbSchildt.com","Hello Todd",223},
            {"Steve","steve@HerbSchildt.com","Hello Steve",357},
            {"Ken","ken@HerbSchildt.com","Hello Ken",512},
    };
    JTable tabEmail;//criamos uma variavel do tipo JTable
    JLabel lab,lab2;
    TableModel tm;//criamos uma variavel do tipo tableModel

    Modulo8_JTable_ModelEvents(){
        JFrame jf=new JFrame("Table");
        jf.setLayout(new FlowLayout());
        jf.setSize(500,160);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabEmail=new JTable(data,headings);//criamos a JTable e inicializamos com os array headings e data
        JScrollPane scr=new JScrollPane(tabEmail);//adicionamos um JScrollPane ao JTable
        tabEmail.setPreferredScrollableViewportSize(new Dimension(450,80));
        lab=new JLabel();
        lab.setPreferredSize(new Dimension(400,20));
        lab.setHorizontalAlignment(SwingConstants.CENTER);
        lab2=new JLabel();

        //selection model
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
        tm=tabEmail.getModel();//retorna o model
        tm.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(e.getType()==TableModelEvent.UPDATE){//se tiver acontecido alguma actualizacao na tabela
                    lab2.setText("Cell "+e.getFirstRow()+", "+e.getColumn()+" changed."+ "The new value: "+tm.getValueAt(e.getFirstRow(),e.getColumn()));
                }
            }
        });
        jf.add(scr);
        jf.add(lab);
        jf.add(lab2);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo8_JTable_ModelEvents();
            }
        });
    }
}

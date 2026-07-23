package Swing_A_beginners_guide;
/*
***********************************Constructores******************************************
JTable()->cria uma JTable vazia com os models padrao.
JTable(Object[][]data,Object[]cabeçalho)->cria uma JTable que contem dados fornecidos pelo array 2D data e cria cabecalhos fornecidos pelo array cabeçalho
JTable(Vector data, Vector cabeçalho)-> faz o que o constructor anterior faz mas usando vectores
JTable(int linhas,int colunas)->cria um JTable vazio com o numero de linhas e colunas especificadas
JTable(TableModel tm)-> cria uma JTable com o model especificado
JTable(TableModel tm,TableColumnModel tcm)->cria um JTable com o table model especificado e o column model especificado
JTable(TableModel tm,TableColumnModel tcm,ListSelectionModel lsm)->cria um JTable com o table model, column model e selection model respectivamente
*********************************Metodos*******************************************
*setPreferredScrollableViewportSize(Dimension dim)->determina até aonde os dados sao exibidos e scrollados
 *getTableHeader()->retornar uma referecia do tipo JTableHeader com os headers.

          ********Selection mode*****************
* setSelectionMode(int mode)-> determina as regras de seleccao.
* Mode pode assumir os valores:
* SINGLE_SELECTION->uma linha/coluna/celula pode ser selecionada
* SINGLE_INTERVAL_SELECTION->um unico intervalo de linhas/colunas/celulas podem ser selecionadaos:usamos shift+mouse
MULTIPLE_INTERVAL_SELECTION->multiplos intervalos de linhas/colunas/celulas podem ser selecionados (é o padrao): usamos ctrl+mouse
NB:O mode é precedido por ListSelectionModel.
*
* setColumnSelectionAllowed(boolean enabled)->determina se pode haver ou nao a seleccao de uma coluna
* setRowSelectionAllowed(boolean enable)-> determina se pode haver ou nao a seleccao de linhas
*setCellSelectionEnabled(boolean enabled)-> determina se pode ou nao selecionar-se uma celula(Se neste metodo o argumento for false automaticamente os metodos acima terao argumento false implicitamente)
*
*

 *
 * NB:Quando nao colocamos a JTable num JScrollPane o cabeçalho nao é exibido
 */

import javax.swing.*;
import java.awt.*;

public class Modulo8_JTable {
    String[]headings={"From","Address","Subject","Size"};//cria um array de cabeçalhos
    Object[][] data={{"Wendy","wendy@HerbSchildt.com","Hello Herb",287},
            {"Alex","Alex@HerbSchildt.com","Hello Alex",308},
            {"Hale","Hale@HerbSchildt.com","Hello Hale",887},
            {"Todd","todd@HerbSchildt.com","Hello Todd",223},
            {"Steve","steve@HerbSchildt.com","Hello Steve",357},
            {"Ken","ken@HerbSchildt.com","Hello Ken",512},
    };//criamos um array 2D de dados

    JTable tabEmail;//criamos uma variavel do tipo JTable


    Modulo8_JTable(){
    JFrame jf=new JFrame("Table");
    jf.setLayout(new FlowLayout());
    jf.setSize(500,160);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tabEmail=new JTable(data,headings);//criamos a JTable e inicializamos com os array headings e data
    JScrollPane scr=new JScrollPane(tabEmail);//adicionamos um JScrollPane ao JTable
    tabEmail.setPreferredScrollableViewportSize(new Dimension(450,80));//determinamos a porcao de visibilidade de dados
    //tabEmail.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//    tabEmail.setColumnSelectionAllowed(true);
//    tabEmail.setRowSelectionAllowed(false);
       // tabEmail.setCellSelectionEnabled(false);

        jf.add(scr);//adicionamos o scrollPane na Frame
    jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo8_JTable();
            }
        });
    }
}

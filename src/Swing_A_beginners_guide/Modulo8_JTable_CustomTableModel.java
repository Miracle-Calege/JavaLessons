package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

/*
Nesta abordagem vamos criar JTable sem usar array ou vectores com dados.Ideal para situaçoes em que queremos
exibir dados de uma fonte externa.Criaremos o nosso Table Model.

*****************************Metodos**********************************
getColumnClass(int idx)->retorna o tipo de dado da informaçao na coluna correspondente ao argumento
getColumnCount()->retorna o numero de colunas
getColumnName(int idx)->retorna o nome da coluna especificada no indice
getRowCount()->retorna o numero de coluna
isCellEditable(int linha,int coluna)->retorna true se a celula nas coordenadas especificadas poder ser editada
addTableModelListener(TableModelListener tml)->adiciona o listener
removeTableModelListener(TableModelListener tml)->remove o listener
***********************Procedimentos*******************
1.Criar uma classe para customizaçao
2.Estender a classe AbstractTableModel
3.Sobrescrever os metodos a sua escolha
 */
public class Modulo8_JTable_CustomTableModel extends AbstractTableModel {
    int numRows;
    String[] colNames = {"Value", "Prime", "Square", "Square Root"};

    Modulo8_JTable_CustomTableModel(int len) {
        super();
        numRows = len;
    }

    public int getRowCount() {
        return numRows;
    }

    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int c) {
        return colNames[c];
    }

    public Object getValueAt(int r, int c) {
        if (c == 0) return r + 2;
        else if (c == 1) {
            if (isPrime(r + 2)) return "yes";
            else return "No";
        } else if (c == 2) return ((r + 2) * (r * 2));
        else return Math.sqrt(r + 2);
    }

    boolean isPrime(int v){
        int i;
        for(i=2;i<=v/i;i++)
            if(v%i==0) return false;
        return true;
    }
}

class NumInfoTable{
    JTable numInfo;

    NumInfoTable(){
        JFrame jf=new JFrame("Table Model");
        jf.setLayout(new FlowLayout());
        jf.setSize(500,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numInfo=new JTable(new Modulo8_JTable_CustomTableModel(99));
        JScrollPane scr=new JScrollPane(numInfo);
        numInfo.setPreferredScrollableViewportSize(new Dimension(450,110));
        jf.add(scr);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumInfoTable();
            }
        });
    }
}

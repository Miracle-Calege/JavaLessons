package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.text.NumberFormat;

public class Modulo8_JTable_customCellRender extends DefaultTableCellRenderer {

    public Component getTableCellRendererComponent(JTable jtab,Object v,boolean selected,boolean focus,int r,int c){
        JLabel rendComp=(JLabel) super.getTableCellRendererComponent(jtab,v,selected,focus,r,c);
        NumberFormat nf=NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(4);
        nf.setMinimumFractionDigits(4);
        rendComp.setText(nf.format(v));
        return rendComp;
    }
}

class NumInfoModel extends AbstractTableModel{
    int numRows;
    String[] colNames = {"Value", "Prime", "Square", "Square Root"};

   NumInfoModel(int len) {
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

    public Class getColumnClass(int c){
       if(c==3) return  Double.class;
       else return Object.class;
    }
}

class CellRendererDemo{
    JTable jtabNumInfo;

    CellRendererDemo(){
        JFrame jf=new JFrame();
        jf.setLayout(new FlowLayout());
        jf.setSize(500,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtabNumInfo=new JTable(new NumInfoModel(99));
        jtabNumInfo.setDefaultRenderer(Double.class,new Modulo8_JTable_customCellRender());
        JScrollPane scr=new JScrollPane(jtabNumInfo);
        jtabNumInfo.setPreferredScrollableViewportSize(new Dimension(450,110));
        jf.add(scr);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CellRendererDemo();
            }
        });
    }
}


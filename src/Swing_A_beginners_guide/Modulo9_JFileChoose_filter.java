package Swing_A_beginners_guide;
/*
Para usarmos filtros precisamos que  implementar metodos da classe FileFilter:

abstract boolean accept(File file)->determina os ficheiros a serem exibidos
abstract String getDescription()->retorna uma string que descreve o filtro
setFileFilter(FileFilter ff)->permite que o filechoose use o filtro(ff)

NB:Quando criamos file filter directorios nao sao exibido automaticamente, devemos usar o metodo accept()
 */


import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class JavaFileFilter extends FileFilter{
    public boolean accept(File file){//exibe ficheiro que terminam com ",java" ou aquele que sao directorios
        if(file.getName().endsWith(".java")) return true;
        if (file.isDirectory()) return true;
        return false;
    }
    public String getDescription(){
        return "Java source Code Files";
    }
}

public class Modulo9_JFileChoose_filter {
    JLabel lab;
    JButton show;
    JFileChooser jfc;

    Modulo9_JFileChoose_filter(){
        JFrame jf=new JFrame("JFileChooser demo");
        jf.setLayout(new FlowLayout());
        jf.setSize(400,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        show=new JButton("Show file chooser");
        jfc=new JFileChooser();//criamos um JFileChooser
        jfc.setFileFilter(new JavaFileFilter());//colocamos o filtro no chooser
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=jfc.showOpenDialog(null);
                if(result==JFileChooser.APPROVE_OPTION)
                    lab.setText("Selected file is:"+jfc.getSelectedFile().getName());
                else
                    lab.setText("No file selected");
            }
        });
        jf.add(show);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo9_JFileChoose_filter();
            }
        });
    }


}

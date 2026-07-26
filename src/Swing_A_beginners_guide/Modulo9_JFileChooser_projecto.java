package Swing_A_beginners_guide;

import org.jfree.data.time.Second;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Modulo9_JFileChooser_projecto {
    JLabel first,second;
    JButton getFirst,getSecond,compare;
    JTextField txFirst,txSecond;
    JFileChooser jfc;

    Modulo9_JFileChooser_projecto(){
        JFrame jf=new JFrame("Compare files");
        jf.setLayout(new FlowLayout());
        jf.setSize(400,160);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        first=new JLabel("First file:");
        first.setPreferredSize(new Dimension(70,20));
        first.setHorizontalAlignment(SwingConstants.RIGHT);
        second=new JLabel("Second file:");
        second.setPreferredSize(new Dimension(70,20));
        second.setHorizontalAlignment(SwingConstants.RIGHT);
        txFirst=new JTextField(20);
        txSecond=new JTextField(20);
        getFirst=new JButton("Browse");
        getSecond=new JButton("Browse");
        compare=new JButton("Compare files");
        jfc=new JFileChooser();
        getFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=jfc.showDialog(null,"Select");
                if(result==JFileChooser.APPROVE_OPTION){
                    File f=jfc.getSelectedFile();
                    txFirst.setText(f.getPath());
                }
            }
        });
        getSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=jfc.showDialog(null,"Select");
                if(result==JFileChooser.APPROVE_OPTION){
                    File f=jfc.getSelectedFile();
                    txSecond.setText(f.getPath());
                }
            }
        });
        compare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txFirst.getText().length()==0 || txSecond.getText().length()==0){
                    JOptionPane.showMessageDialog(null,"Please specify the files to compare","Filename not specified",JOptionPane.WARNING_MESSAGE);
                return;
                }
                File f1=new File(txFirst.getText());
                File f2=new File(txSecond.getText());
                if(!f1.exists()){
                    JOptionPane.showMessageDialog(null,"The first file does not exist","File not found",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(!f2.exists()){
                    JOptionPane.showMessageDialog(null,"The Second file does not exist","File not found",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(compare(f1,f2))
                    JOptionPane.showMessageDialog(null,"Files compare equal","Comparison result",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,"Files compare differ","Comparison result",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        jf.add(first);
        jf.add(txFirst);
        jf.add(getFirst);
        jf.add(second);
        jf.add(txSecond);
        jf.add(getSecond);
        jf.add(compare);
        jf.setVisible(true);
    }

    boolean compare(File fileA,File fileB){
        if(fileA.length()!=fileB.length()) return false;
        FileInputStream f1,f2;
        int i,j;
        byte buf1[]=new byte[1024];
        byte buf2[]=new byte[1024];

        try{
            f1=new FileInputStream(fileA);
            f2=new FileInputStream(fileA);

            do{
                i=f1.read(buf1,0,1024);
                j=f2.read(buf2,0,1024);
                if(!Arrays.equals(buf1,buf2)){
                    f1.close();
                    f2.close();
                    return false;
                }

            }while (i !=-1 && j!=-1);

            f1.close();
            f2.close();
        }catch (IOException exc){
            JOptionPane.showMessageDialog(null,exc,"File error!",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo9_JFileChooser_projecto();
            }
        });
    }
}

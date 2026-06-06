package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Modulo6_JTextArea_projecto {
    JLabel msg;
    JTextArea jta;
    JTextField nome, find;
    JButton save, load, btFind, btFindNext;
    int findIdx;

    public Modulo6_JTextArea_projecto() {
        JFrame jf = new JFrame("Editor de texto");
        jf.setLayout(new FlowLayout());
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        msg = new JLabel();
        msg.setPreferredSize(new Dimension(200, 30));
        msg.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel separator = new JLabel();
        separator.setPreferredSize(new Dimension(200, 30));
        JLabel labFind = new JLabel();
        labFind.setPreferredSize(new Dimension(70, 20));
        labFind.setHorizontalAlignment(SwingConstants.RIGHT);
        JLabel filename = new JLabel();
        filename.setPreferredSize(new Dimension(70, 20));
        filename.setHorizontalAlignment(SwingConstants.RIGHT);
        jta = new JTextArea();
        JScrollPane pane = new JScrollPane(jta);
        pane.setPreferredSize(new Dimension(250, 200));
        nome = new JTextField(15);
        jta.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                String str = jta.getText();
                msg.setText("Tamanho actual: " + str.length());
                findIdx = jta.getCaretPosition();
            }
        });
        save = new JButton("Save file");
        load = new JButton("Load file");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                load();
            }
        });
        find = new JTextField(15);
        btFind = new JButton("Find from top");
        btFindNext = new JButton("Find next");
        btFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findIdx = 0;
                find(findIdx);
            }
        });
        btFindNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                find(findIdx + 1);
            }
        });
        Container cp = jf.getContentPane();
        cp.add(pane);
        cp.add(labFind);
        cp.add(find);
        cp.add(btFind);
        cp.add(btFindNext);
        cp.add(separator);
        cp.add(filename);
        cp.add(nome);
        cp.add(save);
        cp.add(load);
        cp.add(msg);
        jf.setVisible(true);
    }

    void save() {
        FileWriter fw;
        String fname = nome.getText();
        if (fname.length() == 0) {
            msg.setText("No filename present");
            return;
        }
        try {
            fw = new FileWriter(fname);
            jta.write(fw);
            fw.close();
        } catch (IOException e) {
            msg.setText("Error");
            return;
        }
        msg.setText("File Written sucessfully");
    }

    void load() {
        FileReader fw;
        String fname = nome.getText();
        if (fname.length() == 0) {
            msg.setText("No filename present");
            return;
        }
        try {
            fw = new FileReader(fname);
            jta.read(fw, null);
            fw.close();
        } catch (IOException e) {
            msg.setText("Error");
            return;
        }
        findIdx = 0;
        msg.setText("File loaded sucessfully");
    }

    void find(int start){
        String str=jta.getText();
        String findStr=find.getText();
        int idx=str.indexOf(findStr,start);
        if(idx>-1){
            jta.setCaretPosition(idx);
            findIdx=idx;
            msg.setText("String found");
        }else
            msg.setText("String not found");
        jta.requestFocusInWindow();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo6_JTextArea_projecto();
            }
        });
    }

}

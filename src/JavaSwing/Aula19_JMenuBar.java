package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Aula19_JMenuBar extends JFrame {
private JMenuBar bar;
 private JMenu file,edit,help;
 private JMenuItem load,save,exit;
    public Aula19_JMenuBar(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        ImageIcon img=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
        bar=new JMenuBar();//criamos a barra
        file=new JMenu("File");//criamos o menu
        edit=new JMenu("Edit");
        help=new JMenu("Help");
        load=new JMenuItem("Load");//criamos o menuItem
        save=new JMenuItem("Save");//criamos o menuItem
        exit=new JMenuItem("Exit");//criamos o menuItem
        load.addActionListener((e)->System.out.println("Load"));
        save.addActionListener((e)->System.out.println("Save"));
        exit.addActionListener((e)->System.exit(0));
        file.setMnemonic(KeyEvent.VK_F);//colocamos o F como um shortcut para load alt+f
        edit.setMnemonic(KeyEvent.VK_E);
        help.setMnemonic(KeyEvent.VK_H);

        load.setMnemonic(KeyEvent.VK_L);//colocamos o L como um shortcut para load alt+L
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);
        load.setIcon(img);


        file.add(load);//adicionamos o menuItem ao menu
        file.add(save);
        file.add(exit);
        bar.add(file);//adicionamos o menu a bara
        bar.add(edit);
        bar.add(help);

        setJMenuBar(bar);//adciona a barra a frama
        setVisible(true);

    }

    public static void main(String[] args) {
        new Aula19_JMenuBar();
    }
}

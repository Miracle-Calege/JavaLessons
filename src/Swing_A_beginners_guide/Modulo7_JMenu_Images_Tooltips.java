package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Adicionamos imagens ao JMenuItem usando constructor:
JMenultem(Icon image)-> colocando apenas o icon
JMenultem(String name, Icon image)-> colocando o texto e o icon
 ou usando o metodo:
 setIcon(ImageIcon icon)
 setDisabledIcon()
NB: Os metodos acima funcionam do mesmo jeito que no JButton
 Usamos setHorizontalTextPosition()->para alinhar a imagem relativamente ao texto
 setToolTipText(msg)-> usado para activar o tooltip
 */
public class Modulo7_JMenu_Images_Tooltips implements ActionListener {
    JLabel lab;
    Modulo7_JMenu_Images_Tooltips(){
        JFrame jf=new JFrame("Menu demo");
        jf.setLayout(new FlowLayout());
        jf.setSize(220,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        ImageIcon icon1=new ImageIcon("/home/miracle-calege/Downloads/fly.png");
        JMenuBar jmb=new JMenuBar();//criamos um JMenuBar
        JMenu file=new JMenu("File");//criamos um JMenu com o texto "File"
        JMenuItem open=new JMenuItem("Open");//cria um menuItem com o texto "Open"
        JMenuItem close=new JMenuItem("Close");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem exit=new JMenuItem("Exit");
        file.add(open);//adicionamos o JMenuItem open ao JMenu file
        file.add(close);
        file.add(save);
        file.addSeparator();//adicionamos um Separator entre o JMenuItem save e exit
        file.add(exit);
        jmb.add(file);//adicionamos o JMenu file ao JMenuBar
        JMenu options=new JMenu("Options");
        JMenu colors=new JMenu("Colors");
        JMenuItem red=new JMenuItem("Red");
        JMenuItem green=new JMenuItem("Green");
        JMenuItem blue=new JMenuItem("Blue");
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        options.add(colors);//adicionamos o JMenu colors ao JMenu options
        JMenu priority=new JMenu("Priority");
        JMenuItem high=new JMenuItem("High");
        JMenuItem low=new JMenuItem("Low");
        priority.add(high);
        priority.add(low);
        options.add(priority);
        JMenuItem reset=new JMenuItem("Reset");
        options.addSeparator();
        options.add(reset);
        jmb.add(options);
        JMenu help=new JMenu("Help");
        JMenuItem about=new JMenuItem("About",icon1);//criamos um um JMenuItem com o texto e icon
        about.setToolTipText("About tooltip");//activamos o tooltip ao JMenuItem about
        help.add(about);
        jmb.add(help);
        open.addActionListener(this);
        close.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        high.addActionListener(this);
        low.addActionListener(this);
        reset.addActionListener(this);
        about.addActionListener(this);
        jf.add(lab);
        jf.setJMenuBar(jmb);
        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String comStr = e.getActionCommand();
        if (comStr.equals("Exit")) System.exit(0);//se o actioncommando for igual a Exit o programa vai fechar
        lab.setText(comStr + " Selected");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo7_JMenu_Images_Tooltips();
            }
        });
    }
}

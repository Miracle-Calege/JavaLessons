package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo7_exercicio implements ActionListener {
    JLabel lab;
    JMenuItem yellow,purple,orange;
    JMenu colors;

    Modulo7_exercicio(){
        JFrame jf=new JFrame("Demo");
        jf.setLayout(new FlowLayout());
        jf.setSize(220,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        JMenuBar jmb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem open=new JMenuItem("Open");
        JMenuItem close=new JMenuItem("Close");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem exit=new JMenuItem("Exit");
        file.add(open);
        file.add(close);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        jmb.add(file);
        JMenu options=new JMenu("Options");
        colors=new JMenu("Colors");
        JMenuItem red=new JMenuItem("Red");
        JMenuItem green=new JMenuItem("Green");
        JMenuItem blue=new JMenuItem("Blue");
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        JMenuItem moreLess=new JMenuItem("More colors");
        colors.add(moreLess);
        options.add(colors);
        yellow=new JMenuItem("Yellow");
        purple=new JMenuItem("Purple");
        orange=new JMenuItem("Orange");
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
        JMenuItem about=new JMenuItem("About");
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

        moreLess.addActionListener(this);
        yellow.addActionListener(this);
        purple.addActionListener(this);
        orange.addActionListener(this);
        jf.add(lab);
        jf.setJMenuBar(jmb);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comStr=e.getActionCommand();
        if(comStr.equals("Exit")) System.exit(0);
        else if(comStr.equals("More colors")){
            colors.add(yellow);
            colors.add(purple);
            colors.add(orange);
            JMenuItem mi=(JMenuItem) e.getSource();
            mi.setText("Less colors");
        } else if (comStr.equals("Less colors")) {
            colors.remove(yellow);
            colors.remove(purple);
            colors.remove(orange);
            JMenuItem mi=(JMenuItem) e.getSource();
            mi.setText("More colors");
        }
        lab.setText(comStr+"Selected");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo7_exercicio();
            }
        });
    }
}

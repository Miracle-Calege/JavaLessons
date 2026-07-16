package Swing_A_beginners_guide;
/*
************************JCheckBoxMenuItem constructores*******************
* JCheckBoxMenuItem()->cria um checkbox sem texto nem imagem
* JCheckBoxMenuItem(String nome)-> cria um checkbox com o nome associado
* JCheckBoxMenuItem(Icon icon)->cria um checkbox com o icon associado
* JCheckBoxMenuItem(String nome, boolean state)->cria um checkbox com o nome associado e marca se o state for true
* JCheckBoxMenuItem(String nome, Icon icon)->cria um checkbox com o nome e icon associado
* JCheckBoxMenuItem(String nome, Icon icon,boolean state)->cria um checkbox com o nome, icon e o estado(marcado-true, false-nao marcado) associado
* JCheckBoxMenuItem(Action act)-> cria um checkbox cujo todas as propriedades acima sao passados para o objecto act
* NB:Gera o mesmo eventos que um JCheckBox normal gera
* ********************************JRadioButtonMenuItem**********************
* JRadioButtonMenuItem()->cria um radiobutton sem texto nem imagem associada
* JRadioButtonMenuItem(String nome)->cria um radiobutton com o texto associado
* JRadioButtonMenuItem(String nome,boolean state)->cria um radiobutton com o nome associado e o estado marcado(true) ou nao marcado(false)
* JRadioButtonMenuItem(Icon icon)->cria um radiobutton com o icon associado
* JRadioButtonMenuItem(Icon icon,boolean state)->cria um radiobutton com o icon associado e o estado de marcacao
* JRadioButtonMenuItem(String nome,Icon icon,boolean state)->cria um radiobutton com o texto, icon e o estado marcado
* JRadioButtonMenuItem(Action act)->cria um radiobutton com todas as caracteristicas acima associadas
 NB:Tambem devemos criar um buttonGroup
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo7_JMenu_RadioButton_CheckBox_MenuItem  implements ActionListener {
    JLabel lab;
    JMenu colors;

    Modulo7_JMenu_RadioButton_CheckBox_MenuItem(){
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
        JCheckBoxMenuItem red=new JCheckBoxMenuItem("Red");//criamos um JCheckBoxMenuItem de nome red
        JCheckBoxMenuItem green=new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem blue=new JCheckBoxMenuItem("Blue");
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        options.add(colors);
        JMenu priority=new JMenu("Priority");
        JRadioButtonMenuItem high=new JRadioButtonMenuItem("High",true);//criamos um JRadioButtonMenuItem com o texto associado e marcado
        JRadioButtonMenuItem low=new JRadioButtonMenuItem("Low");
        priority.add(high);
        priority.add(low);
        options.add(priority);
        ButtonGroup group=new ButtonGroup();//criamos um buttongroup e depois adicionamos os JRadioButtonMenuItem
        group.add(high);
        group.add(low);
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


        jf.add(lab);
        jf.setJMenuBar(jmb);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comStr=e.getActionCommand();
        if(comStr.equals("Exit")) System.exit(0);
        lab.setText(comStr+"Selected");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo7_JMenu_RadioButton_CheckBox_MenuItem();
            }
        });
    }
}

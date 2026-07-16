package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/***************************JToolBar constructores***********************
JToolBar()-> cria um toolbar horizontal sem titulo
 JToolBar(String titulo)->cria um tool bar horizontal com o titulo associado
 JToolBar(int how)->cria um toolbar na direccao especificada(JToolbar.VERTICAL ou JToolbar.HORIZONTAL)
 JToolBar(String title,int how)->cria um toolbar com o titulo e direccao especificada
 NB:O JToolBar e usado com o borderlayout
 ***************************Aguns metodos uteis********************************
 * addSeparator()->adiciona um Separator
 * addSeparator(Dimension dim)->adiciona um Separator com a dimensao especificada
 *setFloatable(boolean val)-> determina se a toobar pode ser arrastada para outra regiao(true) ou nao(false)
 * setRollOver(boolean val)-> metodo visto nos modulos passados
 */
public class Modulo7_JToolBar implements ActionListener {
    JLabel lab;
    JMenu colors;

    Modulo7_JToolBar(){
        JFrame jf=new JFrame("Demo");
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
        jf.add(lab,BorderLayout.CENTER);//adiciona o JLabel ao centro do border layout
        JToolBar jtb=new JToolBar("Debug");//cria um JToolBar com o titulo Debug
        ImageIcon icon=new ImageIcon("/home/miracle-calege/Downloads/cab.png");
        JButton set=new JButton(icon);
        set.setActionCommand("Set Breakpoint");
        set.setToolTipText("Set Breakpoint");
        JButton clear=new JButton(icon);
        clear.setActionCommand("Clear Breakpoint");
        clear.setToolTipText("Clear Breakpoint");
        JButton resume=new JButton(icon);
        resume.setActionCommand("Resume");
        resume.setToolTipText("Resume");
        jtb.add(set);//adicionamos os botoes ao JToolBar
        jtb.add(clear);
        jtb.add(resume);
        jf.setJMenuBar(jmb);
        jf.add(jtb,BorderLayout.NORTH);//adiciona a toolbar na regiao norte da frame
        set.addActionListener(this);
        clear.addActionListener(this);
        resume.addActionListener(this);
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
                new Modulo7_JToolBar();
            }
        });
    }
}

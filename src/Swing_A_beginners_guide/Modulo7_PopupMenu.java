package Swing_A_beginners_guide;
/*
***********************JPopupMenu****************************
* JPoupMenu()-> cria um popup menu por padrao
* JPopupMenu(String nome)->cria um popup com o titulo passado como argumento
 NB:JPopupMenu e acionado geralmente quando clicamos o botao direito do mouse
 *
 * **********************Activacao do popup menu segue os passos*******************
1.A classa deve implementar a interface MouseListener
* 2.Chamar o metodo addMouseListener()
* 3.Implementar os metodos da interface:
* void mouseClicked(MouseEvent me)
void mouseEntered(MouseEvent me)
void mouseExited(MouseEvent me)
void mousePressed(MouseEvent me)
void mouseReleased(MouseEvent me)
*
* *****************************Metodos*********************************
* int getX()->retorna a localizacao do mouse na coordenada x em relacao a origem do evento
int getY()->retorna a localizacao do mouse na coordenada Y em relacao a origem do evento
boolean isPopupTrigger( )-> retorna um valor logico que determina se o evento em um popup trigger
Component getComponentt( )->retorna a referencia do elemento que esta a gerar o evento
* void show(Component invoker, int upperX, int upperY)->exibe o popup, o invoke e o componente onde o popup sera exibido,x,y sao as coordenadas(responsavel pelo mouse aparecer em cima do primeiro item no popup)
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Modulo7_PopupMenu implements ActionListener {
    JLabel lab;
    JMenu colors;
    JPopupMenu jpu;

    Modulo7_PopupMenu(){
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
        //JPopupMenu
        jpu=new JPopupMenu();//criamos um JPopupMenu
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        //adicionando os JMenuItem ao JPopupMenu
        jpu.add(cut);
        jpu.add(copy);
        jpu.add(paste);
        //chamamos o metodo addMouseListener no container onde sera exibido o popupMenu(se clicarmos o botao direito do mouse em qualquer regiao do container o popup sera exibido)
        jf.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.isPopupTrigger())
                    jpu.show(e.getComponent(),e.getX(),e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger())
                    jpu.show(e.getComponent(),e.getX(),e.getY());
                //NB:Colocamos a mesma linha do codigo em metodos diferentes porque o a ser acionado depende do look and feel
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
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
                new Modulo7_PopupMenu();
            }
        });
    }
}

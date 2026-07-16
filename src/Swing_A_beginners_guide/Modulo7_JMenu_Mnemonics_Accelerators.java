package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
/*
************************Mnemonics******************************
* Mnemonics->permite abrir o menu usando o teclado
* Mnemonics podem ser utilizados para JMenu e JMenuItem
* Para JMenuItem pode activar o mnemonic de 2 maneiras:
* 1.JMenuItem(String nome,int mnem)-> usando o constructor
* 2.usando o metodo setMnemonic(int mnem)
*
* Para o JMenu o mnemonic so pode ser activado atraves do metodo:
* setMnemonic(int mnem)
* setDisplayedMnemomicIndex(int idx)-> sublinha o indice que contem a outra occorencia da letra que foi colocada como mnemonics em caso que nao queremos que fique na primeira letra encontrada

* NB:Para adicionar mnemonic usamos : keyEvent.VK_letraMaiuscula/numero.O mnemonic e usado com alt
 ************************Accelerator*****************************
 * Accelerator-> permite acessar a funcoes do menu ou do menuitem sem precisar sem ter que abri-lo
 *
 * setAccelerator(KeyStroke ks)->e usado para adicionar accelerator
 * para criar um Keystroke:
 * getKeyStroke(char ch)->onde ch e o caracter que actua como accelerator
 * getKeyStroke(Character ch,int mod)->um caracter + mod
 * getKeyStroke(int ch,int mod)->um caracter numerico +mod
 *O mod pode ser:
 InputEvent.ALT_MASK-> permite usar alt
 InputEvent.CTRL_DOWN_MASK-> permite usar ctrl
 InputEvent. META_MASK->
 |InputEvent.SHIFT_MASK-> permite usar shift
 */


public class Modulo7_JMenu_Mnemonics_Accelerators implements ActionListener{
        JLabel lab;
        Modulo7_JMenu_Mnemonics_Accelerators(){
            JFrame jf=new JFrame("Menu demo");
            jf.setLayout(new FlowLayout());
            jf.setSize(220,200);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            lab=new JLabel();
            JMenuBar jmb=new JMenuBar();//criamos um JMenuBar
            JMenu file=new JMenu("File");//criamos um JMenu com o texto "File"
            file.setMnemonic(KeyEvent.VK_F);//criamos um Mnemonic associado a letra F no JMenu file
            JMenuItem open=new JMenuItem("Open",KeyEvent.VK_O);//cria um menuItem com o texto "Open" e a mnemonic associado a O
            open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
            JMenuItem close=new JMenuItem("Close",KeyEvent.VK_C);
            close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_DOWN_MASK));
            JMenuItem save=new JMenuItem("Save",KeyEvent.VK_S);
            save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
            JMenuItem exit=new JMenuItem("Exit",KeyEvent.VK_E);
            exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK));
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
            if(comStr.equals("Exit")) System.exit(0);//se o actioncommando for igual a Exit o programa vai fechar
            lab.setText(comStr+" Selected");
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Modulo7_JMenu_Mnemonics_Accelerators();
                }
            });
        }
    }



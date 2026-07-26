package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
JDialog sao usados para criar dialogo customizados.Para criar JDialog usamos o mesmo procedimento que usamos para criar um JFrame
para remover o dialogo usamos setVisible(false) ou dispose()->liberta todos recursos associados ao JDialog enquanto o anterior so oculta.

**************************Constructores****************************
 JDialog()->cria um diálogo nao modal(que executa na própria thread e permite interagir com o sistema enquanto este esta a ser exibido) cujo o dono é uma janela oculta
 JDialog(Frame parent)->cria um diálogo nao modal cujo o dono é o parent.
 JDialog(Frame parent,String title)->cria um diálogo nao modal cujo o dono é o parent com o título especificado.
 JDialog(Frame parent,String title,boolean isModal)->cria um diálogo nao modal cujo o dono é o parent com o título especificado e estado modal(true) ou nao modal (false).
 JDialog(Frame parent,boolean isModal)->cria um diálogo nao modal cujo o dono é o parent e o estado modal.
 JDialog(Frame parent,String title,boolean isModal, GraphicsConfiguration graphConfig)->cria um diálogo nao modal cujo o dono é o parent com o título especificado e estado modal(true) ou nao modal (false) e as configuracoes  de grafico.
 NB:O parent pode ser do tipo Frame ou Dialog

 */
public class Modulo9_JDialog {
    JLabel lab;
    JButton show,reset,up,down;
    JDialog dlg;

    Modulo9_JDialog(){
        JFrame jf=new JFrame("JDialog demo");
        jf.setLayout(new FlowLayout());
        jf.setSize(400,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel("Direction is pending.");
        show=new JButton("Show dialog");
        reset=new JButton("Reset direction");
        //configurando o JDialog
        dlg=new JDialog(jf,"Direction",true);//passamos os argumentos para Frame,titulo e estado modal
        dlg.setSize(200,100);//tamanho do diálogo
        dlg.setLayout(new FlowLayout());//layout do diálogo
        up=new JButton("Up");
        down=new JButton("Down");
        dlg.add(down);//adicionando o botao ao diálogo
        dlg.add(up);
        dlg.add(new JLabel("Press a button"));
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dlg.setVisible(true);//quando o botao for pressionado o diálogo será exibido
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("Direction is pending");

            }
        });
        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("Direction is up");
                dlg.setVisible(false);//oculta o diálogo
            }
        });
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("Direction is down");
                dlg.setVisible(false);
            }
        });
        jf.add(show);
        jf.add(reset);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo9_JDialog();
            }
        });
    }

}

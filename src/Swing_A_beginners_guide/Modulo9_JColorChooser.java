package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
JColorChooser-> é um diálogo que  permite o usuário  escolher uma determinada cor

 Color showDialog(Component parent,String title,Color initClr)->é usado para criar um JColorChooser modal,como argumentos:o componente onde sera exibido(se for null aparecerá no centro da tela),título a cor inicial selecionada
 NB:O metodo retorna a cor selecionada pelo usuário ou null(se tiver pressionado cancel ou saido do diálogo).
O metodo é precedido por JColorChooser.
 */
public class Modulo9_JColorChooser {
    JLabel lab;
    JButton show;

    Modulo9_JColorChooser(){
        JFrame jf=new JFrame("Color chooser demo");
        jf.setLayout(new FlowLayout());
        jf.setSize(400,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        show=new JButton("Show Color chooser");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //criamos um JColorChooser e colocamos a cor selecionado na variável color
                Color color=JColorChooser.showDialog(null,"Chooser Color",Color.RED);
                if(color!=null)
                    lab.setText("Selected color is"+color.toString());
                else
                    lab.setText("Color selection was cancelled");
            }
        });
        jf.add(show);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo9_JColorChooser();
            }
        });
    }
}

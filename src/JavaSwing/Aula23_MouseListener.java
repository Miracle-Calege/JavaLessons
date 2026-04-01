package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Aula23_MouseListener extends JFrame implements MouseListener {//implementamos a interface MouseListener
    private JLabel label;


    public Aula23_MouseListener(){
        setTitle("MouseListener");
        setSize(500,500);
        setLayout(null);
        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);//o componente em que as accoes desempenhadas pelo mouse se materializarao
        add(label);



        setVisible(true);



    }



    @Override
    public void mouseClicked(MouseEvent e){//quando um botao do mouse  e clicado uma accao e gerada
        System.out.println("Clicaste");
    }

  public void mousePressed(MouseEvent e) {//quando um botao do  mouse e pressionado uma accao e gerada
      System.out.println("Pressionaste");
      label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {//quando um botao do  mouse e solto uma accao e gerada
        System.out.println("Largaste");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {//quando a seta do mouse entra na label
        System.out.println("Entraste");
        label.setBackground(Color.blue);

    }

    @Override
    public void mouseExited(MouseEvent e) {//quando a seta do mouse gira em torno da label
        System.out.println("MOveste");
        label.setBackground(Color.red);
    }

    public static void main(String[] args) {
        new Aula23_MouseListener();
    }
}
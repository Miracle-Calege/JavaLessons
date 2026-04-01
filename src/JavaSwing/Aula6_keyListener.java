package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Aula6_keyListener extends JFrame implements KeyListener {

    private JLabel label;

    public Aula6_keyListener() {
        setTitle("JFRAME");//coloca o titulo na tela
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);
        addKeyListener(this);//permite que as accoes sejam executadas
       label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        add(label);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {// usamos letras
    switch(e.getKeyChar()){
        case 'a'->label.setLocation(label.getX()-10,label.getY());//quando o a for pressionado a label vai se mover para a esquerda
        case 'w'->label.setLocation(label.getX(),label.getY()-10);//quando o w for pressionado a label vai se mover para a cima
        case 's'->label.setLocation(label.getX(),label.getY()+10);//quando o s for pressionado a label vai se mover para a baixo
        case 'd'->label.setLocation(label.getX()+10,label.getY());//quando o d for pressionado a label vai se mover para a direita
        // para aumentar a velocidade e so aumentar o valor dos parametros
    }


    }

    @Override
    public void keyPressed(KeyEvent e) {//usamos os valores das letras
        switch(e.getKeyCode()){
            case 37->label.setLocation(label.getX()-10,label.getY());//quando o a for pressionado a label vai se mover para a esquerda
            case 38->label.setLocation(label.getX(),label.getY()-10);//quando o w for pressionado a label vai se mover para a cima
            case 39->label.setLocation(label.getX()+10,label.getY());//quando o s for pressionado a label vai se mover para a baixo
            case 40->label.setLocation(label.getX(),label.getY()+10);//quando o d for pressionado a label vai se mover para a direita
            // para aumentar a velocidade e so aumentar o valor dos parametros
            //37 left arrow ,38 up arrow, 39 right arrow, 40-down arroq
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("tu largaste a tecla:"+e.getKeyChar());//imprime a tecla que cliquei
        System.out.println("tu largaste a tecla:"+e.getKeyCode());//imprime o valor da tecla que cliquei
    }

    public static void main(String[] args) {
        new Aula6_keyListener();
    }
}

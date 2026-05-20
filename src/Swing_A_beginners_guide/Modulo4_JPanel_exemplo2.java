package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
Nesta abordagem criamos um painel customizado.
1.Criamos uma classe que extends do JPanel
2.Colocamos na classe criada todos os atributos/caracteristicas e accoes que queremos nela
3.Criamos outra classe onde criaremos a nossa JFrame e criaremos uma instancia da classe criada no ponto 1 e 2.
4.Usando o metodo setContentPane(Container  panel) na classe criado no ponto 3, passaremos sobre esse metodo a instancia da classe do ponto 1 e 2.
NB:Esta abordagem e melhor que a anterior.
 */

public class Modulo4_JPanel_exemplo2 extends JPanel {
JLabel jlab;
JButton red,blue;

Modulo4_JPanel_exemplo2(){
    setOpaque(true);
    setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
    jlab=new JLabel("selecione a cor da borda");
    red=new JButton("vermelho");
    blue=new JButton("Azul");
    red.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setBorder(BorderFactory.createLineBorder(Color.RED,5));
        }
    });
    blue.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setBorder(BorderFactory.createLineBorder(Color.BLUE,5));
        }
    });
    add(red);//adicionando os componentes ao painel(Modulo4_JPanel_ex2)
    add(blue);
    add(jlab);
}
}

class Customizacao{
    Customizacao() {
        JFrame jf = new JFrame("");
        jf.setSize(240,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Modulo4_JPanel_exemplo2 painel=new Modulo4_JPanel_exemplo2();//criando uma instancia da classe
        jf.setContentPane(painel);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Customizacao();
            }
        });
    }
}

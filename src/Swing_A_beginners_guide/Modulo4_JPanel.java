package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
JPanel e um container "lightweight" que alberga outros componentes inves de serem adicionados a JFrame.Por defeito o JPanel utiliza o gestor de layout:flowlayout (pode ser trocado) e e possivel adicionar uma borda do mesmo jeito aprendido no modulo2.
NB:Depois dos componentes serem adicionados no JPanel, o JPanel e adicionado  frame.

Constructor:
JPanel()->cria um painel que usa double buffering(desenha toda imagem na tela e depois exibe ao usuario evitando o efeito pisca) e flow layout
JPanel(LayoutManager lam)->cria um panel com double buffering e o layout manager especificado
JPanel(LayoutManager lam,boolean doubleBuf)->cria um panel com o layout especificado e determina o estado de activacao do double buffered
 Metodos para o manuseio do double buffered:
 isDoubleBuffered()-> metodo do tipo boolean, retorna um valor logico indicando o estado de activacao do double buffer
 setDoubleBuffered(boolean bon)-> determina o estado de activacao do double buffer

 Metodos:
 setOpaque(boolean valor)-> determina o modo de opacidade do objecto.NB: Quando o valor por true, o painel sobrescrever o conteudo que estiver no container onde ele(painel) sera colocado, caso contrario estara no transparente(permite  visualizar tudo que esta no container maior).
 isOpaque()-> retorno do tipo boolean, para verificar o estado de opacidade.

 */
public class Modulo4_JPanel {
    JLabel jlab;
    JButton alpha,beta;

    Modulo4_JPanel(){
        JFrame jf=new JFrame("Paineis");
        jf.setLayout(new FlowLayout());
        jf.setSize(220,220);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pn1=new JPanel();//cria um painel com flowlayout e double buffer
        pn1.setPreferredSize(new Dimension(100,100));//determina as dimensoes do painel
        pn1.setOpaque(true);//torna o painel opaco
        pn1.setBorder(BorderFactory.createLineBorder(Color.BLUE));//colocamos uma borda para delimitarmos o painel
        JPanel pn2=new JPanel();
        pn2.setPreferredSize(new Dimension(100,100));
        pn2.setOpaque(true);
        pn2.setBorder(BorderFactory.createLineBorder(Color.RED));
        jlab=new JLabel("Pressione um botao");
        alpha=new JButton("Alpha");
        beta=new JButton("Beta");
        alpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha pressionado");
            }
        });
        beta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta pressionado");
            }
        });
        pn1.add(alpha);//adicionamos os componentes ao painel
        pn1.add(beta);
        pn1.add(jlab);

        pn2.add(new JLabel("um"));
        pn2.add(new JLabel("dois"));
        pn2.add(new JLabel("tres"));

        jf.add(pn1);//adiciona o painel a frame
        jf.add(pn2);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo4_JPanel();
            }
        });
    }
}

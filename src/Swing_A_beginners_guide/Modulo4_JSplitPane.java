package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;

/*
JSplitPane->divide uma tela em duas partes para exibir 2 componentes
Constructores:
JSplitPane()-> Cria um painel vazio e com orientação horizontal por padrão.
JSplitPane(int vertOrHoriz)->Cria um painel vazio onde define a orientação no argumento .JSplitPane.HORIZONTAL_SPLIT ou JSplitPane.VERTICAL_SPLIT
JSplitPane(int vertOrHoriz, boolean contRedraw)->Define a orientação e adiciona o controlo de redesenho contínuo(true ao mover a linha o movimento sera em tempo real).
JSplitPane(int vertOrHoriz, Component leftOrTop, Component rightOrBottom)-> Cria o painel com a orientação escolhida e já insere os dois componentes gráficos lá dentro.
JSplitPane(int vertOrHoriz, boolean contRedraw, Component leftOrTop, Component rightOrBottom)-> É o construtor mais completo. Permite definir a orientação, o comportamento de redesenho em tempo real (contRedraw) e insere diretamente os dois componentes.
Alguns metodos:
setOrientation(int or)->determina a orientacao do divisor.JSplitPane.HORIZONTAL_SPLIT ou JSplitPane.VERTICAL_SPLIT
 setDireccaoComponent(Component com)->especifica onde e que o elemento deve ser exibido
 direccao pode ser bottom,left,right,top
 setContinuousLayout(boolean n)->(Atualiza os componentes continuamente durante o arrasto:true)
 setOneTouchExpandable(boolean valor)-> coloca uma seta que ocultam a divisor
 setResizeWeight(double p)->especifica como vai ser feita a redistribuicao de espaco quando o tamanho do divosr muda
 setDividerSize(int size)->determina o tamanho do divisor
 setDividerLocation(double p)->determina a localizacao do divisor por percentagem
 */
public class Modulo4_JSplitPane {

    Modulo4_JSplitPane(){
        JFrame jf=new JFrame("JSplitPane");
        jf.setSize(380,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab=new JLabel("Lado esquerdo:abcdefghijklmnopqrstuvwxyz");
        JLabel jlab2=new JLabel("Lado direito:abcdefghijklmnopqrstuvwxyz");
        jlab.setMinimumSize(new Dimension(90,30));// se tirarmos estes metodos a linha de divisao ja nao sera movel
        jlab2.setMinimumSize(new Dimension(90,30));
        JSplitPane split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,jlab,jlab2);
        //split.setOneTouchExpandable(true);
        jf.add(split);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo4_JSplitPane();
            }
        });
    }
}

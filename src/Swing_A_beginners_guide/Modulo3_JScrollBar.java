package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
/*
Constructores:
JScrollBar()-> cria um scrollBar na posicao vertical por defeito
JScrollBar(int posicao)->cria um scrollBar na posicao especificada(JScrollBar.HORIZONTAL ou JScrollBar.Vertical)
JScrollBar(int posicao, int valor initial,int extent(porcao do conteudo visvel ex:num campo de texto ou tabela), int valor minimo, int valor maximo)-> cria um JScrollBar definindo todas essas propriedades
 Alguns metodos:
getValue()-> retorna o valor actual
getMaximum()-> retorna o valor maximo
getMinimum()-> retorna o valor minimo
getVisibleAmount()-> retorna a porcao visivel/extent
getValueIsAdjusting()-> retorna um valor logico. true se ainda estiver a ser movimentado e false no caso contrario
getUnitIncrement()-> retorna quanto incrementa quando clicamos o scroll(thumb-setinha)
getBlockIncrement()->retorna quanto incrementa quando clicamos o scroll no espaco onde o scroll movimenta-se(no espaco em branco)
NB:A maioria dos metodos que tem get tambem tem set entao os metodos acima tem os respectivos metodos set(so substituir o get).

O gestor de eventos e  a interface AdjustmentListener  e o metodo adjustmentValueChanged(AdjustmentEvent e);

NB:Por defeito o valores da scrollBar compreendem de 0 -100 com a porcao visivel/extent de 10, e o valor inicial e de 0,blockIncrement 10 e unit 1. O valor actual deve ser menor ou igual ao minimo valor e maior valor mais o actual devem ser menor que o maximo, logo getValue() nunca retornara o valor maximo a nao ser que o extent seja igual a 10.O ultimo valor alcancavel e o maximo-extent
 */

public class Modulo3_JScrollBar {

    JLabel labVert, labHor, labInfo;
    JScrollBar barHor, barVer;

    Modulo3_JScrollBar() {
        JFrame jf = new JFrame("Jscroll Bar");
        jf.setLayout(new FlowLayout());
        jf.setSize(260,260);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labVert=new JLabel("Valor da scroll bar na vertical: 0");
        labHor=new JLabel("Valor da scrooll bar na horizontal: 0");
        barVer=new JScrollBar();
        barHor=new JScrollBar(Adjustable.HORIZONTAL);
        barVer.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
        if(barVer.getValueIsAdjusting()) return;
        labVert.setText("O valor do scroll bar vertical: "+e.getValue());
            }
        });
        barHor.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                labHor.setText("O valor do scroll bar vertical: " + e.getValue());
            }
        });
        labInfo=new JLabel("<html> Scroll bar definicoes <br>"+
                "Minimo valor: "+barVer.getMinimum()+ "<br>"+
                "Maximo valor: "+barVer.getMaximum()+"<br>"+
                "variacao(quantidade visivel): "+barVer.getVisibleAmount()+"<br>"+
                "Block increment: "+barVer.getBlockIncrement()+"<br>"+"unit increment: "+barVer.getUnitIncrement());

        jf.add(barVer);
        jf.add(barHor);
        jf.add(labVert);
        jf.add(labHor);
        jf.add(labInfo);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo3_JScrollBar();
            }
        });
    }
}

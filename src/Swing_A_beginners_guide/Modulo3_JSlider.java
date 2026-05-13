package Swing_A_beginners_guide;
/*
Constructores:
JSlider()-> cria um JSlider que por definicao compreende de 0-100, com o extent de 0 e o valor inicial de 50.Na direccao horizontal
JSlider(int min,int max)->cria um JSlider na horizontal com um extent de 0, determinando o valor minimo e maximo sendo o valor inicial o valor no meio desse intervalo.
JSlider(int min,int max,int valor incial)->cria um JSlider na horizontal com um extent de 0, determinando o valor minimo, maximo e o valor inicial.
JSlider(int posicao)-> cria um JSlider colocando-o numa posicao/direccao especifica(JSlider.Horizontal ou JSlider.Vertical)
JSlider(int posicao,int min,int max,int valor)->cria um JSlider numa determinada direccao/posicao, estabelece o valor minimo, maixmo e inical

NB:Por defeito o JSlider e colocado na horizontal quando a sua posicao nao e especificada, e o seu valor compreende de 0-100, sendo o valor inicial 50 e o extent 0.

O gestor de eventos e a interface ChangeListener implementando o metodo stateChanged()

Para obter a referencia do Slider que gerou o evento usamos getSource().

   NB:Lembrando que JSlider e JScrollBar derivam da mesma classe alguns metodos do JScrollBar tambem sao funcionais aqui
 *******************************************************************
 Colocando graduacoes/ticks:
 Para colocar a maior graduacao:
 setMajorTickSpacing(int valor)->vai produzir uma graduacao que obedece o espacamento do valor.Ex:se o valor for 10, vai produzir uma graduacao maior a cada 10 unidades.
 setMinorTickSpacing(int valor)->vai produzir a graduacao menor(o espacamento entre a graduacao maior).
 setPaintTicks(boolean valor)-> faz com que a graduacao seja visivel.true visivel false nao visivel
 setSnapToTiccks(boolean valor)-> faz com que o knob(apontador do slider) coloque o slider no valor mais proximo no caso em que o usuario coloque o num lugar que nao tem graduacao visivel
setInverted(boolean valor)-> inverte a escala do slider.
*******************************************************
Rotualando(adicionando labels com numeros a graduacao):
setLableTable(slider.createStandardLabels(int valor))-> coloca as labels numericas. valor representa o incremento entre os numeros.Partindo de 0 e incrementando o valor.Geralmente e o mesmo incremento do MajorTickSpacing().

para o metodo acima funcionar devemos usar:setPaintLabels(boolean valor)-> true os valores serao exibidos e false nao serao

 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Modulo3_JSlider {
    JLabel labVert,labHor;
    JSlider hor,ver;

    Modulo3_JSlider(){
    JFrame jf=new JFrame("Slidrs");
    jf.setLayout(new FlowLayout());
    jf.setSize(300,300);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ver=new JSlider(JSlider.VERTICAL);
    //ver.setSnapToTicks(true);
       // ver.setInverted(true);
    hor=new JSlider();
   // hor.setSnapToTicks(true);
      //  hor.setInverted(true);
    ver.setMajorTickSpacing(10);
    hor.setMajorTickSpacing(20);
    ver.setMinorTickSpacing(5);
    ver.setLabelTable(ver.createStandardLabels(10));
    hor.setLabelTable(hor.createStandardLabels(20));
    ver.setPaintTicks(true);
    hor.setPaintTicks(true);
    ver.setPaintLabels(true);
    hor.setPaintLabels(true);
    labHor=new JLabel("Valor do slider horizontal: "+hor.getValue());
    labVert=new JLabel("Valor do slider vertical: "+ver.getValue());

    hor.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            if(hor.getValueIsAdjusting()) return;
            labHor.setText("O valor do slider horizontal: "+hor.getValue());
        }
    });

        ver.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labVert.setText("O valor do slider vertical: "+ver.getValue());
            }
        });

        jf.add(hor);
        jf.add(ver);
        jf.add(labHor);
        jf.add(labVert);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo3_JSlider();
            }
        });
    }
}

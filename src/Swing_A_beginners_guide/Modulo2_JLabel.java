package Swing_A_beginners_guide;
/*
O JLabel pode ter como parametro no seu constructor
JLabel();
JLabel(String texto);
JLabel(Icon icon);
JLabel(String texto, int alinhamentoHorizontal);
JLabel(String texto, Icon icon,int alinhamentoHorizontal);


Ha duas formas de determinar o alinhamento da label:
1.Metodo
Usar um constructor constructor de aceita como parametro alinhamento.
O alinhamento assume os seguintes valores:SwingConstants.LEFT,SwingConstants.CENTER,SwingConstants.TRAILING,SwingConstants.RIGHT,SwingConstants.LEADING.
NB:Podemos substituir o SwingConstants por JLabel.Ex:JLabel.LEFT


2.Metodo
caso tenhamos usado um constructor que nao leva como parametro o alinhamento.

usaremos os metodos:

setHorizontalAlignment(int alinhamentoHorizontal)-> determinar o alinhamento horizontal,o mesmos argumentos/parametros usados no metodo 1;
setVerticalAlignment(int alinhamentoVertical)-> determina o alinhamento vertical.Os parametros podem ser SwingConstants.TOP,SwingConstants.CENTER,SwingConstants.BOTTOM;
setPrefferedSize(new Dimension(int largura,int altura))-> para predefinir um tamanho
setMinimumSize(new Dimension(int largura,int altura))->para predefinir o tamanho minimo;
setMazimumSize(new Dimension(int largura,int altura))->para predefinir o tamanho maximo;

NB:Quando utilizamos constructor sem especificar o alinhamento, a label e colocada a esqueda com o seu conteudo centralizado verticalmente
 Os metodos acima so serao funcionais em gestores de layout como flow e grid se a label/conteudo for menor que o seu container


GridLayout()-> e um gestor de layout que divide o container em grelhas que leva como alguns parametros:
GridLayout(int linhas,int colunas, int gapHorizontal,int gapVertical);
Os elementos na adicionados a grelha da esquerda a direita preenchendo cada linha antes de partir para outra
 */


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Modulo2_JLabel {

     Modulo2_JLabel(){
         JLabel[] jlabs=new JLabel[9];

         JFrame jf=new JFrame("Alinhamento vertical e horizontal");
         jf.setLayout(new GridLayout(3,3,4,4));
         jf.setSize(500,200);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jlabs[0]=new JLabel("Left,Top",JLabel.LEFT);//criamos uma JLabel com o texto "left-top" posicionado a esquerda
         jlabs[0].setVerticalAlignment(JLabel.TOP);//colocamos a JLabel verticalmente no topo
         jlabs[1]=new JLabel("Center,Top",JLabel.CENTER);
         jlabs[1].setVerticalAlignment(JLabel.TOP);
         jlabs[2]=new JLabel("Right,Top",JLabel.RIGHT);
         jlabs[2].setVerticalAlignment(JLabel.TOP);
         jlabs[3]=new JLabel("Left,Center",JLabel.LEFT);
         jlabs[4]=new JLabel("Center,Center",JLabel.CENTER);
         jlabs[5]=new JLabel("Right,Center",JLabel.RIGHT);
         jlabs[6]=new JLabel("Left,Bottom",JLabel.LEFT);
         jlabs[6].setVerticalAlignment(JLabel.BOTTOM);
         jlabs[7]=new JLabel("Center,Bottom",JLabel.CENTER);
         jlabs[7].setVerticalAlignment(JLabel.BOTTOM);
         jlabs[8]=new JLabel("Right,Bottom",JLabel.RIGHT);
         jlabs[8].setVerticalAlignment(JLabel.BOTTOM);
         Border border=BorderFactory.createEtchedBorder();
         for(int i=0;i<9;i++){
             jlabs[i].setBorder(border);
         }
         for(int i=0;i<9;i++){
            jf.add(jlabs[i]);
         }
         JPanel pn=((JPanel) jf.getContentPane());
         pn.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
         jf.setVisible(true);


     }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JLabel();
            }
        });
    }
}

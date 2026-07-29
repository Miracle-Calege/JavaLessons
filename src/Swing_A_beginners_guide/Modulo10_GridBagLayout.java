package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;

/*
GribBagLayout-> é um tipo de layout que permite dispor os componentes em posicoes especificas da frame, permitindo também que os componentes possam ter tamanhos diferentes.
A localizaçao  e o tamanho de cada componente é determinado por um conjunto de restriçoes contidas num objecto do tipo GridBagConstraints

setConstraints(Component comp,GridBagConstraints cons)->aplica as restriçoes ao componente


GridBagConstraints definem vários campos:
int anchor->especifica a localizaçao do componente na celula.Por defeito é GridBagConstraints.CENTER
Valores absolutos:
GridBagConstraints.CENTER
GridBagConstraints.NORTH
GridBagConstraints.EAST
GridBagConstraints.NORTHEAST
GridBagConstraints.NORTHWEST
GridBagConstraints.SOUTH
GridBagConstraints.SOUTHEAST
GridBagConstraints.SOUTHWEST
GridBagConstraints.WEST
valores relativos(depende da orientaçao do container):
GridBagConstraints.FIRST_LINE_END
GridBagConstraints.LAST_LINE_END
GridBagConstraints.LINE_END
GridBagConstraints.PAGE_END
GridBagConstraints.FIRST_LINE_START
GridBagConstraints.LAST_LINE_START
GridBagConstraints.LINE_START
GridBagConstraints.PAGE_START

int fill->especifica como o componente será redimensionado se for menor que a célula.
Valores válidos:
GridBagConstraints.NONE(padrao)
GridBagConstraints.HORIZONTAL
GridBagConstraints.VERTICAL
GridBagConstraints.BOTH
int gridheight->especifica a altura do componente em termos de celulas.Por defeito é 1.
int gridwidth->especifica a largura do componente em termos de celulas.Por defeito é 1.
Ambos podem usar gridheight/width:
GridBagConstraints.REMAINDER->determina que o componente pode usar o espaco em sobra na linha
GridBagConstraints.RELATIVE->determina que o componente pode usar o espaco até a penúltima celula na linha

int gridx->especifica a coordenada x da celula onde o componente será adicionado. Por defeito é GridBagConstraints.RELATIVE
int gridy->especifica a coordenada y da celula onde o componente será adicionado. Por defeito é GridBagConstraints.RELATIVE
int insets-> especifica as margens.Por defeito é zero
int ipadx->especifica o espaço horizontal extra em volta do componente na celula.Por defeito é zero
int ipady->especifica o espaço vertical extra em volta do componente na celula.Por defeito é zero
NB: O pad é usado para aumentar o tamanho mínimo do componente

double weightx->especifica o valor que determina o espaçamento horizontal entre as celulas, e entre celulas e as bordas do container.Quanto maior for o valor maior o espaco alocado.Por defeito é 0.0
double weighty->especifica o valor que determina o espaçamento vertical entre as celulas, e entre celulas e as bordas do container.Quanto maior for o valor maior o espaco alocado.Por defeito é 0.0
NB:Basicamente weightx e weighty determina quanto espaco extra dentro do container e alocado para cada linha e coluna.
 */
public class Modulo10_GridBagLayout {

    Modulo10_GridBagLayout(){
        JFrame jf=new JFrame("GridBagLayout Demo");
        GridBagLayout gbag=new GridBagLayout();//criamos uma instancia do GridBagLayout
        GridBagConstraints gbc=new GridBagConstraints();//criamos uma instancia do GridBagConstraints
        jf.setLayout(gbag);
        jf.setSize(240,240);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labOne=new JLabel("Button Group one");
        JLabel labTwo=new JLabel("Button Group Two");
        JLabel labThree=new JLabel("Check Box Group");
        JButton one=new JButton("One");
        JButton two=new JButton("Two");
        JButton three=new JButton("Three");
        JButton four=new JButton("Four");
        Dimension btDim=new Dimension(100,25);//criamos um objecto do tipo dimensao
        one.setPreferredSize(btDim);
        two.setPreferredSize(btDim);
        three.setPreferredSize(btDim);
        four.setPreferredSize(btDim);
        JCheckBox boxOne=new JCheckBox("Option one");
        JCheckBox boxTwo=new JCheckBox("Option two");

        gbc.weightx=1.0;//a linha vai crescer 1px se a frame aumentar o tamanho
        gbc.gridx=0;//coloca na coluna 0
        gbc.gridy=0;//coloca na linha 0
        gbag.setConstraints(labOne,gbc);//adiciona as restricoes ao componente

        gbc.gridx=1;//coloca na coluna 1
        gbc.gridy=0;//coloca na linha 0
        gbag.setConstraints(labTwo,gbc);//adiciona as restricoes ao componente
        gbc.insets=new Insets(4,4,4,4);//adicionamos algum espaco entre os botoes
        gbc.gridx=0;//coloca na coluna 0
        gbc.gridy=1;//coloca na linha 1
        gbag.setConstraints(one,gbc);
        gbc.gridx=1;//coloca na coluna 1
        gbc.gridy=1;//coloca na linha 1
        gbag.setConstraints(two,gbc);
        gbc.gridx=0;//coloca na coluna 0
        gbc.gridy=2;//coloca na linha 2
        gbag.setConstraints(three,gbc);
        gbc.gridx=1;//coloca na coluna 1
        gbc.gridy=2;//coloca na linha 2
        gbag.setConstraints(four,gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;//o componente vai ocupar todo o espaco na horizontal(nao vai crescer porque nao usamos os ipad)
        gbc.insets=new Insets(10,0,0,0);//aplicado a label e checkbox
        gbc.gridx=0;//coloca na coluna 0
        gbc.gridy=3;//coloca na linha 3
        gbag.setConstraints(labThree,gbc);
        gbc.insets=new Insets(0,0,0,0);
        gbc.gridx=0;//coloca na coluna 0
        gbc.gridy=4;//coloca na linha 4
        gbag.setConstraints(boxOne,gbc);
        gbc.gridx=0;//coloca na coluna 0
        gbc.gridy=5;//coloca na linha 5
        gbag.setConstraints(boxTwo,gbc);
        jf.add(labOne);
        jf.add(labTwo);
        jf.add(one);
        jf.add(two);
        jf.add(three);
        jf.add(four);
        jf.add(labThree);
        jf.add(boxOne);
        jf.add(boxTwo);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo10_GridBagLayout();
            }
        });
    }
}

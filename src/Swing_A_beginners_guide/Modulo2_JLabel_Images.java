package Swing_A_beginners_guide;
/*
JLabel(Icon icon)
JLabel(Icon icon,int alinhamentoHorizontal);
JLabel(String texto, Icon icon,int alinhamentoHorizontal);

Por defeito o icone e centralizado na label, quando construimos uma label com uma string e uma imagem a imagem e colocada por defeito do lado esquerdo do texto.
Para alterarmos a posicao do texto usamos:

setVerticalTextPosition(int loc);
setHorizontalTextPosition(int loc);

NB:Os parametros/argumentos sao os mesmo usados no documentos Modulo2_JLabel
Para criarmos um icon:

ImageIcon nomeIcon=new ImageIcon("caminho/nome.extensao");
/home/miracle-calege/Downloads/cab.png
 */

import javax.swing.*;
import java.awt.*;

class Modulo2_JLabel_Images {

     Modulo2_JLabel_Images(){
         JFrame jf=new JFrame("Imagens em labels");
         jf.setLayout(new GridLayout(4,1));
         jf.setSize(250,300);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         ImageIcon icon=new ImageIcon("/home/miracle-calege/Downloads/cab.png");//criamos o  icon
         JLabel labelIcon=new JLabel(icon);//colocamos o icon como argumento na label
         JLabel label1=new JLabel("*Label com texto,icon e alinhamento*",icon,SwingConstants.CENTER);//criamos uma label que tem como argumentos uma string, icon e alinhamento
         JLabel label2=new JLabel("Outro texto,icon e alinhamento",icon,SwingConstants.CENTER);
         label2.setHorizontalTextPosition(SwingConstants.LEFT);//coloca o texto a esquerda do icon
         JLabel label3=new JLabel("Outro texto,icon e alinhamento",icon,SwingConstants.CENTER);
         label3.setVerticalTextPosition(SwingConstants.TOP);//coloca o texto acima do icon
         label3.setHorizontalTextPosition(SwingConstants.CENTER);//coloca o texto no centro do icon depois do metodo anterior ter colocado em cima
         jf.add(labelIcon);//adicionamos o label que contem o icone
         jf.add(label1);
         jf.add(label2);
         jf.add(label3);
         jf.setVisible(true);
     }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JLabel_Images();
            }
        });
    }
}

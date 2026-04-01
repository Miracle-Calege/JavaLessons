package JavaSwing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Aula3_Label extends JFrame {
private JLabel label;
    private ImageIcon img;
    private Border border;
    public Aula3_Label(){
        setTitle("JFRAME");//coloca o titulo na tela
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);//impede que o tamanho da frame seja ajustado usando o mouse
        //setLayout(null);//usaremos o null layout para a lavel nao ocupar toda frame
        label=new JLabel("Miracle Calege");//cria uma label
        img=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
        border=BorderFactory.createLineBorder(Color.green,3);//cria uma borda de cor e de uma certa grossura 3 no nosso caso
        label.setIcon(img);// adiciona uma imagem ao frame
        label.setHorizontalTextPosition(JLabel.CENTER);//coloca o texto no centro da imagem
        label.setVerticalTextPosition(JLabel.TOP);//coloca o texto no topo da imagem
        label.setForeground(new Color(0X00FF00));//muda a color do texto
        label.setFont(new Font("TIimes New Roman",Font.ITALIC,14));//muda a fonte do texto
        label.setIconTextGap(100);//distancia a imagem do texto
        label.setBackground(Color.black);//coloca o background da label na cor escolhida
        label.setOpaque(true);// faz com que a cor do background seja notada
        label.setBorder(border);//coloca na frame a borda que criamos acima
        label.setVerticalAlignment(JLabel.TOP);// coloca o texto e a imagem no topo
        label.setHorizontalAlignment(JLabel.CENTER);//coloca o text e a imagem no centro
        //label.setBounds(0,0,250,250);//delimita o tamanho da frame
        add(label);
        pack(); //ajusta a frame ao tamanho dos componentes
    }

    public static void main(String[] args) {
        new Aula3_Label().setVisible(true);
    }

}

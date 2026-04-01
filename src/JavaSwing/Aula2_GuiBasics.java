package JavaSwing;
import javax.swing.*;
import java.awt.*;

public class Aula2_GuiBasics extends JFrame {
    private ImageIcon img;
    public Aula2_GuiBasics(){
        setTitle("JFRAME");//coloca o titulo na tela
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);//impede que o tamanho da frame seja ajustado usando o mouse
        img=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");//busca a imagem nesse caminho
        setIconImage(img.getImage());//coloca a image como icone da tela
        getContentPane().setBackground(new Color(123,50,250));//muda a cor do background da tela
        setVisible(true);//torna a frame visivel

    }



    public static void main(String[] args) {
        new Aula2_GuiBasics();
    }
}

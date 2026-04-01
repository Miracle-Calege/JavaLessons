package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula18_ProgressBar extends JFrame {
    private JProgressBar bar;

    public Aula18_ProgressBar(){
        setTitle("ProgressBar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(420,420);
        setLayout(null);
        setLocationRelativeTo(null);
        bar=new JProgressBar();//criamos nossa barra de progresso
        //tambem podemos colocar o minimo e o maximo valor como parametros no constructor
        bar.setValue(0);//estabelece o valor inicial
        bar.setBounds(0,0,420,50);//as dimensoes da barra
        bar.setStringPainted(true);//coloca "%" ao lado do nosso valor inicial
        bar.setFont(new Font("MV Boli", Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        add(bar);
        setVisible(true);
        fill();
    }

    public void fill(){
        int count=0;
        while(count<=100){
            bar.setValue(count);//coloca o novo valor
            try {
                Thread.sleep(1000);//vai ter uma iteracao a cada 1 segundo
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count+=10;
        }
        bar.setString("Done :)");//coloca uma mensagem na barra depois de alcancar 100%

    }
    public static void main(String[] args) {
        new Aula18_ProgressBar();
    }

}

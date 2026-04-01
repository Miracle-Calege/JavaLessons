package JavaSwing;

import javax.swing.*;

public class Aula7_Lambda extends JFrame {
private JButton bt;
    public Aula7_Lambda(){
        setTitle("JFRAME");//coloca o titulo na tela
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);
        bt=new JButton("My button");
        bt.setBounds(100,100,200,100);
        bt.addActionListener((e)->System.out.println("Lambda expression"));// criou se um botao com acao sem precisao implementar a interface actionlistener
        //nem usar o metodo actionperformed usando a estrutura (argumento)-> " accao desejada " se tivermos mais de uma linha (argumento)-> " {accao desejada }"


        add(bt);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula7_Lambda();
    }

}

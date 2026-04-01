package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula8_JTextField extends JFrame {
private JTextField tx;
private JButton bt;
    public Aula8_JTextField(){
        setTitle("JFRAME");//coloca o titulo na tela
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);
       tx=new JTextField();
       tx.setPreferredSize(new Dimension(250,40));//dimensoes do textfield
       tx.setFont(new Font("Consolar",Font.ITALIC,35));
       tx.setForeground(new Color(0X00FF00));
       tx.setBackground(Color.black);
       tx.setCaretColor(Color.white);//muda a cor do curso;
        tx.setText("Nome:");//coloca o um texto no textfield
        tx.setEditable(false);//impede que mude se o conteudo do textField

        bt=new JButton("Submeter");;
        bt.addActionListener((e)->System.out.println("Welcome:"+tx.getText()));
        add(bt);
        add(tx);
        pack();//deve ficar sempre depois de todos os componentes terem sido adicionados
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula8_JTextField();
    }
}

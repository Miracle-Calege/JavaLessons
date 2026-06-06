package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/*
JPasswordField-> e um componente dedicado a receber a password do usuario sem que ela seja exibida.Este componente tambem performa um evento quando o ENTER e pressionado.
Apesar de herda do JTextField os metodo cut(),copy() e getText() nao funcionam aqui.

 Constructores:
 JPasswordField()-> cria um passwordField vazio
 JPasswordField(int cols)-> cria um passwordField vazio com o tamanho especificado
 JPasswordField(String str)-> cria um passwordField com o texto especificado
 JPasswordField(String str,int colunas)-> cria um passwordField com o texto e tamanho especificados
 JPasswordField(Document model,String str,int colunas)-> cria um passwordField com o model, texto e tamanho especificados
 NB:Quando introduzimos caracter neste componentes eles aparecem em forma de "*".

 Metodos:
 getPassword()-> retorna a password(um array de caracteres)
setEchoChar(char car)-> muda o caracter padrao "*" por um a nossa escolha
 */
public class Modulo6_JPasswordField {
    JLabel lab;
    JPasswordField pass;

    public  Modulo6_JPasswordField(){
        JFrame jf=new JFrame("JPasswordField");
        jf.setLayout(new FlowLayout());
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel("Insira a password");
        pass=new JPasswordField(15);//criamos um JPassworField de 15 colunas
        pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//instrucoes abaixo serao executadas assim que pressionarmos ENTER
                char pw[]={'t','e','s','t'};
                char [] seq=pass.getPassword();//inicializamos o array seq com os caracteres do password
                if(Arrays.equals(seq,pw))
                    lab.setText("Password valida");
                else
                    lab.setText("Password invalida-- Tente novamente");
                Arrays.fill(pw,(char) 0);
                Arrays.fill(seq,(char) 0);
            }

        });
        jf.add(pass);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo6_JPasswordField();
            }
        });
    }
}

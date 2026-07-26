package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
showInputDialog()-> exibe um textfield para que o usuário insira algum dado.

1.showInputDialog(Object msg)->msg é a mensagem que será exibida a descrever o que deve ser colocado no textfield.Retorna a String inserida pelo usuário depois de pressionar ok(pressionar ok sem ter inserido nada retorna uma string de tamanho zero).Pressionar cancel ou sair do dialogo retorna null
NB:Como nao passamos o componente como argumento o diálogo vai ser exibido no centro da tela

2.showInputDialog(Object msg,Object initVal)->coloca a mensagem e o initVal no textfiel

3.showInputDialog(Componet parent,Object msg)->leva como argumento o container e a mensagem

4.showInputDialog(Componet parent,Object msg,Object initVal)->leva como argumento o container, a mensagem e coloca o initVal no textfield

5.showInputDialog(Componet parent,Object msg,String title,int msgT)->leva como argumento o container, a mensagem, o título do diálogo e o tipo de diálogo.
msgT pode assumir:
ERROR_MESSAGE->indica que é uma message de erro com um icon que remete a isso
INFORMATION_MESSAGE->indica que é uma mensagem informativa a ser exibida com o icon padrao(que apareceu na forma 1.)
PLAIN_MESSAGE->exibe uma mensagem plana sem icon associado
QUESTION_MESSAGE->indica que a mensagem é um questionamento com um icon "?" associado(por defeito)
WARNING_MESSAGE-> indica que a mensagem e de alerta com um icon que remete a isso
NB:O msgT deve ser precedio do JOptionPane.

6.Object showInputDialog(Componet parent,Object msg,String title,int msgT,Icon image,Object[]vals,Object initVal)->além dos argumentos já descritos temos o icon(se colocarmos null no lugar do icon vai ser exibido o icon padrao) e uma lista de entrada no array vals que e exibido em forma de lista(se insirir null vai ser exibido o textfield padrao)
 */
public class Modulo9_JOptionPane_inputDialog {
    JLabel lab;
    JButton show;
    JFrame jf;

    Modulo9_JOptionPane_inputDialog(){
        jf = new JFrame("Message Dialog");
        jf.setLayout(new FlowLayout());
        jf.setSize(400, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab = new JLabel();
        show = new JButton("Show dialog");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[]names={"Tom Jones","Bob Smith","Mary Doe","Nancy Oliver"};
                //colocamos o retorno numa variavel
                //forma 1
//                String response=JOptionPane.showInputDialog("Enter Name");
                //forma3
//                String response=JOptionPane.showInputDialog(jf,"Enter Name","Miracle Calege");
                //forma 6
                String response=(String) JOptionPane.showInputDialog(jf,"Choose User","Select User Name",JOptionPane.QUESTION_MESSAGE,null,names,"Bob Smith");
                if(response==null)
                    lab.setText("Dialog cancelled or closed");
                else  if (response.length()==0)
                    lab.setText("No string entered");
                else
                    lab.setText("Hi there "+response);
            }
        });
        jf.add(show);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo9_JOptionPane_inputDialog();
            }
        });
    }

}

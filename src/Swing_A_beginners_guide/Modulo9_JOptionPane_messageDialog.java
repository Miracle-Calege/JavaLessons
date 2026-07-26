package Swing_A_beginners_guide;
/*
JOptionPane suporta 4 tipos basicos de diálogos:mensagem-message,confirmaçao-confirm,entrada-input,opçao-option
Mensagem:Exibe uma mensagem e espera o usuário pressionar o botao de ok
Entrada:permite que o usuário ensira uma String ou selecione um item de uma lista
******************Criando JOptionPanes*********************
show+tipo diálogo+Dialog

ex:showMessageDialog();
NB:Todos os diálogos criados usando essa sequencia sao modal, ou seja, nao nos permitirá fazer outra interecçao com o sistema enquanto nao for fechado o diálogo e é executado na mesma thread que a chamou ou modaless fazem o contrário
Os metodos sao chamados usando o JOptionPane
***************showMessageDialog()*******************************
Este metodo tem 3 formas:
1.showMessageDialog(Component parent,Object msg)->parent é o componente onde o JOptionPane vai aparecer(se colocarmos null o dialogo vai aparecer no centro da tela),msg é a mensagem a ser exibida(Nao é obrigatório que seja uma String, pode ser também uma JLabel)
2.showMessageDialog(Component parent,Object msg,String title, int msgT )->os primeiros 2 argumentos sao iguais ao da forma 1,title especifica o titulo da mensagem(por defeito é Message como exibido no diálogo do numero 1.), msgT indica a natureza da mensagem.
msgT pode assumir:
ERROR_MESSAGE->indica que é uma message de erro com um icon que remete a isso
INFORMATION_MESSAGE->indica que é uma mensagem informativa a ser exibida com o icon padrao(que apareceu na forma 1.)
PLAIN_MESSAGE->exibe uma mensagem plana sem icon associado
QUESTION_MESSAGE->indica que a mensagem é um questionamento com um icon "?" associado
WARNING_MESSAGE-> indica que a mensagem e de alerta com um icon que remete a isso
NB:O msgT deve ser precedio do JOptionPane.
3.showMessageDialog(Component parent,Object msg,String title, int msgT,Icon image )->faz o mesmo que o do 2. faz mas coloca um icon ao nosso gosto

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo9_JOptionPane_messageDialog {
    JLabel lab;
    JButton show;
    JFrame jf;

    Modulo9_JOptionPane_messageDialog(){
        jf=new JFrame("Message Dialog");
        jf.setLayout(new FlowLayout());
        jf.setSize(400,250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        show=new JButton("Show dialog");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Forma1.
                // criando um dialogo onde passamos a frame e a mensagem
                //JOptionPane.showMessageDialog(jf,"Disk space is low");
                //Forma2.
                //colocamos como parametro a frame,mensagem,titulo e tipo de mensagem
//                JOptionPane.showMessageDialog(jf,"Disk space is low","Warning",JOptionPane.WARNING_MESSAGE);
                  //Forma3.
                //passamos um argumento adicionar que nao constava na forma2., um icon
                JOptionPane.showMessageDialog(jf,"Disk space is low","Warning",JOptionPane.WARNING_MESSAGE,new ImageIcon("/home/miracle-calege/Downloads/hot.png"));

                lab.setText("Dialog closed");
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
                new Modulo9_JOptionPane_messageDialog();
            }
        });
    }
}

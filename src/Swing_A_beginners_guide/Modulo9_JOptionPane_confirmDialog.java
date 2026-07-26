package Swing_A_beginners_guide;
/*
showConfirmDialog()->é usado para requisitar respostas do usuário, geralmente sim/nao

1.showConfirmDialog(Component parent,Object msg)->tem como argumento o componente onde será exibido e a mensagem.3 botoes serao exibidos(yes,no,cancel) e o título por defeito será "select an option"
NB:Este método retorna um valor inteiro que indicar a opcao do usuário(o botao pressionado)
Retorno:
CANCEL_OPTION->se for pressionado o botao cancel
CLOSED_OPTION->se for fechado o diálogo
NO_OPTION->se for pressionado NO
YES_OPTION-> se for pressionado yes
2.showConfirmDialog(Component parent,Object msg,String title, int optT)->leva como argumento o container,mensagem,titulo e opcoes;
optT pode ser:
YES_NO_OPTION->o diálogo vai colocar os botoes yes e no
YES_NO_CANCEL_OPTION->o diálogo vai colocar os botoes yes,no e cancel(padrao por defeito)
3.showConfirmDialog(Component parent,Object msg,String title, int optT,int msgT)->leva como argumento o container,mensagem,titulo,opcoes e tipo de mensagem;
msgT pode assumir:
ERROR_MESSAGE->indica que é uma message de erro com um icon que remete a isso
INFORMATION_MESSAGE->indica que é uma mensagem informativa a ser exibida com o icon padrao(que apareceu na forma 1.)
PLAIN_MESSAGE->exibe uma mensagem plana sem icon associado
QUESTION_MESSAGE->indica que a mensagem é um questionamento com um icon "?" associado(por defeito)
WARNING_MESSAGE-> indica que a mensagem e de alerta com um icon que remete a isso
NB:O msgT deve ser precedio do JOptionPane.
4.showConfirmDialog(Component parent,Object msg,String title, int optT,Icon image)->argumentos anteriores e coloca um icon a nossa escolha



 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo9_JOptionPane_confirmDialog {
    JLabel lab;
    JButton show;
    JFrame jf;

    Modulo9_JOptionPane_confirmDialog() {
        jf = new JFrame("Message Dialog");
        jf.setLayout(new FlowLayout());
        jf.setSize(400, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab = new JLabel();
        show = new JButton("Show dialog");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //colocamos o retorno do dialogo numa variavel
                //forma1
//                int response=JOptionPane.showConfirmDialog(jf,"Remove unused files?");
//                //determinamos instrucoes para cada caso
//                switch (response){
//                    case JOptionPane.YES_OPTION -> lab.setText("You answered Yes");
//                    case JOptionPane.NO_OPTION -> lab.setText("You answered No");
//                    case JOptionPane.CANCEL_OPTION ->lab.setText("Canceled pressed");
//                    case JOptionPane.CLOSED_OPTION -> lab.setText("Dialog closed withou response");
//                }
                //forma2
                int response=JOptionPane.showConfirmDialog(jf,"Remove unused files?","Disk Space is Low",JOptionPane.YES_NO_OPTION);
                //determinamos instrucoes para cada caso
                switch (response){
                    case JOptionPane.YES_OPTION -> lab.setText("You answered Yes");
                    case JOptionPane.NO_OPTION -> lab.setText("You answered No");
                    case JOptionPane.CLOSED_OPTION -> lab.setText("Dialog closed withou response");
                }

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
                new Modulo9_JOptionPane_confirmDialog();
            }
        });
    }
}

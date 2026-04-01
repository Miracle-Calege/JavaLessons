package JavaSwing;

import javax.swing.*;

public class Aula13_JOptionPanePart2 {
    public static void main(String[] args) {
      ImageIcon img=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
      String[]respostas={"Yha","Talvez","epha"};
      //null,mensagem,titulo do JOptionPane, e o tipo de aviso(icon)
//        JOptionPane.showMessageDialog(null,"JOptionPanel","Message",JOptionPane.PLAIN_MESSAGE);
// JOptionPane.showMessageDialog(null,"JOptionPanel","Message",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"JOptionPanel","Message",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"JOptionPanel","Message",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"JOptionPanel","Message",JOptionPane.ERROR_MESSAGE);

        //null,mensagem,titulo do JOptionPane,os botoes a serem acrescentados
       // JOptionPane.showConfirmDialog(null,"Chefe?","Titulo",JOptionPane.YES_NO_CANCEL_OPTION);

        // null,mensagem,titulo,botoes,tipo de informacao,icon,botoes de resposta,0
        JOptionPane.showOptionDialog(null,"Certo","Titulo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,img,respostas,0);
    // o nosso icon vai fazer um overide do icon do java assim acontece com as respostas
    }
}

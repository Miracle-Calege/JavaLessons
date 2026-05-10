package Swing_A_beginners_guide;
/*
Mnemoc sao caracteres que usado juntamente com Alt servem como shortcut acelerando o nosso processo de interacao com a GUI

Procedimentos:

1.Escolher o caracter a ser usado:

setDisplayedMnemonic(int caracter): Este metodo sublinhara o caracter escolhido(que faz parte do texto contigo no JLabel), se houver mais de uma ocorrencia desse caracter o primeiro sera sublinhado

No caso que tenhamos mais de uma ocorrencia do caracter escolhido podemos usar o metodo:

setDisplayedMnemonicIndex(int indice)-> colocando o indice onde tem o caracter especifico onde queremos sublinhar

2.Vincular o componente ao caracter
setLabelFor(Component componente)-> determinar para que componente o Mnemonic dessa label esta vinculado

NB: No codigo abaixo quando pressionamos Alt+ o caracter o cursor vai para o TextField respectivo

 */


import javax.swing.*;
import java.awt.*;

public class Modulo2_JLabel_Mnemonic {

    Modulo2_JLabel_Mnemonic(){
        JFrame jf=new JFrame("Mnemonics");
        jf.setLayout(new FlowLayout());
        jf.setSize(260,140);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lab1=new JLabel("Endereco de E-mail");
        JLabel lab2=new JLabel("Nome");
        lab1.setDisplayedMnemonic('e');//atribui o Mnemonic a este caracter
        lab2.setDisplayedMnemonic('n');
        JTextField tx1=new JTextField(20);
        JTextField tx2=new JTextField(20);
        lab1.setLabelFor(tx1);//vincular o Mnemonic nesta label ao tx1
        lab2.setLabelFor(tx2);
//        tx1.setActionCommand("tx1");
//        tx2.setActionCommand("tx2");
        jf.add(lab1);
        jf.add(tx1);
        jf.add(lab2);
        jf.add(tx2);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JLabel_Mnemonic();
            }
        });
    }
}

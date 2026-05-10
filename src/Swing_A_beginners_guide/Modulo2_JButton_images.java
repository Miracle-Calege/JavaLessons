package Swing_A_beginners_guide;
/*
Para classe abstractButton existem 3 tipos de eventos
action event-> gerado quando um botao e pressionado .Metodo actionPerformed()
item event-> quando um item e selecionado .Ex:checkbox, radioButton, etc.
change event-> quando um item muda o seu estado.Ex: JSlider.

alguns contructores:
JButton();
JButton(String msg);
JButton(Icon icon);
JButton(String msg,Icon icon);

***********************************************
Metodo auxiliares:

getIcon()-> retorna o icon do botao
setIcon(Icon icon)-> coloca o icon no botao

setRolloverIcon(Icon icon)-> Muda a imagem que esta no icon quando colocamos o cursor sobre o botao
setDisableIcon(Icon icon)-> sobrepoem/muda a imagem do icon quando pressionado.Para o efeito ser visivel devemos usar o setEnable();
setPressedIcon(Icon icon)-> sobrepoem/muda a imagem do icon quando pressionado e quando o mouse e largado volta a a imagem normal/predefinida
setEnable(boolean estado)-> torna o botao clicavel ou nao clicavel
isEnable()-> retorna um valor logico verifica se o componente esta no estado clicavel ou nao clicavel
isRolloverEnable();
setRolloverEnable();
setDefaultButton(JButton button)-> defini qual botao sera selecionado quando o Enter for clicado.Deve ser precedido por getRootPane()

Quando tivermos icon e texto podemos usar

setVerticalTextPosition();
setHorizontalTextPosition();
NB:Esses metodos foram vistos em detalhes nas labels

Para colocar Mnemonic:

setMnemonic(char caracter);

NB:Tambem podemos usar html nos botoes

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo2_JButton_images implements ActionListener {
    JLabel lab;
    JButton primeiro,segundo;

    Modulo2_JButton_images(){
        ImageIcon icon1=new ImageIcon("/home/miracle-calege/Downloads/fly.png");
        ImageIcon icon2=new ImageIcon("/home/miracle-calege/Downloads/cab.png");
        ImageIcon icon3=new ImageIcon("/home/miracle-calege/Downloads/profile.png");
        ImageIcon icon4=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
        JFrame jf=new JFrame("Botao");
        jf.setLayout(new FlowLayout());
        jf.setSize(220,220);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel("Pressione um botao");
        primeiro=new JButton("Primeiro",icon1);
        segundo=new JButton("Segundo",icon1);
        primeiro.setRolloverIcon(icon3);
        segundo.setRolloverIcon(icon3);
        primeiro.setPressedIcon(icon4);
        segundo.setPressedIcon(icon4);
        primeiro.setDisabledIcon(icon2);
        segundo.setDisabledIcon(icon2);
        primeiro.addActionListener(this);
        segundo.addActionListener(this);
        primeiro.setMnemonic('p');
        jf.add(primeiro);
        jf.add(segundo);
        jf.add(lab);
        jf.getRootPane().setDefaultButton(primeiro);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Primeiro")){
            lab.setText("Primeiro botao pressionado");
            if(segundo.isEnabled()){
                lab.setText("segundo botao esta desabilitado");
                segundo.setEnabled(false);
            }else{
            lab.setText("segundo botao habilitado");
            segundo.setEnabled(true);
        }
    }else{
        lab.setText("segundo botao pressionado");        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JButton_images();
            }
        });
    }
}

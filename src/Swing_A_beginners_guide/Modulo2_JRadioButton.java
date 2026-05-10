package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
Os
JRadionButton geralmente usa o ActionListener para tratamento de eventos
setSelected()->seleciona um determinado radioButton
isSelected()-> retorna um valor logico verificando se o item foi ou nao selecionado
NB:A maior parte dos metodos e constructores visto neste modulo sao aplicaveis para o JRadioButton
 */
public class Modulo2_JRadioButton  implements ActionListener {
    JLabel opcoes,what;
    JCheckBox options;
    JRadioButton speed,size,debug;

    Modulo2_JRadioButton(){
        JFrame jf=new JFrame("Check boxes");
        jf.setLayout(new GridLayout(6,1));
        jf.setSize(300,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        opcoes=new JLabel("Escolha a opcao");
        what=new JLabel("Opcao selecionada:Speed");
        options=new JCheckBox("Habilitando opcoes");
        speed=new JRadioButton("Maximizando a velocidade",true);//o radiobutton estara presselecionado
        size=new JRadioButton("Minimizando tamanho");
        debug=new JRadioButton("Debug");
        ButtonGroup bg=new ButtonGroup();//cria um buttonGroup no qual adicionaremos os radionButton para que so possamos selecionar apenas um
        bg.add(speed);
        bg.add(size);
        bg.add(debug);
        speed.setEnabled(false);
        size.setEnabled(false);
        debug.setEnabled(false);
        options.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(options.isSelected()){
                    speed.setEnabled(true);
                    size.setEnabled(true);
                    debug.setEnabled(true);
                }else{
                    speed.setEnabled(false);
                    size.setEnabled(false);
                    debug.setEnabled(false);
                }
            }
        });
        speed.addActionListener(this);
        size.addActionListener(this);
        debug.addActionListener(this);
        jf.add(options);
        jf.add(opcoes);
        jf.add(speed);
        jf.add(size);
        jf.add(debug);
        jf.add(what);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String opts="";
        if(speed.isSelected()) opts="Speed";
        else if (size.isSelected()) opts="Size";
        else opts="Debug";
        what.setText("Opcoes selecionadas:"+opts);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JRadioButton();
            }
        });
    }
}

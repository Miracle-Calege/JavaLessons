package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
O constructor do JCheckBox recebe os mesmos parametros que o constructor de JToggleButton porque ambos herdam da classe AbstractButton

setEnable(boolean estado)-> seleciona(true) ou faz o posto(false)
isSelected()->retorna um valor logico. Retorna true se o elemento estiver selecionada e false se nao estiver.Usado no componente

getStateChanged()->determina se o elemento foi selecionada ou desselecionado. Usado pelo gestor de eventos

doClick()-> faz com que o botao seja pressionado automaticamente(sem intervencao do usuario)
NB:Maior pate dos metodos usados no JButton e JToggleButton sao funcionais aqui tambem
 */
public class Modulo2_JcheckBox  implements ItemListener {

    JLabel opcoes,what,change;
    JCheckBox options,speed,size,debug;

    Modulo2_JcheckBox(){
    JFrame jf=new JFrame("Check boxes");
    jf.setLayout(new GridLayout(7,1));
    jf.setSize(300,150);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    opcoes=new JLabel("Opcoes");
    change=new JLabel("");
    what=new JLabel("Opcoes selecionadas:");
    options=new JCheckBox("Habilitando opcoes");
    speed=new JCheckBox("Maximizando a velocidade");
    size=new JCheckBox("Minimizando tamanho");
    debug=new JCheckBox("Debug");
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
        speed.addItemListener(this);
        size.addItemListener(this);
        debug.addItemListener(this);
        jf.add(options);
        jf.add(opcoes);
        jf.add(speed);
        jf.add(size);
        jf.add(debug);
        jf.add(change);
        jf.add(what);
        jf.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String opts="";
        JCheckBox cb=(JCheckBox) e.getItem();
        if(e.getStateChange()==ItemEvent.SELECTED)
            change.setText("Mudanca de selecao: "+cb.getText()+" selecionado");
        else
            change.setText("Mudanca de selecao: "+cb.getText()+" apagado");

        if(speed.isSelected()) opts+="Speed";
        if(size.isSelected()) opts+="Size";
        if(debug.isSelected()) opts+="Debug";
        what.setText("Opcoes selecionadas:"+opts);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_JcheckBox();
            }
        });
    }
}

/*
Usamos inner class para o options porque este e o unico item que usa essa sequencia de codigo.E ideal para separar a logica visto que os de mais usam a mesma sequencia de codigo por isso estao no memso itemStateChanged()
 */

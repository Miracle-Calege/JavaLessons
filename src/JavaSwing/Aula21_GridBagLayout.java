package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula21_GridBagLayout extends JFrame {
    private JPanel pn;//e uma boa pratica usar GridbagLayout com panel
    private GridBagConstraints gc;

    public Aula21_GridBagLayout(){
        setTitle("GridBagLayout");
        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pn=new JPanel();
        pn.setLayout(new GridBagLayout());
        gc=new GridBagConstraints();//inicializamos as restricoes
        gc.fill=GridBagConstraints.HORIZONTAL;//determina como o componente vai crescer
        //quando o tamanho do componente e inferior em relacao ao da area pode ser NONE,VERTICAL,HORIZONTARL E BOTH
        gc.weightx=0.5;//especefica quanto o componente vai crescer horizontalmente, ja que nosso fill e horizontal se houver mais espaco(se o componente for redimensionado)
        gc.gridx=0;//corresponde a numero da coluna onde o componente sera colocado
        gc.gridy=0;//corresponde a numero de linha onde o componente sera colocado
        pn.add(new JButton("botao1"),gc);//adicionamos os componente e depois as restricoes
        //primeiro determinamos as restricoes e depois adicionamos
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.weightx=0.5;
        gc.gridx=1;
        gc.gridy=0;
        pn.add(new JButton("Botao 2"),gc);
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.weightx=0.5;
        gc.gridx=2;
        gc.gridy=0;
        pn.add(new JButton("Botao3"),gc);
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.ipady=40;
        gc.weightx=0;
        gc.gridwidth=3;//especifica o numero de colunas que um componente ocupa
        //gc.gridheight ->o numero de linhas que o componente ocupa
        gc.gridx=0;
        gc.gridy=1;
        pn.add(new JButton("Botao longo"),gc);
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.ipady=0;
        gc.weighty=1;//especifca quanto o componente vai crescer verticalmente se houve mais espaco
        gc.anchor=GridBagConstraints.PAGE_END;//usado quando o componente e menor que a area e queremos coloca-lo numa localizacao especifica
        gc.insets=new Insets(10,0,0,0);//o espacamento entre o componente e os de mais cima,esquerda,baixo,direita
        gc.gridx=1;
        gc.gridwidth=2;
        gc.gridy=2;
        pn.add(new JButton("Botao 5"),gc);

        add(pn);



        setVisible(true);

    }

    public static void main(String[] args) {
        new Aula21_GridBagLayout();
    }
}

package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula22_GridLayout_DeitelExercicio  extends JFrame {
    private JTextArea area1,area2;
    private JTextField tx;
    private JComboBox box;
    private GridBagConstraints gc;

    public Aula22_GridLayout_DeitelExercicio(){
        setTitle("Deitel-GridBagLayout");
        setSize(300,150);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        area1=new JTextArea("TextArea1",5,10);//mensagem(opcional),comprimento ,largura
        area2=new JTextArea("TextArea2",2,2);
        tx=new JTextField("TextField");
        box=new JComboBox(new String[]{"Iron","Steel"});
        gc=new GridBagConstraints();
        gc.fill=GridBagConstraints.BOTH;//redimensiona o area1 se a area onde estiver for maior(aumenta na horizontal e vertical)
        gc.gridy=0;//o area1 vai ser colocado na linha 0
        gc.gridx=0;//o area 1 vai ser colocado na coluna 0
        gc.gridheight=3;//o area1 vai ocupar 3 linhas
        gc.gridwidth=1;// o area1 vai ocupar uma coluna
        add(area1,gc);//adicionamos o area1 e as suas restriccoes
        gc.fill=GridBagConstraints.HORIZONTAL;//redimensiona o BOTAO1 se a area onde estiver for maior(aumenta na horizontal)
        gc.weighty=0;
        gc.weightx=0;
        gc.gridy=0;//o botao 1 vai ser colocado na linha 0
        gc.gridx=1;//o botao 1 vai ser colocado na coluna 1
        gc.gridheight=1;//o botao 1 vai ocupar uma linha
        gc.gridwidth=2;//o botao 1 vai ocupar 2 colunas
        add(new JButton("Button1"),gc);
        gc.fill=GridBagConstraints.BOTH;//redimensiona o BOTAO2 se a area onde estiver for maior(aumenta na horizontal e vertical)
        gc.weightx=1000;// o botao 2 vai crescer horintalmenente se tiver espaco estar(se a frame for redimensionada)
        gc.weighty=1;// o botao 2 vai crescer verticalmenente se tiver espaco estar(se a frame for redimensionada)
        gc.gridy=1;//o botao 2 vai ser colocado na linha 1
        gc.gridx=1;//o botao 2 vai ser colocado na coluna 1
        gc.gridheight=1;//o botao 2 vai ocupar uma  linha
        gc.gridwidth=1;//o botao 2 vai ocupar uma coluna
        add(new JButton("Button2"),gc);
        gc.fill=GridBagConstraints.BOTH;
        gc.weightx=0;// o botao 3 vai crescer horintalmenente se tiver espaco estar(se a frame for redimensionada)
        gc.weighty=0;// o botao 3 vai crescer verticalmenente se tiver espaco estar(se a frame for redimensionada)
        gc.gridy=1;//o botao 3 vai ser colocado na linha 1
        gc.gridx=2;//o botao 3 vai ser colocado na coluna 2
        gc.gridheight=1;//o botao 3 vai ocupar uma  linha
        gc.gridwidth=1;//o botao 3 vai ocupar uma coluna
        add(new JButton("Button3"),gc);
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.weightx=0;
        gc.weighty=0;
        gc.gridy=2;//o box vai ser colocado na linha 2
        gc.gridx=1;//o box  vai ser colocado na coluna 1
        gc.gridheight=1;//o box  vai ocupar uma  linha
        gc.gridwidth=2;//o box  vai ocupar 2 colunas
        add(box,gc);
        gc.fill=GridBagConstraints.BOTH;
        gc.weightx=0;
        gc.weighty=0;
        gc.gridy=3;//o tx vai ser colocado na linha 3
        gc.gridx=0;//o tx  vai ser colocado na coluna 0
        gc.gridheight=1;//o tx  vai ocupar uma  linha
        gc.gridwidth=2;//o tx  vai ocupar 2 colunas
        add(tx,gc);
        gc.fill=GridBagConstraints.BOTH;
        gc.weightx=0;
        gc.weighty=0;
        gc.gridy=3;//o area2 vai ser colocado na linha 3
        gc.gridx=2;//o area2  vai ser colocado na coluna 2
        gc.gridheight=1;//o area2  vai ocupar uma  linha
        gc.gridwidth=1;//o area2  vai ocupar 1 coluna
        add(area2,gc);

        /*
        por padrao weightx=0, weighty=0;
        anchor=CENTER;
        fill=NONE;
        gridWidth=1;
        gridheight=1;


         */






        setVisible(true);



    }

    public static void main(String[] args) {
        new Aula22_GridLayout_DeitelExercicio();
    }

}

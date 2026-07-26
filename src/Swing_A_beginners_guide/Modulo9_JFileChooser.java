package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
***********************Constructores*******************************
* JFileChooser()->cria um file chooser que inicialmente exibe o directorio padrao
* JFileChooser(File dir)->cria um file chooser que inicialmente exibe o directorio  especificado por dir(se for null vai exibir o padrao)
* JFileChooser(String dir)->cria um file chooser que inicialmente exibe o directorio  especificado por dir(se for null vai exibir o padrao)
**************************Metodos**********************************
* Depois de criar o JFileChooser este é exibido chamando os seguintes métodos:
* showOpenDialog(Component parent)->cria o chooser com o nome e um botao chamado open
* showSaveDialog(Component parent)->cria o chooser com o nome e um botao chamado sava
* showDialog(Component parent,String name)->cria o chooser com o nome e um botao chamado com o nome passado como argumento
* NB:Parente é o component em que o chooser é exibido/posicionado(se for null vai ser posicionado no centro da tela do pc)
Os metodos acima têm os seguintes retornos:
* APPROVE_OPTION->indica que o usuário selecionou um ficheiro
* CANCEL_OPTION->indica que o usuário pressionou o botao de cancelar ou fechou o chooser
* ERROR_OPTION->um erro ocorreu
*
* File getSelectedFile()->retorno o ficheiro selecionado(do tipo File)
* File getSelectedFiles()->retorna um array com os ficheiros selecionados
* File getCurrentDirectory()->retorna o directorio actual
* getPath()->retorna o caminho absoluto do ficheiro
* setMultiSelectionEnabled(boolean on)->permite seleccao de muitos ficheiros(true) caso contrario(false)
* setFileHidingEnabled(boolean on)->permite visualizar ficheiros ocultos(false)
* * **************Metodos do File******************************
* String getName()->retorna o nome do ficheiro
* boolean exists()->verifica se o ficheiro existe
* boolean isFile()->determina se o que foi selecionado é um ficheiro
* boolean isDirectory()->determina se o que foi selecionado é um directorio
*setFileSelectionMode(int fms)->determina o tipo de ficheiros que podem ser selecionado(por defeito sao ficheiros)
*fms pode ser:
* FILES_ONLY
* DIRECTORIES_ONLY
* FILES_AND_DIRECTORIES
*/
public class Modulo9_JFileChooser {
    JLabel lab;
    JButton show;
    JFileChooser jfc;

    Modulo9_JFileChooser(){
        JFrame jf=new JFrame("JFileChooser demo");
        jf.setLayout(new FlowLayout());
        jf.setSize(400,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        show=new JButton("Show file chooser");
        jfc=new JFileChooser();//criamos um JFileChooser
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result=jfc.showOpenDialog(null);//abrimos o fileChooser no centro da tela do pc
                if(result==JFileChooser.APPROVE_OPTION)
                    lab.setText("Selected file is:"+jfc.getSelectedFile().getName());
                else
                    lab.setText("No file selected");
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
                new Modulo9_JFileChooser();
            }
        });
    }
}

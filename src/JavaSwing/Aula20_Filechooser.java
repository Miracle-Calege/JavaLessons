package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Aula20_Filechooser  extends JFrame implements ActionListener {
private JButton bt;

public Aula20_Filechooser(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    bt=new JButton("Select File");
    bt.addActionListener(this);


    add(bt);
    pack();
    setVisible(true);
}


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt){
            JFileChooser chooser=new JFileChooser();//criamos um filechooser
            chooser.setCurrentDirectory(new File("."));//para colocar o directorio que queremos e usamos "." para o directorio do nosso projecto
           int res= chooser.showOpenDialog(null);//a tela onde teremos que escolher(geralmente onde ficam guardados os files usados no IDE) o menu retorna 0 e 1
            if(res == JFileChooser.APPROVE_OPTION){//se a resposta for igual ao resultado de aprovacao(1)
                File file=new File(chooser.getSelectedFile().getAbsolutePath());//guarda o caminho absoluto do ficheiro selecionado
            System.out.println(file);//imprime o caminho absoluto
            }
        }
    }

    public static void main(String[] args) {
        new Aula20_Filechooser();
    }
}

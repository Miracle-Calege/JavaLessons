package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class Aula16_JComboBox  extends JFrame {
    private JComboBox box;
    private String[]animals={"Cao","Gato","Galinha"};

    public Aula16_JComboBox(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        box=new JComboBox(animals);//criamos uma jcombobox cujo o argumento e uma array de animais
        box.addActionListener((e)->JOptionPane.showMessageDialog(null,"Selecionou"+box.getSelectedItem(),"Animais",JOptionPane.INFORMATION_MESSAGE));
        //o array deve ser uma wrapper class Integer,String, Double...
        //getSelectedItem() retorna o elemento selecionado
        System.out.println(box.getItemCount());//retorna a quantidade de elemebtos
        box.addItem("Bird");//permite adicionar mais elementos
        box.insertItemAt("Pig",0);//insere um determinado elemento numa determinada posicao
        box.setSelectedItem(0);//determinada qual elemento estara na selecao predifinida
        box.removeItem("Gato");//remove um determinado elemento
        box.removeItemAt(3);//remove um elemento nesse determinada posicao;

        add(box);
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Aula16_JComboBox();
    }
}

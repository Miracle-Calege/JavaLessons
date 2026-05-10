package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo2_exercicioListaTelefonica {
    JTextField nome, numero;
    JRadioButton exact, start, end;
    JCheckBox ignoreCase;
    String[][] lista = {{"Jon", "555-8765"}, {"Jessica", "555-5643"}, {"Adam", "555-1212"}, {"Rachel", "555-3435"}, {"Tom & Jerry", "555-1001"}};

    Modulo2_exercicioListaTelefonica() {
        JFrame jf = new JFrame("Lista telefonica");
        jf.setLayout(new GridLayout(0, 1));
        jf.setSize(240, 220);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labNome = new JLabel("Nome");
        JLabel labNumero = new JLabel("Numero");
        JLabel labOptions = new JLabel("Procure opcoes");
        nome = new JTextField(10);
        numero = new JTextField(10);
        ignoreCase = new JCheckBox("Ignore case");
        exact = new JRadioButton("Exact match", true);
        start = new JRadioButton("Comeca com");
        end = new JRadioButton("Termina");
        ButtonGroup bg = new ButtonGroup();
        bg.add(exact);
        bg.add(start);
        bg.add(end);
        nome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero.setText(lookUpName(nome.getText()));
            }
        });
        numero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nome.setText(lookUpNumber(numero.getText()));
            }
        });
        jf.add(labNome);
        jf.add(nome);
        jf.add(labNumero);
        jf.add(numero);
        jf.add(new JLabel());
        jf.add(labOptions);
        jf.add(ignoreCase);
        jf.add(exact);
        jf.add(start);
        jf.add(end);
        jf.setVisible(true);
    }

    String lookUpName(String n) {
        for (int i = 0; i < lista.length; i++) {
            if (start.isSelected()) {
                if (ignoreCase.isSelected()) {
                    if (lista[i][0].toLowerCase().startsWith(n.toLowerCase()))
                        return lista[i][1];
                } else {
                    if (lista[i][0].startsWith(n))
                        return lista[i][1];
                }
            } else if (end.isSelected()) {
                if (ignoreCase.isSelected()) {
                    if (lista[i][0].toLowerCase().endsWith(n.toLowerCase()))
                        return lista[i][1];

                } else {
                    if (lista[i][0].endsWith(n))
                        return lista[i][1];
                }
            }else{
                if(ignoreCase.isSelected()){
                    if (lista[i][0].toLowerCase().equals(n.toLowerCase()))
                        return lista[i][1];
                }else{
                    if(lista[i][0].equals(n))
                        return lista[i][1];
                }
            }


        }

return "Nao encontrado";
    }


    String lookUpNumber(String n){
        for(int i=0;i< lista.length;i++) {
            if (lista[i][1].equals(n))
                return lista[i][0];
        }
        return "nao encontrado";
        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_exercicioListaTelefonica();
            }
        });
    }
    }



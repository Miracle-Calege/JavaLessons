package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;

/*
JFormattedTextField-> e um componente responsavel por formatar o texto.
Constructores:
JFormattedTextField()-> cria um formated text field vazio sem nenhum formatador associado
JFormattedTextField(Object contents)-> cria um formated text field que exibe o dado do contents .Usa um formatador compativel com o tipo de dado do contents
JFormattedTextField(Format fmt)-> cria um formated text field vazio que usa o formatador compativel com fmt
JFormattedTextField(JFormattedTextField.abstractFormatter absfmt)-> cria um formated text field vazio que usa abstract formatter especificado por absfmt
JFormattedTextField(JFormattedTextField.abstractFormatterFactory absfmt)-> cria um formated text field vazio que usa abstract formatter  factory especificado por absfmt
 JFormattedTextField(JFormattedTextField.abstractFormatterFactory absfmt,Object contents)-> cria um formated text field vazio que usa abstract formatter factory especificado por absfmt que exibe dados do contents
Metodos:

getCurrencyInstance()-> retorna um formato para moedas.Este metodo e providenciado por NumberFormat
getDateInstance()->retorna um formato para datas.Este metodo e providenciado por DateFormat
NB:JFormattedTextField(Object contents)-> usamos este constructor para os metodos acima


MaskFormatter->usado para produzir um formato ao nosso gosto

Constructor:
MaskFormatter(String fmtmask)
NB:JFormattedTextField(JFormattedTextField.abstractFormatterFactory absfmt) o formatador acima deve ser usado com este constructor
fmtmask pode ser:
A->caracteres alfanumericos
H->caracteres hexadecimais
L->letras todas minusculas
U-> letras toda maiusculas
#-> digitos
*->todos caracteres
?->todas letras
'->codigo de escape que especifica um dos caracter de formato como um literal

O JFormattedTextField tambem gera eventos que sao manipulador pela propertyChangeListener que implementa o metodo:
propertyChange(PropertyChangeEvent pe)

Metodos para adicionar o Listener:

addPropertyChangeListener(PropertyChangeEvent pl)->adiciona o listener para property change events
addPropertyChangeListener(String propName,PropertyChangeEvent pl)->adiciona o listener para mudancas do propName


setValue(object val)-> colocar o valor no formattedTextfield
getValue()


 */
public class Modulo6_JFormattedTextField {
    NumberFormat cf;
    DateFormat df;
    JLabel lab;
    JFormattedTextField salario,data,ID;
    JButton show;
    public  Modulo6_JFormattedTextField(){
        JFrame jf=new JFrame("JFormattedTextfield");
        jf.setLayout(new FlowLayout());
        jf.setSize(900,900);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        try{
            MaskFormatter mf=new MaskFormatter("##-###");//cria um formato, que aceita digito(2 digitos seguidos por - e mais 3 digitos)
            ID=new JFormattedTextField(mf);//cria um formattedTextfield como o formato passado como argumento
        } catch (ParseException e) {
            System.out.println("Invalido");
            return;
        }
        ID.setColumns(15);//determina o tamanho do JFormattedTextField
        ID.setValue("24-895");
        //cria um formatted text field baseado no formato da moeda
        cf=NumberFormat.getCurrencyInstance();
        cf.setMaximumIntegerDigits(5);
        cf.setMaximumFractionDigits(2);
        salario=new JFormattedTextField(cf);
        salario.setColumns(15);
        salario.setValue(7000);

        //crira um formatted text field para data
        df=DateFormat.getDateInstance(DateFormat.MEDIUM);
        data=new JFormattedTextField(df);
        data.setColumns(15);
        data.setValue(new Date());
        ID.addPropertyChangeListener("value", new PropertyChangeListener() {//se a propriedade value for alterada a instrucao abaixo e executada
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                lab.setText("ID do funcionario alterada");
            }
        });
        salario.addPropertyChangeListener("value", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                lab.setText("Salario mensal mudado");
            }
        });
        data.addPropertyChangeListener("value", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                lab.setText("Data de contrato alterado");
            }
        });
        show=new JButton("Actualizacoes");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("<html>Funcionario ID: "+
                        ID.getValue()+"<br>Salario: "+cf.format(salario.getValue())+"<br>Data contrato: "+df.format(data.getValue()));
            }
        });
        jf.add(new JLabel("ID funcionario"));
        jf.add(ID);
        jf.add(new JLabel("Salario"));
        jf.add(salario);
        jf.add(new JLabel("Data de contracto"));
        jf.add(data);
        jf.add(show);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo6_JFormattedTextField();
            }
        });
    }

}

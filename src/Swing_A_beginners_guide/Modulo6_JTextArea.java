package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

/*
Constructores:
JTextArea()->cria um text area vazion cujo as dimensoes sao zero
JTextArea(String str)-> cria um text area que contem a string str
JTextArea(int linhas,int colunas)-> cria um text area vazio com o numero de linhas e colunas especificados
JTextArea(String str,int linhas,int colunas)-> cria um text area com o texto str, com o numero de linhas e colunas especificados
JTextArea(Document model)

NB:O unico evento que este componente gera e o caretListener.Ha maior parte dos metodos vistos neste modulo podem ser usados neste componente.E ideal que coloquemos o o textarea vazio dentro do scrollpane para que o tamanho do componente aumente de forma dinamica.
JTextArea so suporta plain documents(textos sem formatacao).

Outros metodos:
setLineWrap(boolean val)->e responsavel por fazer com que quando a borda do text area for alcancada o cursor va para uma nova linha, inves de ter um scrollpane tambem na horizontal(true).
getLineWrap()->vai retornar true se o valor do metodo acima for true.
setWrapStyleWord(true)-> caso nao haja mais espaco numa determinada linha do text area a palavra vai ser colocada noutra linha obedecendo as regras silabicas.Para o caso do false, o componente divide o caracter que nao coube na linha e dispoem noutra linha.
append(String str)->adiciona a string no fim do textarea
insert(String str,int idx)-> adiciona a string na posicao especificada
replaceRange(String str,int inicio,int fim)->substituimos uma determinada string no intervalo inicio ao fim-1 pelo str.
getLineCount()->retorna o numero de linhas
setTabSize(int tamanho)-> define o tamanho de uma tab.O default e 8.
 requestFocusInWindow()-> pede o foco do teclado, faz com que o curso va para o JTextArea
 */
public class Modulo6_JTextArea {
    JLabel lab;
    JTextArea jta;

    public Modulo6_JTextArea(){
        JFrame jf=new JFrame("TextArea");
        jf.setLayout(new FlowLayout());
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel("A contagem das palavras e actualmente 0");
        jta=new JTextArea();//criamos um JTextArea
        jta.setLineWrap(true);//determinamos que chegado a borda do textarea o texto devera ser dado continuidade na proxima linha
        jta.setWrapStyleWord(true);//determinamos que caso chegada a borda do textarea a colocacao do texto deve obedecer a divisao silabica
        JScrollPane pane=new JScrollPane(jta);
        pane.setPreferredSize(new Dimension(100,75));//determina tambem o tamanho do textarea
        jta.addCaretListener(new CaretListener() {//adicionamos o listener
            @Override
            public void caretUpdate(CaretEvent e) {
                int wc;
                String str=jta.getText();//inicializamos o str com o texto no textarea
                if(str.length() == 0)
                    wc=0;
                else {
                    String[] strsplit=str.split("\\w+");
                    wc=strsplit.length;
                    if(strsplit.length>0 && strsplit[0].length()==0)
                        wc--;
                }
                lab.setText("contagem de palavras "+wc);
            }
        });
        jf.add(pane);
        jf.add(lab);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo6_JTextArea();
            }
        });
    }
}

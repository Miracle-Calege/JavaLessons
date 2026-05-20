package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
/*
E possivel adicionar header ao JScrollPane atraves dos metodos:
setColumnHeaderView(Component com)-> adiciona o componente passado como argumento como header na vertical
setRowHeaderView(Component com)-> adiciona o componente passado como argumento como header na horizontal

 Adicionando bordas:

 setViewportBoder(Border border)-> adiciona bordas em volta da viewport

ScrollBar policies:
JScrollPane(int vertSBP,int horiSBP)
setVerticalScrollBarPolicy(int vertSBP);
setHorizontalScrollBarPolicy(int vertSBP);
As policies estao disponiveis na pag 181.

getHorizontalScrollBar()->retorna a referencia da scrollbar na horizontal
getVerticalScrollBar()->retorna a referencia da scrollbar na vertical
NB:Estes metodos que retornam referencia sao uteis para usar com block e unit increment, metodos usados no JScrollBar
 setCorner(String canto,Component com)-> serve para colocar um componente num dos cantor do JScrollPane.
 O valor/nome dos cantor pode ser encontrado na pag.182

 */

public class Modulo4_JScrollPane_headers {
    JCheckBox op1,op2,op3,op4,op5;

    Modulo4_JScrollPane_headers() {
        JFrame jf = new JFrame("Headers");
        jf.setSize(280, 140);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel options = new JLabel("Selecione uma ou mais opcoes");
        op1 = new JCheckBox("opcao um");
        op2 = new JCheckBox("opcao dois");
        op3 = new JCheckBox("opcao tres");
        op4 = new JCheckBox("opcao quatro");
        op5 = new JCheckBox("opcao cinco");
        JPanel pn1 = new JPanel();
        pn1.setLayout(new GridLayout(6,1));
        pn1.setOpaque(true);
        pn1.add(options);
        pn1.add(op1);
        pn1.add(op2);
        pn1.add(op3);
        pn1.add(op4);
        pn1.add(op5);
        JScrollPane scr=new JScrollPane(pn1);
        scr.setViewportBorder(BorderFactory.createLineBorder(Color.BLACK));//adicionando uma borda ao viewport
        JLabel ch=new JLabel("Configuracao do centro",SwingConstants.CENTER);
        JLabel rh=new JLabel("<html>C<br>h<br>o<br>o<br>s<br>e",SwingConstants.CENTER);
        rh.setPreferredSize(new Dimension(20,200));
        scr.setColumnHeaderView(ch);//adicionando header na coluna
        scr.setRowHeaderView(rh);//adicionando header na linha
        jf.add(scr);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo4_JScrollPane_headers();
            }
        });
    }
}

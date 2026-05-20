package Swing_A_beginners_guide;

import javax.swing.*;

/*
A semelhanca do JPanel, o JScrollPane e um "lightweight" container.O JScrollPane adiciona uma scroll bar a um componente que se pretende visualizar.
O JScrollPane e dividido em 9 regioes, sendo a viewport a maior de todas elas.pag 175
JScrollPane vs JScrollBar
JScrollPane fica visivel somente quando o viewport(conteudo a ser visualizado) nao estiver totalmente visivel enquantp JScrollBar fica visivel todo o momento

Constructores:
JSrollPane()-> criam um JScrollPane sem view definida
JSrollPane(Componente comp)-> criam um JScrollPane  que scrola automaticamente sobre o componente passado como argumento
JScrollPane(Component comp,int vertSBP,int horizSBP)->cria um JScrollPane que scrola automaticamente sobre o compontente como argumento e determina as "politicas"(quando o scroll e exibido)
 NB:JScrollPane pode ser usado para qualquer componente
 */
public class Modulo4_JScrollPane {

    Modulo4_JScrollPane(){
        JFrame jf=new JFrame("JScrollPane");
        jf.setSize(200,120);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlabe=new JLabel("<html>JScrollPane simplifies what would<br>"+
                "otherwise be complicated tasks<br>"+
                "It can be used to scroll any component<br>"+
                "or lightweight container.It is especially<br>"+
                "useful when scrolling tables,lists,<br>"+
                "or images.");

        JScrollPane scroll=new JScrollPane(jlabe);//criamos um JScrollPane e passamos como argumento o elemento que queremos "scrolar" (jlabe)
        jf.add(scroll);//adicionamos o JScrollPane a frame
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo4_JScrollPane();
            }
        });
    }
}

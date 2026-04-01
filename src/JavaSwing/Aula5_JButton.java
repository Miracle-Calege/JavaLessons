package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula5_JButton extends JFrame  implements ActionListener {//essa interfcae permite que o botacao gere uma acao quando clicado
    private JButton bt;
    private ImageIcon img;
    private JLabel label;
    public Aula5_JButton(){
        setTitle("JFRAME");//coloca o titulo na tela
        setLayout(null);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a aplicacao quando o "x" e clicado
        setResizable(true);
        bt=new JButton("Button");//adicionamos o texto que queremos no botao dentro do constructor
        bt.setBounds(200,100,100,50);//coloca as dimensoes do botao
        img=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
        label=new JLabel();
        label.setBounds(150,250,150,150);
        label.setIcon(img);
        label.setVisible(false);
        bt.setIcon(img);//coloca uma imagem no botao
        bt.setHorizontalTextPosition(JButton.CENTER);//coloca a imagem no centro
        bt.setVerticalTextPosition(JButton.BOTTOM);//colocou a imagem no topo e o texto em baixo
        bt.setFont(new Font("Comic Sans", Font.BOLD,25));//coloca a fonte, o estilo e o tamanho do texto
        bt.setIconTextGap(-15);//estabelece uma distancia entre o icon e o texto
        bt.setForeground(Color.cyan);//muda o foreground do botao
        bt.setBackground(Color.LIGHT_GRAY);//muda a cor do background
        bt.setBorder(BorderFactory.createEtchedBorder());//cria uma borda no botao
        bt.setFocusable(false);//tira aquela bolha do botao
        bt.addActionListener(this);//activa a accao no botao
        add(bt);
        add(label);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt){// a accao que serao gerada quando o botao for clicado
            //System.out.println("Botao");
            label.setVisible(true);
            bt.setEnabled(false);//faz com que o botao so seja clicavel uma vez
        }
    }

    public static void main(String[] args) {
        new Aula5_JButton();
    }
}

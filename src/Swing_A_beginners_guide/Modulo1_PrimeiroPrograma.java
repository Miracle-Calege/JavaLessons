package Swing_A_beginners_guide;

import javax.swing.*; //-> contem a classes principais do swing

class Modulo1_PrimeiroPrograma {

    Modulo1_PrimeiroPrograma(){
        JFrame jfrm=new JFrame("Primeiro Programa");//-> cria um top level container
        jfrm.setSize(275,100);//-> determina as dimensoes  inicias em pixles do container(int largura,int altura)
       jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//-> termina o programa quando o usuario clicar na caixa de saida
        JLabel jlab=new JLabel("*Swing powers the modern java GUI*");//-> cria uma label textual
        jfrm.getContentPane().add(jlab);//-> adiciona a label ao contentPane ou tamebm jfrm.add(jlab)
        jfrm.setVisible(true);//-> exibe o container e o seu conteudo

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {//->cria a gui num event dispacting thread o metodo invokeAndWait() pode ser usado no lugar do invokeLater()
            @Override
            public void run() {
                new Modulo1_PrimeiroPrograma();
            }
        });
    }

}

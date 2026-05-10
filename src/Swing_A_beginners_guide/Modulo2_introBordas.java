package Swing_A_beginners_guide;

/*Bordar podem ser usadas por quase todos elementos do java swing mas sao comumente usadas pelo JPanel e JLabel

createLineBorder()-> cria uma linha que vai delimitar todo o perimetro do componente
pode levar como parametro somente a cor ou tambem levar a cor e a largura da linha em pixels
ex:
createLineBorder(Color cor);
createLineBorder(Color cor,int largura);

createEtchedBorder()->

createEmptyBorder()->cria uma borda vazia que garante um espacamento(gap) entre os componentes
pode levar parametros como largura das laterais
ex:
createEmptyBorder(int cima,int esquerda,int baixo,int direita)

NB:Para chamarmos estes metodos usamos BorderFactory e para colocar no componente usamos o metodo setBorder(BorderFactor.tipo de borda);

A mesma borda pode ser usado por multiplos componentes sem necessidade de criar outro ex:

Border border=BorderFactory.createTipoBorder();
 */

import javax.swing.*;
import java.awt.*;

class Modulo2_introBordas {

    Modulo2_introBordas() {
        JFrame jf = new JFrame("Bordas");
        jf.setLayout(new FlowLayout());
        jf.setSize(280, 90);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("Line border");
        jl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel jl2 = new JLabel("Etched border");
        jl2.setBorder(BorderFactory.createEtchedBorder());
        jf.add(jl);
        jf.add(jl2);
        jf.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo2_introBordas();
            }
        });
    }
}
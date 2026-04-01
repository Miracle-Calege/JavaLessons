package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Aula24_KeyBindings  extends JFrame {
    private Action subir,descer,esquerda,direita;//criamos estas variaveis do tipo Action
    private JLabel label;


    public Aula24_KeyBindings(){
        setTitle("KeyBindings");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(420,420);
    setLayout(null);
    label=new JLabel();
    label.setBackground(Color.red);
    label.setBounds(100,100,100,100);
    label.setOpaque(true);
    subir=new subir();//inicializamos as variaveis action com instancia das classes abaixo
    descer=new descer();
    esquerda=new esquerda();
    direita=new direita();





                            //o caracter(UP=seta para cima,poderia ser outro componente como 'w', ou qualquer outro caracter dentro'')   // a accao
    label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"subir");
                             // a accao   //o componente
    label.getActionMap().put("subir",subir);
    label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"descer");
    label.getActionMap().put("descer",descer);
    label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"esquerda");
    label.getActionMap().put("esquerda",esquerda);
    label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"direita");
    label.getActionMap().put("direita",direita);
    // e importante que o segundo argumento do primeiro metodo seja igual ao primeiro do segundo


    add(label);
    setVisible(true);

    }


    //criamos estas classes que estendem abstractAction
    // onde cada actionPerformed desencadeara um
    // a accao

    public class  subir extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);
            //mantera a posicao horizontal da label e subira 10 pixels verticalmente


        }
    }
    public class  descer extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);
            //mantera a posicao horizontal da label e descera 10 pixels verticalmente
        }
    }
    public class  esquerda extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());
            //ira 10 pixels para esquerda e mantera a sua posicao vertical
        }
    }
    public class  direita extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());
            //ira 10 pixels para direita e mantera a sua posicao vertical
        }
    }

    public static void main(String[] args) {
        new Aula24_KeyBindings();
    }





}











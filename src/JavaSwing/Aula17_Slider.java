package JavaSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Aula17_Slider extends JFrame  implements ChangeListener {
    private JLabel label;
    private JSlider slider;
    private JPanel pn;

    public Aula17_Slider(){
    setTitle("Slider");
    setSize(420,420);
    pn=new JPanel();
    label=new JLabel();
    slider=new JSlider(0,100,50);//valor minimo, maximo e inicial
   slider.setPreferredSize(new Dimension(400,200));//colocamos as dimensoes
   slider.setPaintTicks(true);//coloca a graduacao
    slider.setMinorTickSpacing(10);// coloca a menor distancia da graduacao 0-10-20-30
     slider.setPaintTrack(true);
     slider.setMajorTickSpacing(25);//distancia entre as maiores graduacoes 0-25-50-75-100
        slider.setPaintLabels(true);//torna visivel os numeros
        slider.setFont(new Font("MV BOli",Font.PLAIN,15));
        slider.setOrientation(SwingConstants.VERTICAL);//muda a posicao do slider
        label.setText("*c="+slider.getValue());//mostra o valor actual do slider
        slider.addChangeListener(this);//faz com que a accao seja executada
        pn.add(slider);
    pn.add(label);
    add(pn);







    setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("*c="+slider.getValue());//sempre que ajustarmos a temperatura vai mudar na label

    }

    public static void main(String[] args) {
        new Aula17_Slider();
    }
}

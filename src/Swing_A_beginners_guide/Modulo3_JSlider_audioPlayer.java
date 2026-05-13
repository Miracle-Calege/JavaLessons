package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Hashtable;
/*
DecimaFormat->classe usada para formatar numeros
 */
public class Modulo3_JSlider_audioPlayer {// esta classe ficara com as definicoes de audio
    int bass,midrange,treble,balance,volume;

    Modulo3_JSlider_audioPlayer(int b,int m,int t,int bl,int v){
        bass=b;
        midrange=m;
        treble=t;
        balance=bl;
        volume=v;
    }
}

class AudioPlayer implements ChangeListener{
    JLabel labBass,labMidrange,labTreble,labBalance,labVolume,labInfo;
    JSlider slBass,slMidrange,slTreble,slBalance,slVolume;
    JRadioButton preset1,preset2,def;
    JButton store;
    Modulo3_JSlider_audioPlayer[] presets;
    DecimalFormat df;

    AudioPlayer(){
        JFrame jf=new JFrame("Um reprodutor de audio simples");
        jf.setLayout(new FlowLayout());
        jf.setSize(340,520);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        df=new DecimalFormat("+#;-#");
        setupPresets();
        setupSliders();
        setupLabels();
        setupButtons();
        store=new JButton("Guardar definicoes");
        slBass.addChangeListener(this);
        slMidrange.addChangeListener(this);
        slTreble.addChangeListener(this);
        slBalance.addChangeListener(this);
        slVolume.addChangeListener(this);
        store.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(preset1.isSelected())
                    storePreset(presets[1]);
                else if(preset2.isSelected())
                    storePreset(presets[2]);
            }
        });
        def.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPreset(presets[0]);
            }
        });
        preset1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPreset(presets[1]);
            }
        });
        preset2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPreset(presets[2]);
            }
        });
        Container cp=jf.getContentPane();
        cp.add(labBass);
        cp.add(slBass);
        cp.add(labMidrange);
        cp.add(slMidrange);
        cp.add(labTreble);
        cp.add(slTreble);
        cp.add(labBalance);
        cp.add(slBalance);
        cp.add(labVolume);
        cp.add(slVolume);
        cp.add(def);
        cp.add(preset1);
        cp.add(preset2);
        cp.add(store);
        cp.add(new JLabel(""));
        cp.add(labInfo);
        jf.setVisible(true);
    }
public void stateChanged(ChangeEvent e){
        showSettings();

}
void setupSliders() {
    slBass = new JSlider(-10, 10);
    slMidrange = new JSlider(-10, 10);
    slTreble = new JSlider(-10, 10);
    slVolume = new JSlider(0, 10, 0);
    slBalance = new JSlider(-5, 5);

    slBass.setMajorTickSpacing(2);
    slMidrange.setMajorTickSpacing(2);
    slTreble.setMajorTickSpacing(2);
    slVolume.setMajorTickSpacing(1);
    slBalance.setMajorTickSpacing(1);

    slBass.setMinorTickSpacing(1);
    slMidrange.setMinorTickSpacing(1);
    slTreble.setMinorTickSpacing(1);

    Hashtable table = new Hashtable();
    for (int i = -10; i <= 0; i += 2)
        table.put(i, new JLabel("" + i));
    for (int i = 2; i <= 10; i += 2)
        table.put(i, new JLabel("" + i));
    slTreble.setLabelTable(table);
    slMidrange.setLabelTable(table);
    slBass.setLabelTable(table);

    table = new Hashtable();
    table.put(0, new JLabel("Center"));
    table.put(-5, new JLabel("L"));
    table.put(5, new JLabel("R"));
    slBalance.setLabelTable(table);
    slVolume.setLabelTable(slVolume.createStandardLabels(1));
    slBass.setPaintTicks(true);
    slMidrange.setPaintTicks(true);
    slTreble.setPaintTicks(true);
    slVolume.setPaintTicks(true);
    slBalance.setPaintTicks(true);
    slBass.setPaintLabels(true);
    slMidrange.setPaintLabels(true);
    slTreble.setPaintLabels(true);
    slVolume.setPaintLabels(true);
    slBalance.setPaintLabels(true);

    slBass.setSnapToTicks(true);
    slMidrange.setSnapToTicks(true);
    slTreble.setSnapToTicks(true);
    slVolume.setSnapToTicks(true);
    slBalance.setSnapToTicks(true);

    Dimension size = new Dimension(240, 60);
    slBass.setPreferredSize(size);
    slMidrange.setPreferredSize(size);
    slTreble.setPreferredSize(size);
    slVolume.setPreferredSize(size);
    slBalance.setPreferredSize(size);
}
    void setupLabels(){
        labTreble=new JLabel("Treble");
        labMidrange=new JLabel("Midrange");
        labBass=new JLabel("Bass");
        labVolume=new JLabel("Volume");
        labBalance=new JLabel("Balance");
        Dimension labSize=new Dimension(60,25);
        labTreble.setPreferredSize(labSize);
        labMidrange.setPreferredSize(labSize);
        labBass.setPreferredSize(labSize);
        labVolume.setPreferredSize(labSize);
        labBalance.setPreferredSize(labSize);
        labInfo=new JLabel("");
        labInfo.setPreferredSize(new Dimension(110,100));
        showSettings();
    }

void setupButtons(){
        def=new JRadioButton("Definicoes");
        preset1=new JRadioButton("Preset 1");
        preset2=new JRadioButton("Preset 2");
        ButtonGroup bg=new ButtonGroup();
        bg.add(def);
        bg.add(preset1);
        bg.add(preset2);
        def.setSelected(true);
    }

    void showSettings(){
        String bal;
        int b=slBalance.getValue();
        if(b>0)
            bal="Right "+df.format(slBalance.getValue());
        else if (b==0)
            bal="center";
        else
            bal="Left "+df.format(-slBalance.getValue());

        labInfo.setText("<html>Treble: "+df.format(slTreble.getValue())+"<br>Midrange: "+df.format(slMidrange.getValue())+"<br>Base:"+df.format(slBass.getValue())+"<br>Balance: "+bal+"<br>Volume: "+slVolume.getValue());
    }

void setupPresets(){
        presets=new Modulo3_JSlider_audioPlayer[3];
        presets[0]=new Modulo3_JSlider_audioPlayer(0,0,0,0,0);
    presets[1]=new Modulo3_JSlider_audioPlayer(2,-4,7,0,4);
    presets[2]=new Modulo3_JSlider_audioPlayer(3,3,-2,1,7);
}
void storePreset(Modulo3_JSlider_audioPlayer info){
        info.bass=slBass.getValue();
    info.midrange=slMidrange.getValue();
    info.treble=slTreble.getValue();
    info.balance=slBalance.getValue();
    info.volume=slVolume.getValue();
}
void  loadPreset(Modulo3_JSlider_audioPlayer info){
        slBass.setValue(info.bass);
    slMidrange.setValue(info.midrange);
    slTreble.setValue(info.treble);
    slBalance.setValue(info.balance);
    slVolume.setValue(info.volume);
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AudioPlayer();
            }
        });

    }


    }




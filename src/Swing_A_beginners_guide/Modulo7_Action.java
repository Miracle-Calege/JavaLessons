package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
Action-> é um objecto que pode conter accelerator,mnemonnic,nome,icon,toolTip,etc. É ideal usar quando queremos que itens diferentes
executem as mesmas accoes sem necessidade de duplicar o codigo.
Action herda do ActionListener por isso vai implementar o metodo actionPerformed()

 *********************************Metodos**********************************
 addPropertyChangeListener(PropertyChangeListener pcl)->adiciona o changeListener especificado pcl
 getValue(String key)-> retorna a referencia do key
 isEnabled()->retorna true se a accao estiver activa e falso caso contrario
 putValue(String key,Object val)->inicializa  o objecto val ao propriedade especificada por key
removePropertyChangeListener(PropertyChangeListener pcl)->remove o changeListener
setEnabled(boolean val)->activa a action(true) e desactiva(false)

********************************Keys********************************
 ACCELERATOR_KEY->representa o accelarator
 MNEMONIC_KEY->representa um mnemonic
 SHORT_DESCRIPTION->representa o tooltip
 mais keys na tabela 7-9 da pagina 338

 **********************Constructores AbstractAction*********************
 AbstractAction()->cria um objecto
 AbstractAction(String nome)->cria um objecto com o nome
 AbstractAction(String nome, Icon image)->cria um objecto com o nome e icon

***************************Criando um Action*******************
1.Criar uma classe que vai estender do AbstractAction
2.Cria um constructor onde passaremos como argumentos todos elementos que queremos no action(lembrando que AbstractAction tem seu constructores)
3.usamos o metodo putValue(key,object)-> para criar o objecto passando a key e o comando

NB:O action e suportado pelo:JToolBar,JMenultem,JPopupMenu,JButton, JRadioButton,JCheckBox.
JRadioButtonMenultem and JCheckBoxMenultem

Para o caso do JToolBar usamos o metodo add(Action act) e passamos como argumento o objecto Action porque Toolbar nao tem um constructor que leva Action como argumento
 */

public class Modulo7_Action implements ActionListener {
    JLabel lab;
    JMenuBar jmb;
    JToolBar jtb;
    JPopupMenu jpu;
    DebugAction setAct;
    DebugAction clearAct;
    DebugAction resumeAct;

    Modulo7_Action(){
        JFrame jf=new JFrame("Menu demo");
        jf.setSize(360,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        jmb=new JMenuBar();
        makeFileMenu();
        makeActions();
        makeToolBar();
        makeOptionsMenu();
        makeHelpMenu();
        makeEditPUMenu();
        jf.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger())
                    jpu.show(e.getComponent(),e.getX(),e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger())
                    jpu.show(e.getComponent(),e.getX(),e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jf.add(lab, SwingConstants.CENTER);
        jf.add(jtb, BorderLayout.NORTH);
        jf.setJMenuBar(jmb);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comsStr=e.getActionCommand();
        if (comsStr.equals("Exit")) System.exit(0);
        lab.setText(comsStr+" Selected");
    }
    class DebugAction extends AbstractAction{

        public DebugAction(String nome,Icon image,int mnem,int accel,String tip){
            super(nome,image);
            putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY,mnem);
            putValue(SHORT_DESCRIPTION,tip);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String comStr=e.getActionCommand();
            lab.setText(comStr+" Selected");
            if (comStr.equals("Set Breakpoint")){
                clearAct.setEnabled(true);
                setAct.setEnabled(false);
            }else if(comStr.equals("Clear Breakpoint")){
                clearAct.setEnabled(false);
                setAct.setEnabled(true);
            }
        }
    }
    void makeFileMenu(){
        JMenu file=new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        JMenuItem open=new JMenuItem("Open",KeyEvent.VK_O);
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
        JMenuItem close=new JMenuItem("Close",KeyEvent.VK_C);
        close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_DOWN_MASK));
        JMenuItem save=new JMenuItem("Save",KeyEvent.VK_S);
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
        JMenuItem exit=new JMenuItem("Exit",KeyEvent.VK_E);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK));
        file.add(open);
        file.add(close);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        jmb.add(file);
        open.addActionListener(this);
        close.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
    }
    void makeOptionsMenu(){
        JMenu options=new JMenu("Options");
        JMenu colors=new JMenu("Colors");
        JCheckBoxMenuItem red=new JCheckBoxMenuItem("Red");//criamos um JCheckBoxMenuItem de nome red
        JCheckBoxMenuItem green=new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem blue=new JCheckBoxMenuItem("Blue");
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        options.add(colors);
        JMenu priority=new JMenu("Priority");
        JRadioButtonMenuItem high=new JRadioButtonMenuItem("High",true);//criamos um JRadioButtonMenuItem com o texto associado e marcado
        JRadioButtonMenuItem low=new JRadioButtonMenuItem("Low");
        priority.add(high);
        priority.add(low);
        options.add(priority);
        ButtonGroup group=new ButtonGroup();//criamos um buttongroup e depois adicionamos os JRadioButtonMenuItem
        group.add(high);
        group.add(low);
        JMenu debug=new JMenu("debug");
        JMenuItem set=new JMenuItem(setAct);
        JMenuItem clear=new JMenuItem(clearAct);
        JMenuItem resume=new JMenuItem(resumeAct);
        debug.add(set);
        debug.add(clear);
        debug.add(resume);
        options.add(debug);
        JMenuItem reset=new JMenuItem("Reset");
        options.addSeparator();
        options.add(reset);
        jmb.add(options);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        high.addActionListener(this);
        low.addActionListener(this);
        reset.addActionListener(this);
    }
    void makeHelpMenu(){
        JMenu help=new JMenu("Help");
        ImageIcon icon1=new ImageIcon("/home/miracle-calege/Downloads/fly.png");
        JMenuItem about=new JMenuItem("About",icon1);
        about.setToolTipText("Info about the MenuDemo program");
        help.add(about);
        jmb.add(help);
        about.addActionListener(this);
    }
    void makeActions(){
        ImageIcon icon2=new ImageIcon("/home/miracle-calege/Downloads/cab.png");
        ImageIcon icon3=new ImageIcon("/home/miracle-calege/Downloads/profile.png");
        ImageIcon icon4=new ImageIcon("/home/miracle-calege/Downloads/bussiness-man.png");
        setAct=new DebugAction("Set Breakpoint",icon2,KeyEvent.VK_S,KeyEvent.VK_B,"Set a breakpoint");
        clearAct=new DebugAction("Clear Breakpoint",icon3,KeyEvent.VK_C,KeyEvent.VK_L,"clear a breakpoint");
        setAct=new DebugAction("Set Breakpoint",icon4,KeyEvent.VK_R,KeyEvent.VK_R,"Resume execution after breakpoint");
        clearAct.setEnabled(false);
    }
    void makeToolBar(){
        JButton set=new JButton(setAct);
        JButton clear=new JButton(clearAct);
        JButton resume=new JButton(resumeAct);
        jtb=new JToolBar("Breakpoints");
        jtb.add(set);
        jtb.add(clear);
        jtb.add(resume);
    }

    void makeEditPUMenu(){
        jpu=new JPopupMenu();
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        jpu.add(cut);
        jpu.add(copy);
        jpu.add(paste);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo7_Action();
            }
        });
    }
}

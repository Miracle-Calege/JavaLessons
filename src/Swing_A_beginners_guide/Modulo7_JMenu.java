package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
JMenuBar-> e um objecto onde sao dispostos os menus
JMenu-> e o menu propriamente dito
JMenuItem-> e o objecto que contido no JMenu
JCheckBoxMenuItem->e um menu item do tipo checkBox
JRadioButtonMenuItem->e um radio button do tipo menu item
JSeparator->um separador visual entre os itens do menu
JPopupMenu->e um menu activado tipicamente pelo click do botao direito do mouse

*********************Eventos que podem ser gerados pelo menus*********************
MenuEvent
MenuKeyEvent
MenuDragMouseEvent
PopupMenuEvent

 ***********************************Metodos do JMenuBar**************************
 add(JMenu menu)->adiciona o JMenu ao JMenuBar(os menu sao colocados da esquerda para a direita na ordem que foram adicionados)
 add(JMenu menu,int idx)-> adiciona o menu no indice especificado(a contagem dos indices inicia por 0)
 remove(JMenu menu)-> remove o menu especificado da menu bar
 remove(int idx)-> remove o JMenu no indice especificado
 getMenuCount()->retorna o numero de elementos no menu bar
 getSubElements()->retorna um array de referencias aos menus na barra
 isSelected()->determina se um menu foi selecionado
 setJMenuBar(JMenuBar bar)-> e o metodo usado para adicionar o menu bar a frame(usamos este metodo depois de acrescentar todos os itens ao menubar)

  *************************Constructores JMenu*******************************
 JMenu()->cria um JMenu sem nome
 JMenu(String nome)->cria um menu com o titulo/nome passado como argumento
 JMenu(String nome,boolean tearOff)->cria um menu com o texto especificado e determina se o menu vai ser flutuante
 JMenu(Action action)->cria um menu com uma determinada accao


 ***********************************Metodos do JMenu**************************
add(JMenuItem item)-> adiciona o menuitem no menu
add(JMenuItem item,int idx)-> adiciona o menuitem na posicao especifica
addSeparator()-> adiciona um objecto do tipo separator ao menu
insertSeparator(int idx)-> insere o separator numa posicao especifica
remove(JMenuItem item)->remove o menuitem
remove(int idx)-> remove o menuitem no indice
getMenuComponentMenu()-> retorna a quantidade de menuitens no menu
getMenuComponents()-> retorna um array de menuitens no menu

***********************************Constructores JMenuItem*****************************
JMenuItem()->cria um menuItem sem nome
JMenuItem(String nome)-> cria um menuItem com o texto especificado
JMenuItem(Icon image)-> cria um menuItem com o icone especificado
JMenuItem(String nome,Icon image)->cria um menuItem com o nome e icon especificados
JMenuItem(String nome,int mnem)-> cria um menuItem com o nome e mnemonic especificado
JMenuItem(Action action)-> cria um menuItem com a accao

**************************Metodos do JMenuItem*******************************
NB:O menu extende da classe AbstractButton entao seus metodos tambem podem ser usados no menu

setEnabled(boolean enable)->activa(true) e inactiva(false) o menuItem

NB:O action command string associada ao evento sera por defeito o nome da selecao/item
 */
public class Modulo7_JMenu implements ActionListener {
    JLabel lab;

    Modulo7_JMenu(){
        JFrame jf=new JFrame("Menu demo");
        jf.setLayout(new FlowLayout());
        jf.setSize(220,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab=new JLabel();
        JMenuBar jmb=new JMenuBar();//criamos um JMenuBar
        JMenu file=new JMenu("File");//criamos um JMenu com o texto "File"
        JMenuItem open=new JMenuItem("Open");//cria um menuItem com o texto "Open"
        JMenuItem close=new JMenuItem("Close");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem exit=new JMenuItem("Exit");
        file.add(open);//adicionamos o JMenuItem open ao JMenu file
        file.add(close);
        file.add(save);
        file.addSeparator();//adicionamos um Separator entre o JMenuItem save e exit
        file.add(exit);
        jmb.add(file);//adicionamos o JMenu file ao JMenuBar
        JMenu options=new JMenu("Options");
        JMenu colors=new JMenu("Colors");
        JMenuItem red=new JMenuItem("Red");
        JMenuItem green=new JMenuItem("Green");
        JMenuItem blue=new JMenuItem("Blue");
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        options.add(colors);//adicionamos o JMenu colors ao JMenu options
        JMenu priority=new JMenu("Priority");
        JMenuItem high=new JMenuItem("High");
        JMenuItem low=new JMenuItem("Low");
        priority.add(high);
        priority.add(low);
        options.add(priority);
        JMenuItem reset=new JMenuItem("Reset");
        options.addSeparator();
        options.add(reset);
        jmb.add(options);
        JMenu help=new JMenu("Help");
        JMenuItem about=new JMenuItem("About");
        help.add(about);
        jmb.add(help);
        open.addActionListener(this);
        close.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        high.addActionListener(this);
        low.addActionListener(this);
        reset.addActionListener(this);
        about.addActionListener(this);
        jf.add(lab);
        jf.setJMenuBar(jmb);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comStr=e.getActionCommand();
        if(comStr.equals("Exit")) System.exit(0);//se o actioncommando for igual a Exit o programa vai fechar
        lab.setText(comStr+" Selected");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo7_JMenu();
            }
        });
    }
}

package Swing_A_beginners_guide;

import javax.swing.*;
import java.awt.*;

/*
Constructores:
JTabbedPane()->cria uma tabbed o pane que ficam no topo do controle
JTabbedPane(int where)->cria uma tab e determina onde ela deve ficar(por causa do argumento).usamos JTabbedPane/SwingConstants.TOP/LEFT/RIGHT/BOTTOM
 JTabbedPane(int where,int org)->cria uma tab,determina onde ela deve ficar e determina o seu layout(policy).JTabbedPane/SwingConstants.WRAP_TAB_LAYOUT/SCROLL_TAB_LAYOUT
 WRAP_TAB_LAYOUT->uma tab em cima da outra
 SCROLL_TAB_LAYOUT-> deixa as tab numa unica linha.Quando o tamanho da frame e reduzido um JScrollBar aparece para podermos navegar entre as tabs
 JTabbedPane gera uma change event que e gerido automaticamente pelo java(geralmente nao ha necessidade de geri-lo manualmente).
 addTab(String nome, Component com)-> cria um tab com um nome e o componente.
  addTab(String nome, Icon icon, Component com)-> cria um tab com um nome,icone e o componente.se eu quiser so usar o icone sem a mensagem coloco null no lugar da string/nome
   addTab(String nome, Icon icon, Component com,String tooltip)-> cria um tab com um nome,icone, componente e o tooltip.
 insertTab(String nome,Icon image,Component comp,String tooltip,int idx)->cria um tab com nome,icon,componente,tooltip e adiciona no indice especificado
 remove(int idx)-> remove o tab no respectivo indice
 NB:Geralmente o componente de uma tab e um painel.

 Metodos complementares:
 setForegroundAt()-> muda a cor do foreground da tab
 setBackgroundAt()-> muda a cor do background da tab
 setMnemonicAt()-> adiciona um mnemonic a tab
 setSelectedIndex()-> colocamos como selecionado uma determinada tab
 setEnabledAt()->coloca como activado ou desactivado uma determinada tab
 isEnableAt()-> retorna o estado da tab(activo/desactivado)
 setDisableIconAt()->permite colocar um icon para as tab desactivadas.
 NB:Os metodos acima sao acessados via indice
 */
public class Modulo4_JTabbedPane {

    Modulo4_JTabbedPane(){
        JFrame jf=new JFrame("JTabbedPane");
        jf.setSize(380,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tb=new JTabbedPane();//criamos uma tabbed pane
        //JTabbedPane tb=new JTabbedPane(SwingConstants.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
        tb.addTab("Ficheiro",new JLabel("Este e um tab gestor de ficheiro."));//criamos uma tab com titulo, e o componente
        tb.addTab("Performance",new JLabel("Este e um tab performance."));
        tb.addTab("report",new JLabel("Este e um tab report."));
        //tb.addTab("report",null,new JLabel("Este e um tab report."),"Tooltip");
        tb.addTab("Customizacao",new JLabel("Este e um tab customizacao."));
        //tb.insertTab("tab",null,new JLabel("Nova tab"),"tool",2);
        jf.add(tb);//adicionamos o tabbed pane a frame
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo4_JTabbedPane();
            }
        });
    }
}

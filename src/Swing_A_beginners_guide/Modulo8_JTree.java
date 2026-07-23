package Swing_A_beginners_guide;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.util.jar.JarFile;

/*
***********************************Constructores**********************
* JTree()->cria um JTree que contem dado de amostra
* JTree(TreeNode tn)->cria uma tree que tem tn como raiz
* JTree(TreeNode tn,boolean checkLeaf)->cria uma tree com a raiz tn e true considerada as nós com filhos desabilitados folhas
* JTree(HashTable<?,?>ht)
* * JTree(Vector<?>v)
* * JTree(Object obj[])
*  JTree(TreeModel tm)
*
* NB:JTree nao sao editivaies por defeito, devemos usar o metodo setEditable(true).


 */
public class Modulo8_JTree {

    Modulo8_JTree(){
        JFrame jf=new JFrame("Tree");
        jf.setSize(200,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //criamos um DefaultMutableTreeNode
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Food");
        DefaultMutableTreeNode fruit=new DefaultMutableTreeNode("Fruta");
        root.add(fruit);
        DefaultMutableTreeNode apples=new DefaultMutableTreeNode("Apples");
        //adicionamos DefaultMutableTreeNode ao apples,fruit,pears,root
        apples.add(new DefaultMutableTreeNode("Jonathan"));
        apples.add(new DefaultMutableTreeNode("Winesap"));
        DefaultMutableTreeNode pears=new DefaultMutableTreeNode("Pears");
        fruit.add(pears);
        pears.add(new DefaultMutableTreeNode("Bartlett"));
        DefaultMutableTreeNode veg=new DefaultMutableTreeNode("Vegetables");
        root.add(veg);
        veg.add(new DefaultMutableTreeNode("Beans"));
        veg.add(new DefaultMutableTreeNode("Corn"));
        veg.add(new DefaultMutableTreeNode("Potatoes"));
        veg.add(new DefaultMutableTreeNode("Rice"));
        //criamos uma JTree e passamos root como argumento
        JTree jTree=new JTree(root);
        //colocamos a JTree num JScrollPane
        JScrollPane js=new JScrollPane(jTree);
        jf.add(js, BorderLayout.CENTER);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo8_JTree();
            }
        });
    }
}

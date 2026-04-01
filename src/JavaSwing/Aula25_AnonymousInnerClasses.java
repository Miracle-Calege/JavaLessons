package JavaSwing;

import javax.swing.*;

public class Aula25_AnonymousInnerClasses extends JFrame {
    public void Welcome() {
        System.out.println("Hello world");
    }


    public static void main(String[] args) {
        // nome da classe nome do objecto=new nome da classe(){
        /* o metodo a sobreescrever(){
            nova acca

        };
    */

        Aula25_AnonymousInnerClasses gret = new Aula25_AnonymousInnerClasses() {

            @Override
            public void Welcome() {
                System.out.println("Overide");
            }
        };
        Aula25_AnonymousInnerClasses gret2 = new Aula25_AnonymousInnerClasses();
        gret.Welcome();//o output sera overide
       gret2.Welcome();//o output sera hello world
    }
}




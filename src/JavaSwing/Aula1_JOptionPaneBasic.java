package JavaSwing;

import javax.swing.*;

public class Aula1_JOptionPaneBasic {
    public static void main(String[]args) {

        /* cria uma tela com a mensagem entre o construtor, com o textfield para a entrada de dados e dois botoes ok
        e  cancel o dados de entrada ficara na variavel*/
        String name= JOptionPane.showInputDialog("Insira o seu nome");
        // exibe o dados que estao na variavel name
        JOptionPane.showMessageDialog(null,"PCA:"+name);

    }
}


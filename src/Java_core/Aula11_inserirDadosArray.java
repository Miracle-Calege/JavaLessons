package Java_core;

import java.util.Scanner;

public class Aula11_inserirDadosArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] comidas=new String[3];

        for(int i=0;i<comidas.length;i++){
            System.out.print("Insira a comida:");
            comidas[i]=sc.nextLine();//apenas usando uma estrutura de repeticao acessaremos cada indice e com o auxilio do scanner inicializaremos cada indice com um valor
        }

        for(String comida:comidas){
            System.out.println(comida);

        }
        sc.close();
    }

}

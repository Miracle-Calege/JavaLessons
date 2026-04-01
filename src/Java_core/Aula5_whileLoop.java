package Java_core;

import java.util.Scanner;

public class Aula5_whileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* While(condicao){accao} -> verifica e depois executa
        do{accao}while(condicao);->executa pelo menos uma vez e depois verifica
         */

        int idade=0;// nossa variavel controladora

        System.out.println("Insira a sua idade");
        idade= sc.nextInt();

//        while (idade<0){// a linha 16 e 17 serao executada sempre que encontrar uma idade<0, caso idade>0 nao entrara no loop
//            System.out.println("Insira uma  idade validade");
//            idade= sc.nextInt();
//        }

        do {//o codigo da linha 21 e 22 serao executados mesmo eu tendo  colocado uma idade valida na linha 12 e 13
            System.out.println("Insira uma  idade validade");
            idade = sc.nextInt();
        }while (idade<0);
        System.out.printf("Tens %d anos de idade\n",idade);


        sc.close();
    }

}

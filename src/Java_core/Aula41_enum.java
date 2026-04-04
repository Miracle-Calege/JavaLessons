package Java_core;

import java.util.Scanner;

public class Aula41_enum {
    public static void main(String[] args) {
    //enum são muitos eficientes para switch
        // instanciando um enum: Nome do enum(classe) nome do objecto=Nome do enum(classe).nome do enum
//
        Scanner sc=new Scanner(System.in);
        //Dias dia=Dias.DOMINGO;
        System.out.println("Insira um dia de semana");
        String resposta=sc.next().toUpperCase();
//
//        System.out.println(dia);

        Dias dia=Dias.valueOf(resposta);//valueof(string) converteu em enum

        switch (dia){
            case SEGUNDA,TERCA,QUARTA,QUINTA,SEXTA->
                    System.out.println("É meio de semana");
            case SABADO,DOMINGO -> System.out.println("É fim de semana");

        }
        sc.close();


    }

}

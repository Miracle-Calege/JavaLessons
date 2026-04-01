package Java_core;

import java.util.Scanner;

public class Aula3_enhancedSwitch {
    public static void main(String[] args) {

        // enhanced switch versao melhorada do switch, no fim de cada case nao precisamos colocar break
        /*
        estrutura

        int num;
        switch(num){ //num sera o valor que encontraremos depois da palavra case

        case 1 -> acontecimento;
        case 2-> acontecimento;
        default -> acontecimento //usado quando nehuma das condicoes acima e satisfeita

        }
         */

        Scanner sc=new Scanner(System.in);

        System.out.print("Insira o dia da semana\n");
        String dia=sc.next();

        switch (dia){
/* inves de imprimirmos a mesma coisa em varios cases, pode colocar em um apenas
            case "Segunda"-> System.out.println("Dia laboral");
            case "terca"-> System.out.println("Dia laboral");
            case "quarta"-> System.out.println("Dia laboral");
            case "quinta"-> System.out.println("Dia laboral");
            case "sexta"-> System.out.println("Dia laboral");
             case "sabado"-> System.out.println("fim de semana");
            case "domingo"-> System.out.println("fim de semana");

 */
            case "segunda","terca","quarta","quinta","sexta"->System.out.println("Dia laboral");
            case "sabado","domingo"-> System.out.println("fim de semana");// case dia1,dia2,dia3,...-> accao

            default-> System.out.println("esse dia nao existe");

        }
        sc.close();

    }
}

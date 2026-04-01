package Java_core;

import java.util.Scanner;

public class Aula27_runTimePolimorfismo {
    public static void main(String[] args) {
        /* e como um objecto se identifica na hora da execucao
         */
        Scanner sc = new Scanner(System.in);
        Animal2 animal;
        System.out.println("Cao ou gato? (1=cao, 2=gato)");
        int x = sc.nextInt();
        if (x==1) {
            animal=new Cao2();
            animal.falar();
        }else if(x==2){
            animal=new Gato1();
            animal.falar();
        }
    }
    }


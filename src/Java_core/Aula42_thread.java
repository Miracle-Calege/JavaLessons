package Java_core;

import java.util.Scanner;

public class Aula42_thread {
    public static void main(String[] args) {
        //threading-> permite que o progama execute vairas tarefas simultaneamente
    /*Para criar uma thread:
    1.Criou uma classe que implementa a interface Runnable
    2.Sobrescrevo o método run
    //Na classe main
    3.Criou uma instância da classe criada no ponto 1
    4.criou uma instância da classe Thread que levará como argumento a instância do ponto 3.
    5.uso a instância da classe Thread para chamar o método  start()

     */
        Scanner sc=new Scanner(System.in);

        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);
        thread.setDaemon(true);//mas com que a thread secundaria termine assim que a main thread terminar.NB:Deve ser colocado sempre antes do metodo start()
        thread.start();//este método inicia a execução do thread


        System.out.println("Tem 5 segundos para inserir o seu nome");
        System.out.print("Insira o seu nome:");
        String nome =sc.nextLine();
        System.out.println("Olá "+nome);

        sc.close();

    }

}

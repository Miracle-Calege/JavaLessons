package Java_core;

public class Aula43_MultiThreading {
    public static void main(String[] args) {

        /*Multithreading-> permite que um programa execute múltiplos thread de forma concorrente
         */

        //MyThread2 thread2=new MyThread2();
        Thread thread1=new Thread(new MyThread2());//anonymous object
        Thread thread2=new Thread(new MyThread2());
        System.out.println("Inicia");
        thread1.start();
        thread2.start();
        //join()-> bloqueia o thread actual até que a thread que foi chamada termine a execução(thread1,thread2).

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Interrompido");

        }
        System.out.println("Fim");

    }
}

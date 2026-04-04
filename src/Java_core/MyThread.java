package Java_core;

public class MyThread implements Runnable{

    @Override
    public void run() {//fazemos overide do run porque o metodo start() chama implicitamente o metodo run
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);//sleep(milissegundos)-> usado para pausar a thread.
            }catch (InterruptedException e){
                System.out.println("Thread interrompida");

            }
            if(i==5){
                System.out.println("Tempo esgotado");
                System.exit(0);//encerra todo programa
            }
        }
    }
}

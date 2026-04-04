package Java_core;

public class MyThread2  implements  Runnable{

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+ i);//Thread.currentThread().getName()-> retorna o nome da thread
            }catch (InterruptedException e){
                System.out.println("The thread foi interrompida");
            }

        }
    }
}

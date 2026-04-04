package Java_core;

import java.util.Timer;
import java.util.TimerTask;

public class Aula38_timerTask {
    public static void main(String[] args) {
        /*Timer->agenda tarefas para um determinado período

         TimerTask->representa a tarefa que será executada pelo Timer


         */


        Timer timer = new Timer();//criamos um objecto time
        TimerTask task = new TimerTask() {

            int count=3;//criaremos uma variavel contadora que servira como um escape.
            @Override
            public void run() { //sobreescrevemos o método run. A instrução abaixo será executada após o timer terminar a contagem
                System.out.println("Olá");
                count-=1;
                if(count<=0){
                    System.out.println("Paramos por aqui");
                    timer.cancel();//para o task

                }
            }
        };

        timer.schedule(task, 3000,1000);//o metodo schedule(tarefa,tempo) leva como argumento a tarefa, e quanto tempo vai levar para executar, periodicidade
        //NB:O tempo sempre está em milissegundos
    }


}

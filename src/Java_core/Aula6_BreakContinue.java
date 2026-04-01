package Java_core;

public class Aula6_BreakContinue {
    public static void main(String[] args) {
        //break->sai do loop
        //continue->salta uma iteracao do loop

        for(int i=0;i<10;i++){
            if(i==5){//quando o i for igual a 5 o programa vai sair do loop e nunca alcancaremos a linha 10
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<10;i++){
            if(i==5){//quando o i for igual a 5 o programa vai saltar o 5
                continue;
            }
            System.out.print(i+" ");

        }
    }
}

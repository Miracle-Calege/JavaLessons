package Head_First_Java_3rd;

public class Cap5_casting_for {

    /*
    for e uma estrutura de repeticao onde ja e conhecida a quantidade de repeticoes que queremos
    estrutura:

    for(valor inicial,condicao de parada, incremento){
    instrucao
    }

    for-each-> ideal se quisermos iterar um array
    estrutura:

    for(tipoDadoArray variavel:nomeArray){
    instrucao
    }
    Math.random()->retorna valores aleatorios entre [0,1[. Math e o nome da classe e random() o metodo dessa classe. 0,5 esta nesse intervalo logo retorna valores do tipo double

        Casting-> e o processo de conversao de uma variavel de um tipo de dado para o outro.O processo e funcional de um tipo de dado maior(com mais bits) para um menor(com menos bits)
     ex: Um long pode ser convertido para um int, mas nao vice-versa
     Estrutura:

     tipoDado var=(tipoDado) variavel



     */

    public static void main(String[] args) {
        for(byte i=0;i<10;i++){//O contado inicia no zero, deve ser menor que dez e incrementa uma unidade.Como trata-se de contagem os valores devem ser do tipo inteiro(short,byte,int)
            System.out.print(i+" ");

        }
        System.out.println();
        int [] numeros={1,2,3,4,5};

        for (int num:numeros){
            System.out.print(num+" ");
        }
        System.out.println();
        double val=Math.random()*5;
        int cast=(int) (val);//multiplicando o random por 5 estamos a criar um intervalo de [0,5[
        System.out.println("Antes do casting:"+val);
        System.out.println("Depois do casting: "+cast);
    }


}

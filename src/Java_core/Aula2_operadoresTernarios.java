package Java_core;

public class Aula2_operadoresTernarios {
    public static void main(String[] args) {
        //operador ternario-> versao simplificada de if-else quando nao temos varias condicoes
        //estrutura: variavel=(condicao) ? acontece isto se for verdade:acontece isto se for falsa;

        int nota=15;

        String passar= (nota>=10)? "Passou": "chumbou";
        System.out.println(passar);

        int numero=4;
        String par= (numero%2==0)? "par" :"impar";
        System.out.println(par);

        int hora=13;
        String horas=(hora>=12)? hora+"PM" : hora+"AM";
        System.out.println(horas);

        int renda=60000;

        double impostos=(renda>=40000)? 0.25 :0.15;
        System.out.printf("O remanesceste e %.2f",renda-renda*impostos);






    }
}

package Java_core;

public class Aula4_operadoresLogicos {
    public static void main(String[] args) {
        // &&-> precisa que todas as condicoes sejam verdadeiras para que a accao seja executada
        // !!-> so precisa que uma condicao seja verdadeira para que a accao seja executada
        // !-> modifica o valor logico de uma variavel do tipo boolean


        double tempo=20;
        boolean ensolarado=false;

        if(tempo>=18 && tempo<=28 && ensolarado){
            System.out.println("A temperatura esta boa");// esse accao so sera executada se as duas condicoes acima forem verdadeiras
            System.out.println("e esta ensolarado");
        }else if (tempo>=18 && tempo<=28 && !ensolarado){
            System.out.println("A temperatura esta boa");
            System.out.println("e um dia nublado");
        }else if(tempo>30 || tempo <0){
            System.out.println("A temperatura esta ma");

        }
    }
}

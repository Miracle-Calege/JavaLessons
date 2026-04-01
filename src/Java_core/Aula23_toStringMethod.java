package Java_core;

public class Aula23_toStringMethod {
    public static void main(String[] args) {

        Car car=new Car("Ford","Mustang",2025,"Vermelho");

        //System.out.println(car);esta impressao nos dara um hashcode(identificador do objecto) e nao os atributos do carro
        System.out.println(car);//agora depois do override,poderemos visualizar os nossos atributos
        /*
        quando imprimimos um objecto internamente o java chama o toString()
         */
    }
}

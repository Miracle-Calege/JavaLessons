package Java_core;

public class Aula30_composition {
    public static void main(String[] args) {
/*Diferentemente de aggregation, aqui ambos objectos dependem um do outro para existir
se apagarmos o objecto carro automaticamente o motor sera deletado
 */

        Car2 car=new Car2("Corvette",2025,"v8");
        System.out.println(car.modelo);
        System.out.println(car.ano);
        System.out.println(car.motor.tipo);
        car.start();
    }
}

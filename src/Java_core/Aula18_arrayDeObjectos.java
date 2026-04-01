package Java_core;

public class Aula18_arrayDeObjectos {
    public static void main(String[] args) {


        Mota mota1 = new Mota("Yamaha", "Azul");
        Mota mota2 = new Mota("Honda", "vermelho");
        Mota mota3 = new Mota("Suzuki", "Amarela");

        Mota[] motas = {mota1, mota2, mota3};//um array de objecto obedece a mesma forma de criacao de um array comum so que inves de usarmos como tipo de dado o tipo primitivo usamos a classe dos objectos
        for(Mota mota:motas){
            mota.conduzir();
        }
    }
}

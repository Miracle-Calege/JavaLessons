package Java_core;

public class Aula25_interface {
    public static void main(String[] args) {
        Coelho coelho=new Coelho();
        Gaviao gaviao=new Gaviao();
        Fish fish=new Fish();

        fish.cacar();
        fish.fugir();
        gaviao.cacar();
        coelho.fugir();

    }

}

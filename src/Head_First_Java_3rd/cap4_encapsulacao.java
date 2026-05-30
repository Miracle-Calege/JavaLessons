package Head_First_Java_3rd;

public class cap4_encapsulacao {
    public static void main(String[] args) {
        GoodDog one=new GoodDog();
        one.setTamanho(70);
        GoodDog two=new GoodDog();
        two.setTamanho(8);
        System.out.println("objecto one: "+one.getTamanho());
        System.out.println("objecto two: "+two.getTamanho());
        one.latir();
        two.latir();
    }
}

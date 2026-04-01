package Java_core;

public class Fish implements Presa, Predador {//uma classe pode implementar uma ou mais interface:implements interface1,interface2,interface3,etc
    //apos a palavra implements colocamos os nomes das interface separando-os por virgulas

    @Override
    public void fugir(){
        System.out.println("O peixe esta a nadar para longe");
    }

    @Override
    public void cacar(){
        System.out.println("O peixe esta a cacar");
    }
}

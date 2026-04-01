package Java_core;

public class Motor {
    String tipo;

    public Motor(String tipo){
        this.tipo=tipo;
    }

    public void start(){
        System.out.println("O motor "+this.tipo+" "+" foi acionado");
    }


}

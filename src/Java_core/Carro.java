package Java_core;

public class Carro {

    String marca="Ford";
    String modelo="Mustang";
    int ano=2025;
    double preco=58000.99;
    boolean ligado=false;

    void start(){
        ligado=true;
        System.out.println("Ligaste o motor");
    }
    void parar(){
        ligado=false;
        System.out.println("Desligaste o motor");
    }
    void conduzir(){
        System.out.println("Estas a conduzir um "+modelo);
    }
    void travar(){
        System.out.println("Travaste p "+modelo);
    }

}

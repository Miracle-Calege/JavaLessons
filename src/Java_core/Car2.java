package Java_core;

public class Car2 {
    String modelo;
    int ano;
    Motor motor;//objecto

    public Car2(String modelo,int ano,String tipoMotor){
    this.modelo=modelo;
    this.ano=ano;
    this.motor=new Motor(tipoMotor);//inicializamos o objecto Motor passando argumentos para o seu constructor

    }

    public void start(){
        this.motor.start();
        System.out.println("O  carro "+this.modelo+" "+" esta ligado");
    }
}

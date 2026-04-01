package Java_core;

public class Mota {

    String modelo;
    String cor;

    public Mota(String modelo,String cor){
        this.modelo=modelo;
        this.cor=cor;
    }
    void conduzir(){
        System.out.println("Tu conduzes: "+modelo+" " +cor);
    }
}

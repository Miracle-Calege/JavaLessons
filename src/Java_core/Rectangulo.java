package Java_core;

public class Rectangulo extends Forma{

    double largura, comprimento;

    Rectangulo(double largura,double comprimento){
        this.largura=largura;
        this.comprimento=comprimento;
    }
    @Override
    public double area(){
        return largura*comprimento;
    }
}

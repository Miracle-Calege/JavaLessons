package Java_core;

public class Triangulo extends Forma{
    double altura,base;

    Triangulo(double altura,double base){
        this.altura=altura;
        this.base=base;
    }
    @Override
    public double area(){
        return 0.5*base*altura;
    }
}

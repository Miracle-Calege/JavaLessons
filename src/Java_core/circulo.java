package Java_core;

public class circulo extends Forma {
    double raio;
    circulo(double raio){
        this.raio=raio;
    }
    @Override
    public double area(){
        return Math.PI*raio*raio;
    }
}

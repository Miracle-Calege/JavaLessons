package Java_core;

public class Aula24_abstraccao {
    public static void main(String[] args) {
        /*abstraccao-> e usado para definir classes e metodos abstractos
        Este processo consiste em esconder os detalhes da implementacao e exibir apenas os detalhes essenciais
        classes abstractas nao podem ser instanciadas(criar objectos) directamente.Metodos abstractos devem ser implementados(obrigatoriamente) pelas classes que as herdam
        Criar uma classe abstracta-> antes da palavra class colocamos a palavra abstract
        Criar um metodo abstracto-> adicionamos a palavra abstract antes do tipo de dado e inves de terminar por "{}" vai terminar por ";"
         */

        circulo circulo=new circulo(3);
        Triangulo triangulo=new Triangulo(4,5);
        Rectangulo rectangulo=new Rectangulo(6,7);
        System.out.println(circulo.area());
        System.out.println(triangulo.area());
        System.out.println(rectangulo.area());
    }
}

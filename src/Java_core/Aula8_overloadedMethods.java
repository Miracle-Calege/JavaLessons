package Java_core;

public class Aula8_overloadedMethods {
    public static void main(String[] args) {
        //overloadedMethods->metodos com o mesmo nome , mas com parametros com assinaturas diferentes(geralmente a quantidade deparametros e diferente)
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));
    }

    static double add(double a,double b){
        return a+b;
    }
    static double add(double a,double b,double c){
        return a+b+c;
    }
    static double add(double a,double b,double c,double d){
        return a+b+c+d;
    }

}

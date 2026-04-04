package Java_core;

public class Aula37_anonymousClass {
    public static void main(String[] args) {

        /*
        E uma classe que nao tem nome e nao pode ser reutilizada.
        como criar:

        Classe nome do object=new Classe(){

        instruções/métodos

        };

        {}-> indica que é uma classe e devem terminar por ";"

         */

        Snop snop1=new Snop();
        Snop snop2=new Snop(){
            @Override
            void speak() {//para modificar este metodo seria necessário criar uma outra classe que estenderia a classe Snop
                System.out.println("Este cao fala");
            }
        };
        snop1.speak();
        snop2.speak();
    }
}

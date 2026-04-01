package Java_core;

public class Aula15_OOP {
    public static void main(String[] args) {
        /*objecto->tudo o que pode representar uma entidade do mundo real
        tem atributos(tipos de dados),executa accoes(metodos)
        para criar um objecto-> nome da classe nome a sua escolha=nome da classe();
         */

        Carro carro=new Carro();//criamos um objecto carro

        //carro.ligado=true;//para mudar os valores dos atributos->nome do objecto.atributo=valor;

//        System.out.println(carro.marca);//para acessar os atributo do objecto usamos o nome do objecto.atributo
//        System.out.println(carro.modelo);
//        System.out.println(carro.ano);
//        System.out.println(carro.preco);
        carro.start();//para chamar metodos->nome do objecto.metodo();
     System.out.println(carro.ligado);
     carro.parar();
        System.out.println(carro.ligado);
        carro.conduzir();
        carro.travar();

    }

}

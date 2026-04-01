package Java_core;

public class Aula28_getters_setters {
    public static void main(String[] args) {
        /*getters->tornam os atributos legiveis(quando eles sao private)
          setters->tornam os atributos editaveis(quando eles sao private)
         */

        Carro3 car=new Carro3("Ferrari","Vermelho",100000);

        //System.out.println(car.modelo+" "+car.cor+" "+car.preco);

        System.out.println(car.getModelo()+" "+car.getCor()+" "+car.getPreco());
        car.setModelo("PuroSangue");
        car.setCor("Preto");
        car.setPreco(100000);

        System.out.println(car.getModelo()+" "+car.getCor()+" "+car.getPreco());

    }
}

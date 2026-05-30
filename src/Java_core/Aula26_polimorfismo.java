package Java_core;

public class Aula26_polimorfismo {
    public static void main(String[] args) {
        /*polymorphism=muitas formas
        Objectos podem se identificar como outros objectos
        ex:um cao pode se identificar como cao, como animal, como ser vivo, como organismo
        ou seja, podem ser tratados como objectos da superclasse(classe mae)
         */

        carro car=new carro();
        Bicicleta bike=new Bicicleta();
        Barco barco=new Barco();
        Veiculo ve=new carro();
        ve.ir();
        //ve.correr(); este metodo na vai funcionar pois o veiculo so pode acessar os metodos/variaveis que ele tem em comum com o carro e nao acessa metodo/variaveis exclusivas do carro

//        car.ir();
//        bike.ir();
//        barco.ir();

        Veiculo[] veiculos={car,bike,barco};//car, bike e barco se identificam como veiculos

        for(Veiculo veiculo:veiculos){
            veiculo.ir();
        }
    }
}

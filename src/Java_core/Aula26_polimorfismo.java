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

//        car.ir();
//        bike.ir();
//        barco.ir();

        Veiculo[] veiculos={car,bike,barco};//car, bike e barco se identificam como veiculos

        for(Veiculo veiculo:veiculos){
            veiculo.ir();
        }
    }
}

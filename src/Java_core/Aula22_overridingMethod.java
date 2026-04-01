package Java_core;

public class Aula22_overridingMethod {
    public static void main(String[] args) {

        /*override -> e alterar a assinatura de um determinado metodo herdado para satisfazer a demanda do metodo herdeiro
         e boa pratica colocar @override acima do metodo a ser a ser modificado
         */
        Dog dog=new Dog();
        Cat cat=new Cat();
        Peixe peixe=new Peixe();
        /*
        peixe.mover();
      antes do override exibia :"O animal esta a correr"
         */
        dog.mover();
        cat.mover();
        peixe.mover();
    }
}

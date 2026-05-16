package Head_First_Java_3rd;

public class Dog {
    String nome;

    public static void main(String[] args) {
        Dog dog1=new Dog();//criamos um objecto do tipo Dog cujoa sua referencia/localizacao esta na variavel dog1
        dog1.latir();
        dog1.nome="Bart";

        Dog[]dogs=new Dog[3];//criamos um array que armazena referencia do tipo Dog
        dogs[0]=new Dog();
        dogs[1]=new Dog();
        dogs[2]=dog1;//dogs[2] e dog1 tem uma mesma referencia/localizacao
        dogs[0].nome="Fred";
        dogs[1].nome="Marge";
        System.out.println("O nome do ultimo cao e");
        System.out.println(dogs[2].nome);
        int x=0;
        while (x<dogs.length){
            dogs[x].latir();
            x=x+1;
        }
    }

    public void latir(){
        System.out.println(nome+" ruff!");
    }
    public  void comer(){

    }
    public  void perseguirGato(){

    }
}

package Head_First_Java_3rd;
/*
Constructor é uma instrucao que é executada sempre que criamos/instanciamos um objecto.
Quando fazemos new nomeClasse()-> nomeClasse()-> é um constructor.
Estrutura:
O constructor difere-se de um método porque não tem um retorno(ex:void, int,etc) e sempre deve ter o nome da classe

modificadoracesso nomeClasse(){
instrucao
}

Existem constructores explícitos, aqueles criados pelo programador e implícitos aqueles criados pelo próprio compilador(nao e visível no nosso codigo)

Constructor implícito:

public classe(){
}

NB:O constructor implicito só e criado quando o programador não cria um constructor explícito


NB:O java permite criar um método com o mesmo nome da classe, mas o método diferencia do constructor por causa da componente retorno

A semelhança dos metodos, o constructor pode levar parâmetros/argumentos.
 */
public class Pato {
int tamanho;
//    public Pato(){// sempre que um objecto do tipo pato for criado a mensagem abaixo sera impressa
//        System.out.println("quack");
//    }
    public  Pato(int size){
        System.out.println("Quack");
        tamanho=size;
        System.out.println("O tamanho e:"+tamanho);
    }
}

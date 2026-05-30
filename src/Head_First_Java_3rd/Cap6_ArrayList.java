package Head_First_Java_3rd;

/*
ArrayList-> e uma estrutura de dados dinamica(o seu tamanho aumenta de acordo com a demanda), sem necessidade de definir um tamanho fixo para ela.
 Faz parte de um pacote chamado java.util que pode ser importado chamando:
 import java.util.ArrayList-> deve ser colocado antes do nome da classe

Criacao:

ArrayList<TipoDado> nome=new ArrayList<TipoDado>()

ou

java.util. ArrayList<Objecto> nome=new java.util. ArrayList<Objecto>();

Metodos:
add(E e)-> adiciona elementi no fim da estrutura
remove(int id)-> remove o elemento no indice
remove(Object o)-> remove a primeira ocorrencia do elemento
contains(Object o)->verifica se existe o elemento na lista. true-se existir e false-> se nao existir
isEmpty()-> verifica se a lista esta vazia.true->vazia e false->nao vazia
indexOf(Object o)-> retorna o indice do objecto e -1 caso o objecto nao faca parte da lista
size()->retorna o tamanho da lista
get(int id)-> retorna o elemento nesse indice

 */

public class Cap6_ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Dog> nome = new java.util.ArrayList<Dog>();
        System.out.println(nome.isEmpty());
        for(int i=1;i<=10;i++) {
            nome.add(new Dog());
        }
        System.out.println(nome);
        nome.remove(1);
        System.out.println(nome);


    }

}

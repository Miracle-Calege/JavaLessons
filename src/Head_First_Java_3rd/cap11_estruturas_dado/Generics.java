package Head_First_Java_3rd.cap11_estruturas_dado;

public class Generics {
    /* Generics é uma forma de garantir que as estruturas de dados tenham um tipo próprio, nao tendo que se preocupar
    se uam estrutrura que era suposto só receber objectos do tipo carro também receba objectos do tipo animal.ex; new ArrayList<Song>
    <>-> esta é a representaçao de generics.


    1.Classes genericas.

    public class ArrayList<E> extends AbstractList<E> implements List<E>{}

    NB:Onde <E> é onde colocamos o tipo de dado.Uma vez escolhido o <E>(tipo de dado) todos os métodos da estrutura só aceitarao esse tipo de dado.
    Alem de E também podemos encontrar T ou R.

    ex:List<String>list=new ArrayList<>();

     2.Métodos genéricos.

     public <T extends Animal> void takeThing(ArrayList<T> list)


     NB:Se a classe nao tiver um parametro de tipo (<E>) podemos especificar um para o método. T é um subtipo de Animal(herda Animal ou também pode ser Animal) e recebe um ArrayList que pode ser um subtipo de Animal ou um Animal, ou seja, o argumento pode ser um Arraylist do tipo new ArrayList<Dog>,new ArrayList<Cat> ou new ArrayList<Animal>.

public void takeAnimals(List<? extends Animal> animals)-> faz o mesmo que o que esta em cima faz, mas nao permite adicionar nada
a estrutura animals







     */
}

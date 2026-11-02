package Head_First_Java_3rd.cap8_polimorfismoSerio;

public class Classe_Object {
    /*
    A classe Object é a mae de todas as classes, é a superclasse de tudo.Qualquer classe que nao estende explicitamente uma outra estende implicitamente o Object.

    Alguns metodos da classe Object

    1. equals()-> verifica se 2 objectos sao iguais.Retorna um valor booleano.

    ex: a.equals(c);

    2.getClass()-> retorno a classe pela qual o objecto foi criado.

    c.getClass()

    3.hashCode()=>retorna o código hash do objecto, o seu ID.

    c.hashCode();

    4.toString()->imprime uma mensagem com o nome da classe e alguns números, quando fazemos System.out.println(objecto)

    c.toString();


    NB:O método que estamos a chamar na variavel de referencia deve estar na mesma classe da variavel de referencia.

NB2:Se colocarmos um objecto numa estrutura de dados do tipo Object devemos fazer casting do elemento, pois o elemento sai da estrutura como se fosse do tipo Object.

ex: ArrayList<Object>dogs=new ArrayList<Object>();
Dog d=new Dog();
dogs.add(d);

Dog do=(Dog) dogs.get(0);

    Usamos instanceof para verificar se um objecto é instancia de uma classe(retorna um valor booleano).

    ex: o instanceof Dog


     */
}

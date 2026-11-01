package Head_First_Java_3rd.cap11_estruturasDado;

import Head_First_Java_3rd.cap9_cicloVidaObjecto.Animal;
import Head_First_Java_3rd.cap9_cicloVidaObjecto.Animal2;
import Head_First_Java_3rd.cap9_cicloVidaObjecto.Hippo2;

import java.util.ArrayList;

/*
Generics-> e responsavel por garantir que uma lista guarde/aceite um tipo especifico de dados inves de qualquer tipo de dado/objecto seja aceite.
ex: Sem generics num ArrayList que era suposto so guardar carros poderiamos guardar motas, animais, etc.
<>-> referece-se a generics.
****************************ArrayList*************************************
public class ArrayList<E> extends AbstractList<E> implements List<E>:classe Arraylist

Se a classe e definida do tipo E o metodo add(E objecto) so vai adicionar objecto do mesmo tipo.

E-> e o place holder para o tipo de dado/Objecto(ex:Integer,Object), ou seja, é onde e colocado o objecto.

NB:Metodos e classes podem ser generics.Acima temos exemplo de uma classe Generics e abaixo um metodo generics

public <T extends Animal> void takeThings(ArrayList<T> list): aqui estamos a dizer que o arraylist levado como parametro vai aceitar elemento do tipo animal ou que herdam a classe animal,<T extends Animal> este trecho e responsavel por fazer isso ser possivel


 */
public class cap11_Generics {
    public static void main(String[] args) {
        ArrayList<Hippo2>list2=new ArrayList<>();
        Hippo2 hip=new Hippo2("Hippo2");
        list2.add(hip);
        ArrayList<Animal>list3=new ArrayList<>();
        teste(list2);
        //teste(list3);//vai dar erro porque o tipo de dado da list3 nao herda do Animal2

    }



    public static <M extends Animal2> void teste(ArrayList<M> list){//adicionei static so para poder testar o codigo sem precisar criar um objecto do tipo cap11
        System.out.println("Lista do tipo:" +list.get(0).getClass());
    }
}

package Java_core;

import java.util.ArrayList;
import java.util.Collections;

public class Aula32_arrayList {
    public static void main(String[] args) {
        //criando um arrayList

        //criando: ArrayList<Tipo de dado(objecto)>nome=new ArrauList<>();
        ArrayList<Integer>list =new ArrayList<>();

        list.add(3);//metodo add()-> para adicionar elementos
        list.add(1);
        list.add(2);

        list.remove(0); //metodo  remove(indice)-> remove um elemento num determinado indice
        list.set(1,4);// metodo set(indice,elemento)-> adiciona um elemento numa determinada posicao
        System.out.println(list.get(1));//metodo get(indice)->retorna o elemento nesse determinado indice
        System.out.println(list.size());//metodo size()-> retorna o tamanho da lista

        Collections.sort(list);// organiza a lista em ordem crescente

        System.out.println(list);//impressao da lista


    }
}

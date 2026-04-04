package Java_core;

import java.util.HashMap;

public class Aula40_hashMap {
    public static void main(String[] args) {
        /*HashMap-> é uma estrutura que armazena dois valores(uma chave e o um valor), os valores podem ser duplicados  mas as chaves são únicas.
        É uma estrutura eficiente

        Criar:
        HashMap<tipo de dado1,tipo de dado2> nome=new HashMap<>();

         */

        HashMap<String,Double>map=new HashMap<>();
        map.put("Maca",10.00);//put(chave,valor)-> usado para adicionar elementos a estrutra
        map.put("Laranja",20.00);
        map.put("Maca",30.00);//vai eliminar o registo acima porque as chaves devem ser únicas

        map.remove("apple");//remove(chave)-> remove um elemento

        System.out.println(map.get("Laranja")); //get(chave)-> retorna o valor dessa chave

        System.out.println(map.containsKey("Laranja"));// containsKey(chave)-> verifica se a chave existe
        System.out.println(map.containsValue(20.00));//containsValue(valor)->verifica se existe o tal valor
        System.out.println(map.size());//size()->retorna o tamanho da estrutura
        System.out.println(map);
        System.out.println(map.keySet());

        for(String key :map.keySet()){// keySet()-> retorna todas das as chaves
            System.out.println(key+ " :$" +map.get(key));
        }
    }
}

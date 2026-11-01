package Head_First_Java_3rd.cap11_estruturasDado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
sort()-> nao pode comparar directamente objectos porque

static <T extends Comparable<? super T>>void sort(List <T> list) ,ou seja, implementa a interface Comparable.

NB:Em generics a keyword "extends" serve para ambos classe e interface

**************************************************************************

A classe comparable tem um metodo chamado compareTo(T object), que retorna -1 quando o objecto e menor, 0 quando  os objectos sao iguais e
1 quando o objecto e maior.
1.Devemos implementar a classe comparable especificando que tipo de objecto queremos comparar
ex: class nome implements Comparable<nomeClasse>
ex: feito na classe song
public class Song implements Comparable<Song>

2.Determinar o que sera comparado no objecto(qual dos atributos sera comparado).


NB:Neste caso o nosso sort usa Comparator por de tras das cenas.sort(List,Comparator)

 */
public class cap11_list_continuacao {
    public static void main(String[] args) {
        new cap11_list_continuacao().go();
    }

    public void go(){
        List<Song> songList=MockSongs2.getSong();
        System.out.println(songList);//output:[somersault, cassidy, $10, havana, Cassidy, 50 ways]
        Collections.sort(songList);
        System.out.println(songList);//output:[$10, 50 ways, Cassidy, cassidy, havana, somersault]
    }
}


class MockSongs2{
    public static List<Song>getSong(){
        //criamos uma List com implementacoes de uma ArrayList
        List<Song>songs=new ArrayList<>();
        songs.add(new Song("somersault","zero 7",147));
        songs.add(new Song("cassidy","grateful dead",158));
        songs.add(new Song("$10","hitchhiker",140));
        songs.add(new Song("havana","cabello",105));
        songs.add(new Song("Cassidy","grateful dead",158));
        songs.add(new Song("50 ways","simon",102));
        return songs;
    }
}

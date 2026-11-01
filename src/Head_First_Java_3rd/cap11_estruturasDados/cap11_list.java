package Head_First_Java_3rd.cap11_estruturasDado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Numa List a ordem em que o elemento foi adicionado e mantida.Para colocar os elementos em ordem usamos o metodo sort(),
este metodo usa unicode, o que quer dizer que os numeros sao ordenados antes da letras maiusculas,letras maiusculas sao ordenadas antes das minusculas, caracteres especiais(alguns sao ordenados antes dos numeros)

como usar:
O metodo sort() deve ser precedido pelo nome da classe:Collections

Collections.sort(lista)
 */
public class cap11_list {
    public static void main(String[] args) {
        new cap11_list().go();
    }

    public void go(){
        List<String>songList=MockSongs.getSongStrings();
        System.out.println(songList);//output:[somersault, cassidy, $10, havana, Cassidy, 50 ways]
        Collections.sort(songList);
        System.out.println(songList);//output:[$10, 50 ways, Cassidy, cassidy, havana, somersault]
    }
}


//esta e uma classe mock, ou seja, uma classe que vai ser utilizada por outra classe
class MockSongs{
    public static List<String>getSongStrings(){
        //criamos uma List com implementacoes de uma ArrayList
        List<String>songs=new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("Cassidy");
        songs.add("50 ways");
        return songs;
    }

}
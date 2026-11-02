package Head_First_Java_3rd.cap11_estruturas_dado;

import java.util.Collections;
import java.util.List;

public class Sorting1 {
    public static void main(String[] args) {
    new Sorting1().go();
    }
    public void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        /*
        Collections.sort(estrutura)-> organiza os elementos em ordem alfabetica.Este método nao funciona para objectos
        Java usa unicode para fazer essa ordenacao, onde primeiro ordena-se os números,letras maiúsculas,letras minúsculas.
        NB:Alguns caracteres especiais antes de números e alguns depois deles.

         */
    }
}

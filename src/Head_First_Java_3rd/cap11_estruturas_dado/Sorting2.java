package Head_First_Java_3rd.cap11_estruturas_dado;

import java.util.Collections;
import java.util.List;

public class Sorting2 {
    public static void main(String[] args) {
        new Sorting2().go();
    }
    public void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

}
  /*
    public static <T extends Comparable<? super T>> void sort(List<T> list), documentacao de Collections.sort()

    T extends Comparable-> T deve ser um subtipo de Comparable.
    super T-> significa que o Comparable deve ser do tipo T ou um dos supertipos de T.
    List<T> list-> T deve estender ou implementar comparable.

    NB: Na documentaçao da String é possível notar que a classe String implementa Comparable por isso nao tivemos problemas na classe Sorting1.

    Mas por que aparece extends Comparable na notacao acima enquanto  Comparable é uma interface?
    R: Foi a convensao escolhida, que quer dizer estende ou implementa Comparablr.
     */

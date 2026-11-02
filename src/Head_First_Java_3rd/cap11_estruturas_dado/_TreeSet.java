package Head_First_Java_3rd.cap11_estruturas_dado;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class _TreeSet {
    public static void main(String[] args) {
        new _TreeSet().go();
    }

    public void go() {
        List<SongV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<SongV4> songSet = new TreeSet<>(songList);//o HashSet recebe uma estrutura como argumento
        System.out.println(songSet);

    }
}
/*
NB:TreeSet evita duplicados e também coloca os elementos deve forma ordenada.Devemos usar Comparable ou Comparator para a ordenacao.
 */
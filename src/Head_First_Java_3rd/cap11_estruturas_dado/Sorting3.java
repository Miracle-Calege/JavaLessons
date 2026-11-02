package Head_First_Java_3rd.cap11_estruturas_dado;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting3 {
    public static void main(String[] args) {
        new Sorting3().go();
    }

    public void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
        Collections.sort(songList);//aqui ainda estamos a usar o Comparable
        System.out.println(songList);
        ArtistCompare artistCompare = new ArtistCompare();//criamos uma instancia da classe que implementa a interface Comparator
        songList.sort(artistCompare);//NB:Aqui a estrutura é que invoca o método sort() e implementa a ordenacao em relacao ao objecto criado acima.Aqui estamos a usar o Comparator
        System.out.println(songList);
    }
}
    class ArtistCompare implements Comparator<SongV2> {//criamos uma classe e implementamos a interface Comparator
        public int compare(SongV2 one, SongV2 two) {//implementamos o metodo compare que leva 2 argumentos
            return one.getArtist().compareTo(two.getArtist());
        }
    }
    //NB:A vantagem desta abordagem é que podemos criar variar forma de ordenaçao basta criar mais classes e implementar no metodo sort.

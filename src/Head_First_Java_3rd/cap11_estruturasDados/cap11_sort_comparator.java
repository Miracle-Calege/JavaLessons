package Head_First_Java_3rd.cap11_estruturasDado;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//quando usamos o comparator a lista e que chama o metodo sort()

public class cap11_sort_comparator {
    public static void main(String[] args) {
        new cap11_sort_comparator().go();
    }

    public void go(){
        List<Song> songList=MockSongs2.getSong();
        System.out.println(songList);
        Collections.sort(songList);//organizado por titulo-mesmo procedimento do cap11_list_continuacao
        System.out.println(songList);

    ArtistCompare artistCompare=new ArtistCompare();//criamos uma instancia da class Comparator
    songList.sort(artistCompare);//invocamos o metodo sort() que leva como argumento o nosso Objecto Comparator.
        System.out.println(songList);//organizado por artista
    }

}

class ArtistCompare implements Comparator<Song>{

    public int compare(Song one, Song two){
        return one.getArtista().compareTo(two.getArtista());
    }
}
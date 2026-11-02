package Head_First_Java_3rd.cap11_estruturas_dado;

import java.util.Comparator;
import java.util.List;

public class Sorting3_Comparator {
    public static void main(String[] args) {
        new Sorting3_Comparator().go();
    }
    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        ArtistCompares artistCompare = new ArtistCompares();
        songList.sort(artistCompare);
        System.out.println(songList);
    }
}
class TitleCompare implements Comparator<SongV3> {
    public int compare(SongV3 one, SongV3 two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}
class ArtistCompares implements Comparator<SongV3> {
    public int compare(SongV3 one, SongV3 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}


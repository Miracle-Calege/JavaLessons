package Head_First_Java_3rd.cap11_estruturas_dado;

public class SongV2 implements Comparable<SongV2>{//implementamos a interface Comparable  e entre <> colocamos SongV3 porque queremos comparar objectos SongV3 entre si.
    private String title;
    private String artist;
    private int bpm;

    @Override
    public int compareTo(SongV2 s) {//A interface tem um método, compareTo que recebe um argumento que é comparado com o objecto actual. Retorna um valor inteiro, retorna um valor negativo se o objecto actual for menor que o argumento, retorna zero se forem iguais e retorna um valor positivo se o objecto actual for maior que o argumento.
        return title.compareTo(s.getTitle());
    }
    SongV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getBpm(){
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }
}

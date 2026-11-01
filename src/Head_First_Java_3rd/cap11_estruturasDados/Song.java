package Head_First_Java_3rd.cap11_estruturasDado;

public class Song implements Comparable<Song> {//isso quer dizer que um objecto do tipo Song so pode ser comparado ao outro do tipo song
    private String titulo;
    private String artista;
    private int bpm;

    Song(String titulo,String artista, int bpm){
        this.titulo=titulo;
        this.artista=artista;
        this.bpm=bpm;
    }
    public  String getTitulo(){
        return titulo;
    }
    public String getArtista(){
        return artista;
    }
    public int getBpm(){
        return bpm;
    }
    public String toString(){
        return titulo;
    }
    public int compareTo(Song s){
        return titulo.compareTo(s.getTitulo());//compara o titulo actual com o titulo do objecto passado como argumento
    }
}

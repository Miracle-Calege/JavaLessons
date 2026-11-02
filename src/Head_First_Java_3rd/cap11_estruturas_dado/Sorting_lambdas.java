package Head_First_Java_3rd.cap11_estruturas_dado;

import java.util.List;

public class Sorting_lambdas {
    public static void main(String[] args) {
        new Sorting_lambdas().go();
    }
    public void go(){
        List<SongV3> songList=MockSongs.getSongsV3();
        System.out.println(songList);

        songList.sort((one,two)->one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        songList.sort((one,two)->one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);
        //Basicamente passamos os argumentos da classe que implementaria o comparator

    }



    /*
    SAM(Single Abstract methods)-> tambem conhecidas por interfaces funcionais , sao interfaces com um único método que invés que criarmos uma classe para a implementar
    podemos usar expressoes lambda.
     */
}

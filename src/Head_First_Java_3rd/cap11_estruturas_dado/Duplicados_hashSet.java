package Head_First_Java_3rd.cap11_estruturas_dado;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicados_hashSet {
    public static void main(String[] args) {
        new Duplicados_hashSet().go();
    }

    public void go() {
//        List<SongV3> songList = MockSongs.getSongsV3();
//        System.out.println(songList);
//
//        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
//        System.out.println(songList);
//
//        Set<SongV3> songSet = new HashSet<>(songList);//o HashSet recebe uma estrutura como argumento
//        System.out.println(songSet);
        List<SongV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);

        Set<SongV4> songSet = new HashSet<>(songList);//o HashSet recebe uma estrutura como argumento
        System.out.println(songSet);

    }
}
/*
Podemos notar que mesmo usando Set os duplicados nao foram removidos. Isso nos faz questionar:
Quando é que um elemento é igual ao outro?

1.Igualdade de referência:
Quando temos duas referências apontandoi para o mesmo objecto na heap(terao o mesmo endereço de memória).Sec chamarmos o metodo hashcode() veremos que o valor é o mesmo.

ex: song1==song2 -> vai retornar um valor booleano.

2.Igualdade de objectos:

Podemos considerar que os objectos sao iguais se tiver um atributo com o mesmo valor mas para isso temos que sobrescrever os métodos hashcode() e equals().

Como o HashSet verifica duplicados?

O HashSet pega o hashCode do Objecto que está para entrar na estrutura e compara com os demais, se o hashcode for diferente assume que o objecto é novo.
Mas se os hashCodes forem iguais a estrutura vai chamar o método equals() para verificar se sao mesmo iguais.


NB:1.Objectos podem ter o mesmo hashCode e nao serem iguais, mas se forem iguais devem ter o mesmo hashcode.
   2.Se sobrescrevermos equals() devemos sobreescrever hashcode()
   3.Por defeito cada objecto receber um valor inteiro único, se nao sobrescrevermos o hashCode() nunca teremos objectos iguais
   4.Por defeito equals() comporta-se como ==

   NB:É possível que vários objectos tenham o mesmo valor que deveria ser único devido ao hashing algorithm, por isso o equals() é importante.
 */
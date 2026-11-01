package Head_First_Java_3rd.cap11_estruturasDado;

/*
para interface com um metodo, conhecidas como single abstract method(sam) ou functional interface, inves de criarmos uma classe para sua implementacao
podemos recorrer ao lambas.

Para o nosso caso em que estamos a implementar a classe comparator, a estrutura seria a seguinte:

lista.sort((arg1,arg2)-> arg1.variavel.compareTo(arg2.variavel))
NB:(ar1,arg2)-> referencem-se aos argumentos do metodo compare(), aqui nao precisamos especificar o tipo de dado, apos os argumentos colocamos uma seta "->" que indica as intrucoes que serao executada


 */

import java.util.List;

public class cap11_functionalInterfaces {
    public static void main(String[] args) {
        new cap11_functionalInterfaces().go();
    }

    public void go(){
        List<Song> songList=MockSongs2.getSong();
        System.out.println(songList);
    songList.sort((one,two)->one.getTitulo().compareTo((two.getTitulo())));
        System.out.println(songList);
        songList.sort((one,two)->one.getArtista().compareTo((two.getArtista())));
        System.out.println(songList);

    }

}

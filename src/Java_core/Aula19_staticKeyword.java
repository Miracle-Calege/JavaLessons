package Java_core;

public class Aula19_staticKeyword {
    public static void main(String[] args) {
         /*static-> faz com que a variavel ou metodo pertenca somente a classe, e para acessa-los usamos o nome da classe
            para criar variaveis/metodos ->colocamos o static antes do tipo de dado
            Uma variavel do tipo static e partilhada em todas as instancias(na criacao de objectos), ou seja, toda ou qualquer alteracao feita sera partilhada por todas as instancias
          */

        Amigo amigo1=new Amigo("Siswe");
        Amigo amigo2=new Amigo("Miracle");
//        System.out.println(amigo1.numAmigos); como estamos a rastrear a quantidade total de amigos que foram criados, nao devemos usar um objecto especifico para acessar o numero de amigos mas sim o nome da classe
//        System.out.println(amigo2.numAmigos);
        //System.out.println(Amigo.numAmigos);


    }
}

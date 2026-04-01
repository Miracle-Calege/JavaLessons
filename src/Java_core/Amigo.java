package Java_core;

public class Amigo {
    String nome;
    //int numAmigos;//sempre que criarmos um objecto do tipo amigo, ele tera um nome e numero de amigos(numAmigos), mas o numero de amigos sempre sera 1 para cada objcto desse tipo
    static int numAmigos;//usando o static, ele mantera registo de todos os "amigos" que os objectos tem(ele vai somar a quantidade total de amigos de foram criados)
    public Amigo(String nome){
        this.nome=nome;
        numAmigos++;
    }

    public static void exibirAmigos(){
        System.out.println("Tu tens um total de "+numAmigos+" amigos");
    }
}

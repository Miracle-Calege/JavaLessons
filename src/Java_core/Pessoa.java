package Java_core;

public class Pessoa {
    String nome;
    String  apelido;

    public Pessoa(String nome, String apelido){
        this.nome=nome;
        this.apelido=apelido;
    }
    public void exibirNome(){
        System.out.println(this.nome+" "+this.apelido);
    }

}

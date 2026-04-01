package Java_core;

public class Biblioteca {
    String nome;
    int ano;
    Livro[]livros;

    public Biblioteca(String nome, int ano, Livro[]livros){
        this.nome=nome;
        this.ano=ano;
        this.livros=livros;
    }

    public void exibirDescricao(){
        System.out.println(this.nome+" "+this.ano);
        System.out.println("Livros disponiveis");
        for(Livro livro:livros){
            System.out.println(livro.exibirDescricao());
        }
    }
}

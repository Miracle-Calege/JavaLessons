package Java_core;

public class Livro {
    String titulo;
    int paginas;

    public Livro(String titulo,int paginas){
        this.titulo=titulo;
        this.paginas=paginas;
    }

    public String exibirDescricao(){
        return this.titulo+" "+"(" + this.paginas + ") " + " paginas";
    }
}

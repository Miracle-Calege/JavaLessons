package Java_core;

public class Aula29_aggregation {
    public static void main(String[] args) {
        /*Representa uma relacao entre objectos, um objecto contem o um outro
        mas o objecto contido pode existir de forma independente
         */

        Livro livro1 = new Livro("Pai rico,pai pobre", 900);
        Livro livro2 = new Livro("Como fazer amigos e influencer pessoas", 600);
        Livro livro3 = new Livro("A retorica", 148);

        Livro[] livros = {livro1, livro2, livro3};

        Biblioteca biblioteca=new Biblioteca("Brazzau Mazula",2015,livros);
        biblioteca.exibirDescricao();

//        for (Livro livro : livros) {
//            System.out.println(livro.exibirDescricao());
//        }

    }
}

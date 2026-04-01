package Java_core;

public class Aula16_constructor {
    public static void main(String[] args) {
        Estudante estudante1=new Estudante("Miracle Calege",20,20);//new Estudante()-> e o construtor na classe estudante, logo ao passarmos os atributos nele devemos obedecer a ordem dos parametros na classe Estudante
        Estudante estudante2=new Estudante("Siswe Calege",23,29);

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.pontuacao);
        System.out.println(estudante1.matriculado);
        estudante1.estudar();

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.pontuacao);
        System.out.println(estudante2.matriculado);
        estudante2.estudar();
    }
}

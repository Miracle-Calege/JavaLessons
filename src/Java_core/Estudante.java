package Java_core;

public class Estudante {
    String nome;
    int idade;
    double pontuacao;
    boolean matriculado;

    public Estudante(String nome,int idade,double pontuacao){//constructor e um metodo com o mesmo nome da classe que nos permite inicializar os atributos, este metodo geralmente leva parametros se o fim for inicializar os atributos
        this.nome=nome;//this-> usado para especificar que estamos a referir ao atributo principalmente se os parametros do constructor tiverem o mesmo nome que os atributos
        this.idade=idade;
        this.pontuacao=pontuacao;
        matriculado=true;//nao e obrigatorio que todos os atributos sejam inicializados pelos parametros do constructor
    }

    void estudar(){
        System.out.println(this.nome+" esta a estudar");
    }
}

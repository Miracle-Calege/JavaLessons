package Java_core;

public class Aluno extends Pessoa {

    double gpa;

    public Aluno(String nome,String apelido,double gpa){
     super(nome,apelido);// a classe aluno herda os atributos nome e apelido sendo que o constructor da classe pai ja inicializa esse atributos usamos a keyword super() que levara como parametro esses atributos
     this.gpa=gpa;
    }

    public  void exibaGpa(){
        System.out.println("o gpa do(a) "+this.nome+" e "+this.gpa);
    }

}

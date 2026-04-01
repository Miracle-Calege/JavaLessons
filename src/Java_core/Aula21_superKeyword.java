package Java_core;

public class Aula21_superKeyword {
    public static void main(String[] args) {
     /*super=refere-se a classe pai(super classe),usado em constructores para chamar o constructor da classe pai para inicializar atributos
      */

        Pessoa pessoa=new Pessoa("Miracle","Calege");
        Aluno aluno=new Aluno("Siswe","Calege",5.5);
       Funcionario funcionario=new Funcionario("Sebas","Sebito",5000);
//        aluno.exibirNome();
//        aluno.exibaGpa();
        funcionario.exibirSalario();
    }
}

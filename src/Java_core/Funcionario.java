package Java_core;

public class Funcionario extends Pessoa {
    int salario;

    public Funcionario(String nome,String apelido,int salario){
        super(nome,apelido);
        this.salario=salario;
    }

    public  void exibirSalario(){
        System.out.println("O salario do(a) "+this.nome+ " e "+this.salario);
    }
}

package Head_First_Java_3rd;

public class Hippo extends Animal{
    public Hippo(){
        //super();De forma implicita o compilador coloca um super() que herda o constructor da superclasse.NB:O super() e chamado porque a criacao do objecto Hippo depende do objecto Animal e o constructor da classe animal nao leva nenhum parametro/argumento por isso o super() e implicito
        //sendo assim a primeira instrucao a ser executada e do super()-> do constructor da classe Animal
        //ou seja, primeiro constroe-se a super classe e depois a classe filha.Por isso o super() deve ser a primeira instrucao em cada constructor herdeiro.
        System.out.println("Criando um hippo");
    }
}

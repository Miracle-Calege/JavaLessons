package Head_First_Java_3rd;

public class Snop {
    int tamanho;
    String nome;

    void latir() {//podemos determinar o comportamento de um metodo usando as variaveis de instancia
        if (tamanho > 60) {
            System.out.println("woof woof");
        } else if (tamanho > 14) {
            System.out.println("Ruff Ruff");
        } else {
            System.out.println("Yip! yip!");
        }
    }

    /*
    E possivel passar argumentos/parametros ao argumento para determinar o seu comportamento
    parametros: e o tipo de dado e o nome da variavel que colocamos na construcao do metodo.
    ex. metodo (tipo de dado variavel){}
    argumento: e o valor correspondente aquele tipo de dado que colocamos na chamada do metodo
    ex: metodo(valor)
    NB:O metodo pode levar mais de um argumento/parametro desde que sejam separados por virgula

    *****************************************
    Metodos com retorno
    Um metodo pode retornar um tipo primitivo, referencia do objecto ou nao retornar nada (void).
    Criar um metodo com retorno: tipo de retorno(dado) nome(){return valor}
    ex:int idade(){
    return 10;// estaria errado return 10.5 porque 10.5 nao faz parte do int.
    }
    NB: E importante que o valor retornado seja compativel com o tipo de retorno declarado na criacao do metodo.O return so retorna um valor

     */
    void bark(int num) {//parametro
        while (num > 0) {
            System.out.println("ruff");
            num -= 1;
        }
    }
}


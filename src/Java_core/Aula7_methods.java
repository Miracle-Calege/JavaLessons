package Java_core;

public class Aula7_methods {
    public static void main(String[] args) {
        //method= um bloco de codigo reutilizavel que pode ser executado quando chamado

        /* inves de repetirmos essas linhas de codigo, podemos fazer um metodo que faz isso
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday dear you");
        System.out.println("You are x years old!");
        System.out.println("Happy birthday to you\n");
        */
        String nome="Miracle Calege";
        int idade=20;
        happyBirthday(nome,idade);//para chamar um metodo directamente(so escrever o nome do metodo) no main, esse metodo deve ser static
        //na hora de colocar valores nos metodo(na hora que chamamos no main) eles chamam-se argumentos
        // a ordem de insercao dos elementos deve ser a mesma que esta disposta nos parametros(se na construcao do metodo primeiro vem nome e depois idade, na inicializacao tambem deve se seguir essa sequencia)

        System.out.println(square(2));
    }

    /* um metodo deve ter um nome descritivo;
        deve ter um tipo de retorno void(nao retorna nada), int,double,String, etc
        podem levar parametro/argumentos
     fluxo: tipo de retorno nome(parametros(opcional)){};
     os metodos devem ser criados fora do metodo main

     */

  static   void happyBirthday(String nome,int idade){//na hora da construcao do metodo, o que fica entre o constructor(parenteses), chama-se parametros
        // os parametros tem um tipo de dado e nome e sao separados por virgula","
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s\n",nome);
        System.out.printf("You are %d years old!\n",idade);
        System.out.println("Happy birthday to you\n");
    }

    static double square(double num){
      return num*num;//metodos com retorno diferentes de void , terminam com a keyword return e o valor a ser retornado
    }
}
